package zsg.rep
object RepMeta {
    def apply[Tu1](tuple: Tu1): RepMeta1[Tu1] = new impl.RepMetaImpl1(tuple)
        def apply[  Tu1   ,  Tu2 ](tuple: Tuple2[  Tu1   ,  Tu2 ]): RepMeta2[  Tu1   ,  Tu2 ] =
            new impl.RepMetaImpl2(  rep1 = tuple._1   ,  rep2 = tuple._2 )
        def apply[  Tu1   ,  Tu2   ,  Tu3 ](tuple: Tuple3[  Tu1   ,  Tu2   ,  Tu3 ]): RepMeta3[  Tu1   ,  Tu2   ,  Tu3 ] =
            new impl.RepMetaImpl3(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3 )
        def apply[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4 ](tuple: Tuple4[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4 ]): RepMeta4[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4 ] =
            new impl.RepMetaImpl4(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3   ,  rep4 = tuple._4 )
        def apply[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5 ](tuple: Tuple5[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5 ]): RepMeta5[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5 ] =
            new impl.RepMetaImpl5(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3   ,  rep4 = tuple._4   ,  rep5 = tuple._5 )
        def apply[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6 ](tuple: Tuple6[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6 ]): RepMeta6[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6 ] =
            new impl.RepMetaImpl6(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3   ,  rep4 = tuple._4   ,  rep5 = tuple._5   ,  rep6 = tuple._6 )
        def apply[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7 ](tuple: Tuple7[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7 ]): RepMeta7[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7 ] =
            new impl.RepMetaImpl7(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3   ,  rep4 = tuple._4   ,  rep5 = tuple._5   ,  rep6 = tuple._6   ,  rep7 = tuple._7 )
        def apply[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7   ,  Tu8 ](tuple: Tuple8[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7   ,  Tu8 ]): RepMeta8[  Tu1   ,  Tu2   ,  Tu3   ,  Tu4   ,  Tu5   ,  Tu6   ,  Tu7   ,  Tu8 ] =
            new impl.RepMetaImpl8(  rep1 = tuple._1   ,  rep2 = tuple._2   ,  rep3 = tuple._3   ,  rep4 = tuple._4   ,  rep5 = tuple._5   ,  rep6 = tuple._6   ,  rep7 = tuple._7   ,  rep8 = tuple._8 )
}
