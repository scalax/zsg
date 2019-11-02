package org.scalax.asuna.circe.encoder.test

case class Foo(
  i1: Int,
  i2: String,
  i3: String,
  i4: String,
  i5: String,
  i6: String,
  i7: String,
  i8: String,
  i9: String,
  i10: String,
  i11: String,
  i12: String
)

case class Bar(i1: Foo)

object Model {
  val foo = Foo(
    i1 = 404,
    i2 = "init string",
    i3 = "init string",
    i4 = "init string",
    i5 = "init string",
    i6 = "init string",
    i7 = "init string",
    i8 = "init string",
    i9 = "init string",
    i10 = "init string",
    i11 = "init string",
    i12 = "2333"
  )

  val bar = Bar(i1 = Model.foo)
}
