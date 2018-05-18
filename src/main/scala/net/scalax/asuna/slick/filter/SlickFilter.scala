package play.api.libs.circe

import slick.ast.BaseTypedType

trait SlickFilterImpl[D] {
  import slick.lifted.Rep
  type OptionDataType
  val basedTypedType: BaseTypedType[OptionDataType]
  val covertToBoolean: Rep[D] => Rep[Option[OptionDataType]]
  val covertData: D => Option[OptionDataType]
}

object SlickFilterImpl {

  implicit def baseColumnFilterColExt[D](implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SlickFilterImpl[D] = {
    import profile.api._
    new SlickFilterImpl[D] {
      override type OptionDataType = D
      override val basedTypedType = b
      override val covertToBoolean = { (rep: Rep[D]) => rep.? }
      override val covertData = { (data: D) => Option(data) }
    }
  }

  implicit def optionColumnFilterColExt[D](implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SlickFilterImpl[Option[D]] = {
    import profile.api._
    new SlickFilterImpl[Option[D]] {
      override type OptionDataType = D
      override val basedTypedType = b
      override val covertToBoolean = { (rep: Rep[Option[D]]) => rep }
      override val covertData = { (data: Option[D]) => data }
    }
  }

}