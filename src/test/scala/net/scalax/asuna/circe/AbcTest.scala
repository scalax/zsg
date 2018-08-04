package net.scalax.asuna.circe

object AbcTest extends CirceAsunaEncoderHelper with App {

  case class LargeModel(
    i1: String = "init string",
    i2: String = "init string",
    i3: String = "init string",
    i4: String = "init string",
    i5: String = "init string",
    i6: String = "init string",
    i7: String = "init string",
    i8: String = "init string",
    i9: String = "init string",
    i10: String = "init string",
    i11: String = "init string",
    i12: String = "2333",
    i13: String = "init string",
    i14: String = "init string",
    i15: String = "init string",
    i16: String = "init string",
    i17: String = "init string",
    i18: String = "init string",
    i19: String = "init string",
    i20: String = "init string",
    i21: String = "init string",
    i22: String = "init string",
    i23: String = "init string",
    i24: String = "init string",
    i25: String = "init string",
    i26: String = "init string",
    i27: String = "init string",
    i28: String = "init string",
    i29: String = "init string",
    i30: String = "init string",
    i31: String = "init string",
    i32: String = "init string",
    i33: String = "init string",
    i34: String = "init string",
    i35: String = "init string",
    i36: String = "init string",
    i37: String = "init string",
    i38: String = "init string",
    i39: String = "init string",
    i40: String = "init string",
    i41: String = "init string",
    i42: Int = 2333,
    i43: String = "init string",
    i44: String = "init string",
    i45: String = "init string",
    i46: String = "init string",
    i47: String = "init string",
    i48: String = "init string",
    i49: String = "init string",
    i50: String = "init string",
    i51: String = "init string",
    i52: String = "init string",
    i53: String = "init string",
    i54: String = "init string",
    i55: String = "init string",
    i56: Int = 4567,
    i57: String = "init string",
    i58: String = "init string",
    i59: String = "init string",
    i60: String = "init string",
    i61: String = "init string",
    i62: String = "init string",
    i63: String = "init string",
    i64: String = "init string",
    i65: String = "init string",
    i66: String = "init string",
    i67: String = "init string",
    i68: String = "init string",
    i69: String = "init string",
    i70: String = "init string",
    i71: String = "init string",
    i72: String = "init string",
    i73: String = "init string",
    i74: String = "init string",
    i75: String = "init string",
    i76: String = "init string",
    i77: String = "init string",
    i78: String = "init string",
    i79: String = "init string",
    i80: String = "init string",
    i81: String = "init string",
    i82: String = "init string",
    i83: String = "init string",
    i84: String = "init string",
    i85: String = "init string",
    i86: String = "init string",
    i87: String = "init string",
    i88: String = "init string",
    i89: String = "init string",
    i90: String = "init string",
    i91: String = "init string",
    i92: String = "init string",
    i93: String = "init string",
    i94: Int = 8910,
    i95: String = "init string",
    i96: String = "init string",
    i97: String = "init string",
    i98: String = "init string",
    i99: String = "init string",
    i100: String = "init string",
    i101: String = "init string",
    i102: String = "init string",
    i103: String = "init string",
    i104: String = "init string",
    i105: String = "init string",
    i106: String = "init string",
    i107: String = "init string",
    i108: Int = 11121314,
    i109: String = "init string",
    i110: String = "init string",
    i111: String = "init string",
    i112: String = "init string",
    i113: String = "init string",
    i114: String = "init string",
    i115: String = "init string",
    i116: String = "init string")

  val times = 100000

  val model: LargeModel = LargeModel()

  /*{
    import io.circe.syntax._
    import io.circe.generic.auto._
    val data1 = System.currentTimeMillis
    for (_ <- 1 to times) {
      model.asJsonObject
    }
    val data2 = System.currentTimeMillis
    println(s"circe 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
  }*/

  {
    object Abc {
      def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    }
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].input(Abc))
    val data1 = System.currentTimeMillis
    import io.circe.syntax._
    val json = circeEncoder.write(model)
    println(json.asJson.spaces2)
    val data2 = System.currentTimeMillis
    println(s"asuna 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
  }

}