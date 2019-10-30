package asuna {

  import asuna.support.heterogeneous._

  trait AsunaTuple0 extends HList {
    self =>

    override type Head = NoData
    override def head: NoData = NoData.value
    override type Tail = AsunaTuple0
    override def tail: AsunaTuple0 = AsunaTuple0
    override type Append[H] = AsunaTuple1[H]
    override def ::[H](h: H): AsunaTuple1[H] = new AsunaTuple1(h)

  }
  object AsunaTuple0 extends AsunaTuple0
}
