package asuna.macros

import asuna._

import scala.language.experimental.macros

trait DefaultValue[T] {
  def value: Option[T]
}

object DefaultValue {
  def model[Model]: DefaultValueApply[Model] = new DefaultValueApply[Model]

  class DefaultValueApply[Model] {
    def to[R](m: Model => R)(o: => Option[R]): DefaultValue[R] = {
      new DefaultValue[R] {
        override def value: Option[R] = o
      }
    }
  }
}

trait AsunaDefaultValueGeneric[H, DefaultValueType] {
  def defaultValues: ContextContent[DefaultValueType]
}

object AsunaDefaultValueGeneric {

  def init[M]: AsunaDefaultValueGenericApply[M] = new AsunaDefaultValueGenericApply[M] {}

  trait AsunaDefaultValueGenericApply[M] {
    def defaultValue[N](dfv: ContextContent[N]): AsunaDefaultValueGeneric[M, N] = new AsunaDefaultValueGeneric[M, N] {
      override def defaultValues: ContextContent[N] = dfv
    }
  }

  implicit def appendMacroImpl[H, II]: AsunaDefaultValueGeneric[H, II] = macro AsunaDefaultValueGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaDefaultValueGenericCodeGenSample {

  case class Test10(
    i1: String,
    i2: Int,
    i3: Int,
    i4: Long,
    i5: String = "Test10-i5",
    i6: List[String] = List.empty,
    i7: Long,
    i8: Option[Long],
    i9: List[Long],
    i10: String
  )

  val genResult
    : AsunaDefaultValueGeneric[Test10, Item2[Item8[DefaultValue[String], DefaultValue[Int], DefaultValue[Int], DefaultValue[Long], DefaultValue[String], DefaultValue[
      List[String]
    ], DefaultValue[Long], DefaultValue[Option[Long]]], Item2[DefaultValue[List[Long]], DefaultValue[String]]]] = {
    val defaultValue = DefaultValue.model[Test10]

    AsunaDefaultValueGeneric
      .init[Test10]
      .defaultValue(
        BuildContent.nodeItem2(
          BuildContent.item8(
            defaultValue.to(_.i1)(Option.empty),
            defaultValue.to(_.i2)(Option.empty),
            defaultValue.to(_.i3)(Option.empty),
            defaultValue.to(_.i4)(Option.empty),
            defaultValue.to(_.i5)(Some(Test10.apply$default$5: String)),
            defaultValue.to(_.i6)(Some(Test10.apply$default$6: List[String])),
            defaultValue.to(_.i7)(Option.empty),
            defaultValue.to(_.i8)(Option.empty)
          ),
          BuildContent.item2(defaultValue.to(_.i9)(Option.empty), defaultValue.to(_.i10)(Option.empty))
        )
      )
  }

}

object AsunaDefaultValueGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaDefaultValueGeneric[H, M]] = {
      try {
        val h           = c.weakTypeOf[H]
        val hType       = h.resultType
        val hTypeSymbol = h.typeSymbol
        val hCompanion  = hTypeSymbol.companion
        val apply       = hCompanion.typeSignature.decl(TermName("apply")).asMethod

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val proTypeTag =
          apply.paramLists.head.map(_.asTerm).zipWithIndex.map {
            case (p, i) =>
              if (!p.isParamWithDefault) q"""asuna.macros.DefaultValue.model[${hType}].to(_.${p.name})(Option.empty)"""
              else {
                val getterName = TermName("apply$default$" + (i + 1))
                q"""asuna.macros.DefaultValue.model[${hType}].to(_.${p.name})(Some($hCompanion.$getterName))"""
              }
          }

        val nameTag = proTypeTag.grouped(8).toList.map(s => q"""asuna.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaDefaultValueGeneric[H, M]] {
          q"""asuna.macros.AsunaDefaultValueGeneric.init[${hType}].defaultValue(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
