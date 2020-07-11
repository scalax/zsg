package zsg.json.model.case_class

object BenchmarkModel {
  val foo = Foo(
    i1 = 404,
    i2 = "init string",
    i3 = "init string",
    i4 = "init string",
    i5 = 2358,
    i6 = "init string",
    i7 = "init string",
    i8 = 36296,
    i9 = "init string",
    i10 = 2322,
    i11 = "init string",
    i12 = "2333"
  )

  val bar = Bar(i1 = BenchmarkModel.foo)
}
