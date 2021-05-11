package zsg.rep
object RepMeta {
  def apply[Tu1](tuple: Tu1): RepMeta1[Tu1] = new impl.RepMetaImpl1(tuple)
  def apply[Tu1, Tu2](tuple: Tuple2[Tu1, Tu2]): RepMeta2[Tu1, Tu2] =
    new impl.RepMetaImpl2(rep1 = tuple._1, rep2 = tuple._2)
  def apply[Tu1, Tu2, Tu3](tuple: Tuple3[Tu1, Tu2, Tu3]): RepMeta3[Tu1, Tu2, Tu3] =
    new impl.RepMetaImpl3(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3)
  def apply[Tu1, Tu2, Tu3, Tu4](tuple: Tuple4[Tu1, Tu2, Tu3, Tu4]): RepMeta4[Tu1, Tu2, Tu3, Tu4] =
    new impl.RepMetaImpl4(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3, rep4 = tuple._4)
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5](tuple: Tuple5[Tu1, Tu2, Tu3, Tu4, Tu5]): RepMeta5[Tu1, Tu2, Tu3, Tu4, Tu5] =
    new impl.RepMetaImpl5(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3, rep4 = tuple._4, rep5 = tuple._5)
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6](tuple: Tuple6[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6]): RepMeta6[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6] =
    new impl.RepMetaImpl6(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3, rep4 = tuple._4, rep5 = tuple._5, rep6 = tuple._6)
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7](tuple: Tuple7[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7]): RepMeta7[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7] =
    new impl.RepMetaImpl7(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3, rep4 = tuple._4, rep5 = tuple._5, rep6 = tuple._6, rep7 = tuple._7)
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8](tuple: Tuple8[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8]): RepMeta8[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8] =
    new impl.RepMetaImpl8(rep1 = tuple._1, rep2 = tuple._2, rep3 = tuple._3, rep4 = tuple._4, rep5 = tuple._5, rep6 = tuple._6, rep7 = tuple._7, rep8 = tuple._8)
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9](
    tuple: Tuple9[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9]
  ): RepMeta9[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9] =
    new impl.RepMetaImpl9(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10](
    tuple: Tuple10[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10]
  ): RepMeta10[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10] =
    new impl.RepMetaImpl10(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11](
    tuple: Tuple11[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11]
  ): RepMeta11[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11] =
    new impl.RepMetaImpl11(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12](
    tuple: Tuple12[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12]
  ): RepMeta12[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12] =
    new impl.RepMetaImpl12(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13](
    tuple: Tuple13[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13]
  ): RepMeta13[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13] =
    new impl.RepMetaImpl13(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14](
    tuple: Tuple14[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14]
  ): RepMeta14[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14] =
    new impl.RepMetaImpl14(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15](
    tuple: Tuple15[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15]
  ): RepMeta15[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15] =
    new impl.RepMetaImpl15(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16](
    tuple: Tuple16[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16]
  ): RepMeta16[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16] =
    new impl.RepMetaImpl16(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17](
    tuple: Tuple17[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17]
  ): RepMeta17[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17] =
    new impl.RepMetaImpl17(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18](
    tuple: Tuple18[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18]
  ): RepMeta18[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18] =
    new impl.RepMetaImpl18(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17,
      rep18 = tuple._18
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19](
    tuple: Tuple19[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19]
  ): RepMeta19[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19] =
    new impl.RepMetaImpl19(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17,
      rep18 = tuple._18,
      rep19 = tuple._19
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20](
    tuple: Tuple20[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20]
  ): RepMeta20[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20] =
    new impl.RepMetaImpl20(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17,
      rep18 = tuple._18,
      rep19 = tuple._19,
      rep20 = tuple._20
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21](
    tuple: Tuple21[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21]
  ): RepMeta21[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21] =
    new impl.RepMetaImpl21(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17,
      rep18 = tuple._18,
      rep19 = tuple._19,
      rep20 = tuple._20,
      rep21 = tuple._21
    )
  def apply[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21, Tu22](
    tuple: Tuple22[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21, Tu22]
  ): RepMeta22[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, Tu9, Tu10, Tu11, Tu12, Tu13, Tu14, Tu15, Tu16, Tu17, Tu18, Tu19, Tu20, Tu21, Tu22] =
    new impl.RepMetaImpl22(
      rep1 = tuple._1,
      rep2 = tuple._2,
      rep3 = tuple._3,
      rep4 = tuple._4,
      rep5 = tuple._5,
      rep6 = tuple._6,
      rep7 = tuple._7,
      rep8 = tuple._8,
      rep9 = tuple._9,
      rep10 = tuple._10,
      rep11 = tuple._11,
      rep12 = tuple._12,
      rep13 = tuple._13,
      rep14 = tuple._14,
      rep15 = tuple._15,
      rep16 = tuple._16,
      rep17 = tuple._17,
      rep18 = tuple._18,
      rep19 = tuple._19,
      rep20 = tuple._20,
      rep21 = tuple._21,
      rep22 = tuple._22
    )
}
