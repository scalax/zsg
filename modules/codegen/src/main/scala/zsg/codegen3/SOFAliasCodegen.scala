package zsg.codegen3

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object SOFAliasCodegen {

  case class NameType(name: String)

  val rootDir     = Paths.get(".", "modules", "core", "src", "main", "scala", "zsg", "codegen3")
  val rootTestDir = Paths.get(".", "modules", "core", "src", "test", "scala", "zsg", "codegen3")

  def toAliasType(count: Int): String = {
    val s = SystemOfNumeration.init6(NameType("T1"), NameType("T2"), NameType("T3"), NameType("T4"), NameType("T5"), NameType("T6"))
    val b = if (count <= 6) s else (7 to count).foldLeft(s)((x, y) => x.next(NameType(s"T${y}")))
    def in(bb: SystemOfNumeration[NameType]): String = bb match {
      case P_3_Step_1(_1_th, _2_th, _1, _2)            => s"P_3_Step_1[${_1_th.name}, ${_2_th.name}, ${in(_1)}, ${in(_2)}]"
      case P_3_Step_2(_1_th, _2_th, _1, _2)            => s"P_3_Step_2[${_1_th.name}, ${_2_th.name}, ${in(_1)}, ${in(_2)}]"
      case S_0(_0_th)                                  => s"S_0[${_0_th.name}]"
      case S_1(_0_th, _1_th)                           => s"S_1[${_0_th.name}, ${_1_th.name}]"
      case S_2(_0_th, _1_th, _2_th)                    => s"S_2[${_0_th.name}, ${_1_th.name}, ${_2_th.name}]"
      case I_0(_0_th, _1_th, _2_th, _0)                => s"I_0[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}]"
      case I_0_To_1(_0_th, _1_th, _2_th, _0)           => s"I_0_To_1[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}]"
      case I_1(_0_th, _1_th, _2_th, _0, _1)            => s"I_1[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}]"
      case I_1_To_2(_0_th, _1_th, _2_th, _0, _1)       => s"I_1_To_2[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}]"
      case I_2_Step_0(_0_th, _1_th, _2_th, _0, _1, _2) => s"I_2_Step_0[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)}]"
      case I_2_Step_1(_0_th, _1_th, _2_th, _0, _1, _2) => s"I_2_Step_1[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)}]"
      case I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, _2) => s"I_2_Step_2[${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)}]"
    }
    in(b)
  }

  def initModel(count: Int): String = {
    val s = SystemOfNumeration.init6(NameType("t1"), NameType("t2"), NameType("t3"), NameType("t4"), NameType("t5"), NameType("t6"))
    val b = if (count <= 6) s else (7 to count).foldLeft(s)((x, y) => x.next(NameType(s"t${y}")))
    def in(bb: SystemOfNumeration[NameType]): String = bb match {
      case P_3_Step_1(_1_th, _2_th, _1, _2)            => s"new P_3_Step_1(${_1_th.name}, ${_2_th.name}, ${in(_1)}, ${in(_2)})"
      case P_3_Step_2(_1_th, _2_th, _1, _2)            => s"new P_3_Step_2(${_1_th.name}, ${_2_th.name}, ${in(_1)}, ${in(_2)})"
      case S_0(_0_th)                                  => s"new S_0(${_0_th.name})"
      case S_1(_0_th, _1_th)                           => s"new S_1(${_0_th.name}, ${_1_th.name})"
      case S_2(_0_th, _1_th, _2_th)                    => s"new S_2(${_0_th.name}, ${_1_th.name}, ${_2_th.name})"
      case I_0(_0_th, _1_th, _2_th, _0)                => s"new I_0(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)})"
      case I_0_To_1(_0_th, _1_th, _2_th, _0)           => s"new I_0_To_1(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)})"
      case I_1(_0_th, _1_th, _2_th, _0, _1)            => s"new I_1(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)})"
      case I_1_To_2(_0_th, _1_th, _2_th, _0, _1)       => s"new I_1_To_2(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)})"
      case I_2_Step_0(_0_th, _1_th, _2_th, _0, _1, _2) => s"new I_2_Step_0(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)})"
      case I_2_Step_1(_0_th, _1_th, _2_th, _0, _1, _2) => s"new I_2_Step_1(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)})"
      case I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, _2) => s"new I_2_Step_2(${_0_th.name}, ${_1_th.name}, ${_2_th.name}, ${in(_0)}, ${in(_1)}, ${in(_2)})"
    }
    in(b)
  }

  def main(i: Array[String]): Unit = {
    val list = (6 to 253).to(List).grouped(5).to(List)
    Files.createDirectories(rootDir)
    for (i <- list) yield {
      val filePath1 = rootDir.resolve(s"SOFAlias${i.head}.scala")
      Using(new PrintWriter(filePath1.toFile, "utf-8")) { writer =>
        val content = zsg.codegen.StringUtil.trimLines(zsg.codegen3.son.txt.SystemOfNumerationTypeAliasItem(i.head)(i.last).body)
        writer.println(content)
      }
    }
    val filePath2 = rootDir.resolve(s"SOFAlias.scala")
    Using(new PrintWriter(filePath2.toFile, "utf-8")) { writer =>
      val content = zsg.codegen.StringUtil.trimLines(zsg.codegen3.son.txt.SystemOfNumerationTypeAlias(list.map(_.head)).body)
      writer.println(content)
    }
    val filePath3 = rootTestDir.resolve(s"TypeConfirm.scala")
    Files.createDirectories(rootTestDir)
    Using(new PrintWriter(filePath3.toFile, "utf-8")) { writer =>
      val content = zsg.codegen.StringUtil.trimLines(zsg.codegen3.son.txt.SystemOfNumerationTypeTest().body)
      writer.println(content)
    }
  }

}
