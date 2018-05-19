package net.scalax.umr

import slick.lifted.ShapedValue

object MappedShape {

  trait SetHelper[M] {
    def value(value: M): ShapeValueWrap[Placeholder]
  }

  def set[U](wrap: ShapeValueWrap[U]): SetHelper[U] = {
    new SetHelper[U] {
      override def value(t: U): ShapeValueWrap[Placeholder] = {
        wrap.map[Placeholder]({ (s: U) =>
          Placeholder: Placeholder
        }, (s: Placeholder) => Option(t))
      }
    }
  }

}
/*object ChangeList {

  import slick.jdbc.H2Profile.api._

  def apply(
    list: ShapeValueWrap[Placeholder]*): ShapedValue[Any, Placeholder] = {
    val mappedValue = ListShape(list: _*)
    mappedValue
      .<>[Placeholder](
        _ => (Placeholder: Placeholder),
        _ => Option(List.fill(list.size)(Placeholder: Placeholder)))
      .shaped
      .asInstanceOf[ShapedValue[Any, Placeholder]]
  }

}*/ 