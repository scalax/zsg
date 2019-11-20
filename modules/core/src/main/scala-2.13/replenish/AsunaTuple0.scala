package asuna {

  import asuna.support.heterogeneous._

  final class AsunaTuple0 extends HList {
    self =>

    override final type Head = NoData
    override final def head: NoData = NoData.value
    override final type Tail = AsunaTuple0
    override final def tail: AsunaTuple0 = self
    override final type Append[H] = AsunaTuple1[H]
    override final def ::[H](h: H): AsunaTuple1[H] = new AsunaTuple1(h)

  }
  object AsunaTuple0 {
    final val value: AsunaTuple0 = new AsunaTuple0
  }
}
