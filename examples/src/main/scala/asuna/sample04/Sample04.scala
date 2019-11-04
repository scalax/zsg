package asuna.sample01_append

import scala.language.higherKinds

object Sample04 {

  class MMA[T, R <: MMA[_, _]]

  //type EndMMA = MMA[NoData, EndMMA]

  type B = MMA[String, MMA[Int, MMA[Long, EndMMA]]]

  class NoData

  class EndMMA extends MMA[NoData, EndMMA]

}
