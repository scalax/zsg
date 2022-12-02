package zsg.scala.tuple
import zsg._
object Tuple22Plus {
        def tuple22Plus1[ I1 <: TypeHList,  Y <: TypeHList]: Plus[
            I1, Y,
            Tuple2TypeHList[ I1,  Y]
        ] = new Plus[
            I1, Y,
            Tuple2TypeHList[ I1,  Y]
        ] {
            override def takeHead(z: Tuple2[ I1#Head,  Y#Head]): I1#Head =
                z._1
            override def takeTail(z: Tuple2[ I1#Head,  Y#Head]): Y#Head = z._2
            override def plus(x: I1#Head, y: Y#Head): Tuple2[ I1#Head,  Y#Head] =
                Tuple2(x, y)
            override def tail: Plus[I1#Tail, Y#Tail, Tuple2TypeHList[ I1#Tail,  Y#Tail]] =
                tuple22Plus1[ I1#Tail,  Y#Tail]
        }
        def tuple22Plus2[ I1 <: TypeHList,  I2 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[I1, I2], Y,
            Tuple3TypeHList[ I1,  I2,  Y]
        ] = new Plus[
            Item2TypeHList[I1, I2], Y,
            Tuple3TypeHList[ I1,  I2,  Y]
        ] {
            override def takeHead(z: Tuple3[ I1#Head,  I2#Head,  Y#Head]): ZsgTuple2[I1#Head, I2#Head] =
                new ZsgTuple2(z._1, z._2)
            override def takeTail(z: Tuple3[ I1#Head,  I2#Head,  Y#Head]): Y#Head = z._3
            override def plus(x: ZsgTuple2[I1#Head, I2#Head], y: Y#Head): Tuple3[ I1#Head,  I2#Head,  Y#Head] =
                Tuple3(x.i1, x.i2, y)
            override def tail: Plus[Item2TypeHList[I1#Tail, I2#Tail], Y#Tail, Tuple3TypeHList[ I1#Tail,  I2#Tail,  Y#Tail]] =
                tuple22Plus2[ I1#Tail,  I2#Tail,  Y#Tail]
        }
        def tuple22Plus3[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[I1, I2], I3], Y,
            Tuple4TypeHList[ I1,  I2,  I3,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[I1, I2], I3], Y,
            Tuple4TypeHList[ I1,  I2,  I3,  Y]
        ] {
            override def takeHead(z: Tuple4[ I1#Head,  I2#Head,  I3#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], I3#Head] =
                new ZsgTuple2(new ZsgTuple2(z._1, z._2), z._3)
            override def takeTail(z: Tuple4[ I1#Head,  I2#Head,  I3#Head,  Y#Head]): Y#Head = z._4
            override def plus(x: ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], I3#Head], y: Y#Head): Tuple4[ I1#Head,  I2#Head,  I3#Head,  Y#Head] =
                Tuple4(x.i1.i1, x.i1.i2, x.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], I3#Tail], Y#Tail, Tuple4TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  Y#Tail]] =
                tuple22Plus3[ I1#Tail,  I2#Tail,  I3#Tail,  Y#Tail]
        }
        def tuple22Plus4[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Y,
            Tuple5TypeHList[ I1,  I2,  I3,  I4,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Y,
            Tuple5TypeHList[ I1,  I2,  I3,  I4,  Y]
        ] {
            override def takeHead(z: Tuple5[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]] =
                new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4))
            override def takeTail(z: Tuple5[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  Y#Head]): Y#Head = z._5
            override def plus(x: ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], y: Y#Head): Tuple5[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  Y#Head] =
                Tuple5(x.i1.i1, x.i1.i2, x.i2.i1, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Y#Tail, Tuple5TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  Y#Tail]] =
                tuple22Plus4[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  Y#Tail]
        }
        def tuple22Plus5[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5], Y,
            Tuple6TypeHList[ I1,  I2,  I3,  I4,  I5,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5], Y,
            Tuple6TypeHList[ I1,  I2,  I3,  I4,  I5,  Y]
        ] {
            override def takeHead(z: Tuple6[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], I5#Head] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), z._5)
            override def takeTail(z: Tuple6[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  Y#Head]): Y#Head = z._6
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], I5#Head], y: Y#Head): Tuple6[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  Y#Head] =
                Tuple6(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], I5#Tail], Y#Tail, Tuple6TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  Y#Tail]] =
                tuple22Plus5[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  Y#Tail]
        }
        def tuple22Plus6[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]], Y,
            Tuple7TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]], Y,
            Tuple7TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  Y]
        ] {
            override def takeHead(z: Tuple7[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[I5#Head, I6#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(z._5, z._6))
            override def takeTail(z: Tuple7[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  Y#Head]): Y#Head = z._7
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[I5#Head, I6#Head]], y: Y#Head): Tuple7[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  Y#Head] =
                Tuple7(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[I5#Tail, I6#Tail]], Y#Tail, Tuple7TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  Y#Tail]] =
                tuple22Plus6[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  Y#Tail]
        }
        def tuple22Plus7[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]], Y,
            Tuple8TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]], Y,
            Tuple8TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  Y]
        ] {
            override def takeHead(z: Tuple8[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], I7#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), z._7))
            override def takeTail(z: Tuple8[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  Y#Head]): Y#Head = z._8
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], I7#Head]], y: Y#Head): Tuple8[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  Y#Head] =
                Tuple8(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], I7#Tail]], Y#Tail, Tuple8TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  Y#Tail]] =
                tuple22Plus7[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  Y#Tail]
        }
        def tuple22Plus8[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Y,
            Tuple9TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Y,
            Tuple9TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  Y]
        ] {
            override def takeHead(z: Tuple9[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8)))
            override def takeTail(z: Tuple9[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  Y#Head]): Y#Head = z._9
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], y: Y#Head): Tuple9[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  Y#Head] =
                Tuple9(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2.i1, x.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Y#Tail, Tuple9TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  Y#Tail]] =
                tuple22Plus8[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  Y#Tail]
        }
        def tuple22Plus9[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], I9], Y,
            Tuple10TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], I9], Y,
            Tuple10TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  Y]
        ] {
            override def takeHead(z: Tuple10[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], I9#Head] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), z._9)
            override def takeTail(z: Tuple10[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  Y#Head]): Y#Head = z._10
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], I9#Head], y: Y#Head): Tuple10[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  Y#Head] =
                Tuple10(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], I9#Tail], Y#Tail, Tuple10TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  Y#Tail]] =
                tuple22Plus9[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  Y#Tail]
        }
        def tuple22Plus10[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[I9, I10]], Y,
            Tuple11TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[I9, I10]], Y,
            Tuple11TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  Y]
        ] {
            override def takeHead(z: Tuple11[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[I9#Head, I10#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(z._9, z._10))
            override def takeTail(z: Tuple11[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  Y#Head]): Y#Head = z._11
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[I9#Head, I10#Head]], y: Y#Head): Tuple11[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  Y#Head] =
                Tuple11(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[I9#Tail, I10#Tail]], Y#Tail, Tuple11TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  Y#Tail]] =
                tuple22Plus10[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  Y#Tail]
        }
        def tuple22Plus11[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[I9, I10], I11]], Y,
            Tuple12TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[I9, I10], I11]], Y,
            Tuple12TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  Y]
        ] {
            override def takeHead(z: Tuple12[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], I11#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(z._9, z._10), z._11))
            override def takeTail(z: Tuple12[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  Y#Head]): Y#Head = z._12
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], I11#Head]], y: Y#Head): Tuple12[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  Y#Head] =
                Tuple12(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], I11#Tail]], Y#Tail, Tuple12TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  Y#Tail]] =
                tuple22Plus11[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  Y#Tail]
        }
        def tuple22Plus12[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]], Y,
            Tuple13TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]], Y,
            Tuple13TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  Y]
        ] {
            override def takeHead(z: Tuple13[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)))
            override def takeTail(z: Tuple13[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  Y#Head]): Y#Head = z._13
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]]], y: Y#Head): Tuple13[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  Y#Head] =
                Tuple13(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2.i1, x.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]]], Y#Tail, Tuple13TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  Y#Tail]] =
                tuple22Plus12[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  Y#Tail]
        }
        def tuple22Plus13[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]], Y,
            Tuple14TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]], Y,
            Tuple14TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  Y]
        ] {
            override def takeHead(z: Tuple14[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], I13#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), z._13))
            override def takeTail(z: Tuple14[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  Y#Head]): Y#Head = z._14
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], I13#Head]], y: Y#Head): Tuple14[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  Y#Head] =
                Tuple14(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1.i1, x.i2.i1.i1.i2, x.i2.i1.i2.i1, x.i2.i1.i2.i2, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], I13#Tail]], Y#Tail, Tuple14TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  Y#Tail]] =
                tuple22Plus13[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  Y#Tail]
        }
        def tuple22Plus14[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]], Y,
            Tuple15TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]], Y,
            Tuple15TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  Y]
        ] {
            override def takeHead(z: Tuple15[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[I13#Head, I14#Head]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(z._13, z._14)))
            override def takeTail(z: Tuple15[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  Y#Head]): Y#Head = z._15
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[I13#Head, I14#Head]]], y: Y#Head): Tuple15[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  Y#Head] =
                Tuple15(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1.i1, x.i2.i1.i1.i2, x.i2.i1.i2.i1, x.i2.i1.i2.i2, x.i2.i2.i1, x.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[I13#Tail, I14#Tail]]], Y#Tail, Tuple15TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  Y#Tail]] =
                tuple22Plus14[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  Y#Tail]
        }
        def tuple22Plus15[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]], Y,
            Tuple16TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]], Y,
            Tuple16TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  Y]
        ] {
            override def takeHead(z: Tuple16[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], I15#Head]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), z._15)))
            override def takeTail(z: Tuple16[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  Y#Head]): Y#Head = z._16
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], I15#Head]]], y: Y#Head): Tuple16[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  Y#Head] =
                Tuple16(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1.i1, x.i2.i1.i1.i2, x.i2.i1.i2.i1, x.i2.i1.i2.i2, x.i2.i2.i1.i1, x.i2.i2.i1.i2, x.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], I15#Tail]]], Y#Tail, Tuple16TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  Y#Tail]] =
                tuple22Plus15[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  Y#Tail]
        }
        def tuple22Plus16[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Y,
            Tuple17TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Y,
            Tuple17TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  Y]
        ] {
            override def takeHead(z: Tuple17[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))))
            override def takeTail(z: Tuple17[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  Y#Head]): Y#Head = z._17
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], y: Y#Head): Tuple17[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  Y#Head] =
                Tuple17(x.i1.i1.i1.i1, x.i1.i1.i1.i2, x.i1.i1.i2.i1, x.i1.i1.i2.i2, x.i1.i2.i1.i1, x.i1.i2.i1.i2, x.i1.i2.i2.i1, x.i1.i2.i2.i2, x.i2.i1.i1.i1, x.i2.i1.i1.i2, x.i2.i1.i2.i1, x.i2.i1.i2.i2, x.i2.i2.i1.i1, x.i2.i2.i1.i2, x.i2.i2.i2.i1, x.i2.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], Y#Tail, Tuple17TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  Y#Tail]] =
                tuple22Plus16[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  Y#Tail]
        }
        def tuple22Plus17[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  I17 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], I17], Y,
            Tuple18TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], I17], Y,
            Tuple18TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  Y]
        ] {
            override def takeHead(z: Tuple18[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], I17#Head] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16)))), z._17)
            override def takeTail(z: Tuple18[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  Y#Head]): Y#Head = z._18
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], I17#Head], y: Y#Head): Tuple18[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  Y#Head] =
                Tuple18(x.i1.i1.i1.i1.i1, x.i1.i1.i1.i1.i2, x.i1.i1.i1.i2.i1, x.i1.i1.i1.i2.i2, x.i1.i1.i2.i1.i1, x.i1.i1.i2.i1.i2, x.i1.i1.i2.i2.i1, x.i1.i1.i2.i2.i2, x.i1.i2.i1.i1.i1, x.i1.i2.i1.i1.i2, x.i1.i2.i1.i2.i1, x.i1.i2.i1.i2.i2, x.i1.i2.i2.i1.i1, x.i1.i2.i2.i1.i2, x.i1.i2.i2.i2.i1, x.i1.i2.i2.i2.i2, x.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], I17#Tail], Y#Tail, Tuple18TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  Y#Tail]] =
                tuple22Plus17[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  Y#Tail]
        }
        def tuple22Plus18[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  I17 <: TypeHList,  I18 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[I17, I18]], Y,
            Tuple19TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[I17, I18]], Y,
            Tuple19TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  Y]
        ] {
            override def takeHead(z: Tuple19[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[I17#Head, I18#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16)))), new ZsgTuple2(z._17, z._18))
            override def takeTail(z: Tuple19[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  Y#Head]): Y#Head = z._19
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[I17#Head, I18#Head]], y: Y#Head): Tuple19[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  Y#Head] =
                Tuple19(x.i1.i1.i1.i1.i1, x.i1.i1.i1.i1.i2, x.i1.i1.i1.i2.i1, x.i1.i1.i1.i2.i2, x.i1.i1.i2.i1.i1, x.i1.i1.i2.i1.i2, x.i1.i1.i2.i2.i1, x.i1.i1.i2.i2.i2, x.i1.i2.i1.i1.i1, x.i1.i2.i1.i1.i2, x.i1.i2.i1.i2.i1, x.i1.i2.i1.i2.i2, x.i1.i2.i2.i1.i1, x.i1.i2.i2.i1.i2, x.i1.i2.i2.i2.i1, x.i1.i2.i2.i2.i2, x.i2.i1, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], Item2TypeHList[I17#Tail, I18#Tail]], Y#Tail, Tuple19TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  Y#Tail]] =
                tuple22Plus18[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  Y#Tail]
        }
        def tuple22Plus19[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  I17 <: TypeHList,  I18 <: TypeHList,  I19 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[I17, I18], I19]], Y,
            Tuple20TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[I17, I18], I19]], Y,
            Tuple20TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  Y]
        ] {
            override def takeHead(z: Tuple20[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], I19#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16)))), new ZsgTuple2(new ZsgTuple2(z._17, z._18), z._19))
            override def takeTail(z: Tuple20[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  Y#Head]): Y#Head = z._20
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], I19#Head]], y: Y#Head): Tuple20[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  Y#Head] =
                Tuple20(x.i1.i1.i1.i1.i1, x.i1.i1.i1.i1.i2, x.i1.i1.i1.i2.i1, x.i1.i1.i1.i2.i2, x.i1.i1.i2.i1.i1, x.i1.i1.i2.i1.i2, x.i1.i1.i2.i2.i1, x.i1.i1.i2.i2.i2, x.i1.i2.i1.i1.i1, x.i1.i2.i1.i1.i2, x.i1.i2.i1.i2.i1, x.i1.i2.i1.i2.i2, x.i1.i2.i2.i1.i1, x.i1.i2.i2.i1.i2, x.i1.i2.i2.i2.i1, x.i1.i2.i2.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], Item2TypeHList[Item2TypeHList[I17#Tail, I18#Tail], I19#Tail]], Y#Tail, Tuple20TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  Y#Tail]] =
                tuple22Plus19[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  Y#Tail]
        }
        def tuple22Plus20[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  I17 <: TypeHList,  I18 <: TypeHList,  I19 <: TypeHList,  I20 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]], Y,
            Tuple21TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  I20,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]], Y,
            Tuple21TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  I20,  Y]
        ] {
            override def takeHead(z: Tuple21[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], ZsgTuple2[I19#Head, I20#Head]]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16)))), new ZsgTuple2(new ZsgTuple2(z._17, z._18), new ZsgTuple2(z._19, z._20)))
            override def takeTail(z: Tuple21[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  Y#Head]): Y#Head = z._21
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], ZsgTuple2[I19#Head, I20#Head]]], y: Y#Head): Tuple21[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  Y#Head] =
                Tuple21(x.i1.i1.i1.i1.i1, x.i1.i1.i1.i1.i2, x.i1.i1.i1.i2.i1, x.i1.i1.i1.i2.i2, x.i1.i1.i2.i1.i1, x.i1.i1.i2.i1.i2, x.i1.i1.i2.i2.i1, x.i1.i1.i2.i2.i2, x.i1.i2.i1.i1.i1, x.i1.i2.i1.i1.i2, x.i1.i2.i1.i2.i1, x.i1.i2.i1.i2.i2, x.i1.i2.i2.i1.i1, x.i1.i2.i2.i1.i2, x.i1.i2.i2.i2.i1, x.i1.i2.i2.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2.i1, x.i2.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], Item2TypeHList[Item2TypeHList[I17#Tail, I18#Tail], Item2TypeHList[I19#Tail, I20#Tail]]], Y#Tail, Tuple21TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  I20#Tail,  Y#Tail]] =
                tuple22Plus20[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  I20#Tail,  Y#Tail]
        }
        def tuple22Plus21[ I1 <: TypeHList,  I2 <: TypeHList,  I3 <: TypeHList,  I4 <: TypeHList,  I5 <: TypeHList,  I6 <: TypeHList,  I7 <: TypeHList,  I8 <: TypeHList,  I9 <: TypeHList,  I10 <: TypeHList,  I11 <: TypeHList,  I12 <: TypeHList,  I13 <: TypeHList,  I14 <: TypeHList,  I15 <: TypeHList,  I16 <: TypeHList,  I17 <: TypeHList,  I18 <: TypeHList,  I19 <: TypeHList,  I20 <: TypeHList,  I21 <: TypeHList,  Y <: TypeHList]: Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]], Y,
            Tuple22TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  I20,  I21,  Y]
        ] = new Plus[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]], Y,
            Tuple22TypeHList[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  I9,  I10,  I11,  I12,  I13,  I14,  I15,  I16,  I17,  I18,  I19,  I20,  I21,  Y]
        ] {
            override def takeHead(z: Tuple22[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  I21#Head,  Y#Head]): ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], ZsgTuple2[I19#Head, I20#Head]], I21#Head]] =
                new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16)))), new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._17, z._18), new ZsgTuple2(z._19, z._20)), z._21))
            override def takeTail(z: Tuple22[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  I21#Head,  Y#Head]): Y#Head = z._22
            override def plus(x: ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1#Head, I2#Head], ZsgTuple2[I3#Head, I4#Head]], ZsgTuple2[ZsgTuple2[I5#Head, I6#Head], ZsgTuple2[I7#Head, I8#Head]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I9#Head, I10#Head], ZsgTuple2[I11#Head, I12#Head]], ZsgTuple2[ZsgTuple2[I13#Head, I14#Head], ZsgTuple2[I15#Head, I16#Head]]]], ZsgTuple2[ZsgTuple2[ZsgTuple2[I17#Head, I18#Head], ZsgTuple2[I19#Head, I20#Head]], I21#Head]], y: Y#Head): Tuple22[ I1#Head,  I2#Head,  I3#Head,  I4#Head,  I5#Head,  I6#Head,  I7#Head,  I8#Head,  I9#Head,  I10#Head,  I11#Head,  I12#Head,  I13#Head,  I14#Head,  I15#Head,  I16#Head,  I17#Head,  I18#Head,  I19#Head,  I20#Head,  I21#Head,  Y#Head] =
                Tuple22(x.i1.i1.i1.i1.i1, x.i1.i1.i1.i1.i2, x.i1.i1.i1.i2.i1, x.i1.i1.i1.i2.i2, x.i1.i1.i2.i1.i1, x.i1.i1.i2.i1.i2, x.i1.i1.i2.i2.i1, x.i1.i1.i2.i2.i2, x.i1.i2.i1.i1.i1, x.i1.i2.i1.i1.i2, x.i1.i2.i1.i2.i1, x.i1.i2.i1.i2.i2, x.i1.i2.i2.i1.i1, x.i1.i2.i2.i1.i2, x.i1.i2.i2.i2.i1, x.i1.i2.i2.i2.i2, x.i2.i1.i1.i1, x.i2.i1.i1.i2, x.i2.i1.i2.i1, x.i2.i1.i2.i2, x.i2.i2, y)
            override def tail: Plus[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1#Tail, I2#Tail], Item2TypeHList[I3#Tail, I4#Tail]], Item2TypeHList[Item2TypeHList[I5#Tail, I6#Tail], Item2TypeHList[I7#Tail, I8#Tail]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9#Tail, I10#Tail], Item2TypeHList[I11#Tail, I12#Tail]], Item2TypeHList[Item2TypeHList[I13#Tail, I14#Tail], Item2TypeHList[I15#Tail, I16#Tail]]]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17#Tail, I18#Tail], Item2TypeHList[I19#Tail, I20#Tail]], I21#Tail]], Y#Tail, Tuple22TypeHList[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  I20#Tail,  I21#Tail,  Y#Tail]] =
                tuple22Plus21[ I1#Tail,  I2#Tail,  I3#Tail,  I4#Tail,  I5#Tail,  I6#Tail,  I7#Tail,  I8#Tail,  I9#Tail,  I10#Tail,  I11#Tail,  I12#Tail,  I13#Tail,  I14#Tail,  I15#Tail,  I16#Tail,  I17#Tail,  I18#Tail,  I19#Tail,  I20#Tail,  I21#Tail,  Y#Tail]
        }
}
