package asuna {

  import asuna.support.heterogeneous._

  class AsunaTuple0 extends HList {
    self =>

    override type Head = NoData
    override def head: NoData = NoData.value
    override type Tail = AsunaTuple0
    override def tail: AsunaTuple0 = self
    override type Append[H] = AsunaTuple1[H]
    override def ::[H](h: H): AsunaTuple1[H] = new AsunaTuple1(h)

  }
  object AsunaTuple0 {
    val value: AsunaTuple0 = new AsunaTuple0
  }
}
