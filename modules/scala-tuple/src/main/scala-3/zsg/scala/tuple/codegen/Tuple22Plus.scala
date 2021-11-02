package zsg.scala.tuple
import zsg._
object Tuple22Plus {
  def tuple22Plus1[I1 <: TypeHList, Y <: TypeHList]: Plus[
    I1,
    Y,
    Tuple2TypeHList[I1, Y]
  ] = new Plus[
    I1,
    Y,
    Tuple2TypeHList[I1, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple2TypeHList[I1, Y]]): TypeHead[I1] = {
      val z = u.asInstanceOf[Tuple2[_, _]]
      z._1.asInstanceOf[TypeHead[I1]]
    }
    override def takeTail(u: TypeHead[Tuple2TypeHList[I1, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple2[TypeHead[I1], TypeHead[Y]]]
      z._2
    }
    override def plus(u: TypeHead[I1], y: TypeHead[Y]): TypeHead[Tuple2TypeHList[I1, Y]] = {
      val x = u.asInstanceOf[I1]
      Tuple2(x, y).asInstanceOf[TypeHead[Tuple2TypeHList[I1, Y]]]
    }
    override def tail: Plus[TypeTail[I1], TypeTail[Y], TypeTail[Tuple2TypeHList[I1, Y]]] =
      tuple22Plus1[TypeTail[I1], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[I1],
        TypeTail[Y],
        TypeTail[Tuple2TypeHList[I1, Y]]
      ]]
  }
  def tuple22Plus2[I1 <: TypeHList, I2 <: TypeHList, Y <: TypeHList]: Plus[
    Item2TypeHList[I1, I2],
    Y,
    Tuple3TypeHList[I1, I2, Y]
  ] = new Plus[
    Item2TypeHList[I1, I2],
    Y,
    Tuple3TypeHList[I1, I2, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple3TypeHList[I1, I2, Y]]): TypeHead[Item2TypeHList[I1, I2]] = {
      val z = u.asInstanceOf[Tuple3[_, _, _]]
      new ZsgTuple2(z._1, z._2).asInstanceOf[TypeHead[Item2TypeHList[I1, I2]]]
    }
    override def takeTail(u: TypeHead[Tuple3TypeHList[I1, I2, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple3[TypeHead[I2], TypeHead[I2], TypeHead[Y]]]
      z._3
    }
    override def plus(u: TypeHead[Item2TypeHList[I1, I2]], y: TypeHead[Y]): TypeHead[Tuple3TypeHList[I1, I2, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[I1, I2]]
      Tuple3(x.i1, x.i2, y).asInstanceOf[TypeHead[Tuple3TypeHList[I1, I2, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[I1, I2]], TypeTail[Y], TypeTail[Tuple3TypeHList[I1, I2, Y]]] =
      tuple22Plus2[TypeTail[I1], TypeTail[I2], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[I1, I2]],
        TypeTail[Y],
        TypeTail[Tuple3TypeHList[I1, I2, Y]]
      ]]
  }
  def tuple22Plus3[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, Y <: TypeHList]: Plus[
    Item2TypeHList[Item2TypeHList[I1, I2], I3],
    Y,
    Tuple4TypeHList[I1, I2, I3, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[I1, I2], I3],
    Y,
    Tuple4TypeHList[I1, I2, I3, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple4TypeHList[I1, I2, I3, Y]]): TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], I3]] = {
      val z = u.asInstanceOf[Tuple4[_, _, _, _]]
      new ZsgTuple2(new ZsgTuple2(z._1, z._2), z._3).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], I3]]]
    }
    override def takeTail(u: TypeHead[Tuple4TypeHList[I1, I2, I3, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple4[TypeHead[I3], TypeHead[I3], TypeHead[I3], TypeHead[Y]]]
      z._4
    }
    override def plus(u: TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], I3]], y: TypeHead[Y]): TypeHead[Tuple4TypeHList[I1, I2, I3, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[I1, I2], I3]]
      Tuple4(x.i1.i1, x.i1.i2, x.i2, y).asInstanceOf[TypeHead[Tuple4TypeHList[I1, I2, I3, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[I1, I2], I3]], TypeTail[Y], TypeTail[Tuple4TypeHList[I1, I2, I3, Y]]] =
      tuple22Plus3[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[I1, I2], I3]],
        TypeTail[Y],
        TypeTail[Tuple4TypeHList[I1, I2, I3, Y]]
      ]]
  }
  def tuple22Plus4[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, Y <: TypeHList]: Plus[
    Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
    Y,
    Tuple5TypeHList[I1, I2, I3, I4, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
    Y,
    Tuple5TypeHList[I1, I2, I3, I4, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple5TypeHList[I1, I2, I3, I4, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]]] = {
      val z = u.asInstanceOf[Tuple5[_, _, _, _, _]]
      new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4))
        .asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]]]]
    }
    override def takeTail(u: TypeHead[Tuple5TypeHList[I1, I2, I3, I4, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple5[TypeHead[I4], TypeHead[I4], TypeHead[I4], TypeHead[I4], TypeHead[Y]]]
      z._5
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple5TypeHList[I1, I2, I3, I4, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]]]
      Tuple5(x.i1.i1, x.i1.i2, x.i2.i1, x.i2.i2, y).asInstanceOf[TypeHead[Tuple5TypeHList[I1, I2, I3, I4, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]]], TypeTail[Y], TypeTail[
      Tuple5TypeHList[I1, I2, I3, I4, Y]
    ]] =
      tuple22Plus4[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]]],
        TypeTail[Y],
        TypeTail[Tuple5TypeHList[I1, I2, I3, I4, Y]]
      ]]
  }
  def tuple22Plus5[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, Y <: TypeHList]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5],
    Y,
    Tuple6TypeHList[I1, I2, I3, I4, I5, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5],
    Y,
    Tuple6TypeHList[I1, I2, I3, I4, I5, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5]] = {
      val z = u.asInstanceOf[Tuple6[_, _, _, _, _, _]]
      new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), z._5)
        .asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5]]]
    }
    override def takeTail(u: TypeHead[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple6[TypeHead[I5], TypeHead[I5], TypeHead[I5], TypeHead[I5], TypeHead[I5], TypeHead[Y]]]
      z._6
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5]],
      y: TypeHead[Y]
    ): TypeHead[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], I5]]
      Tuple6(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2, y).asInstanceOf[TypeHead[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5]], TypeTail[
      Y
    ], TypeTail[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]]] =
      tuple22Plus5[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], I5]],
        TypeTail[Y],
        TypeTail[Tuple6TypeHList[I1, I2, I3, I4, I5, Y]]
      ]]
  }
  def tuple22Plus6[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList, Y <: TypeHList]
    : Plus[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]],
      Y,
      Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]
    ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]],
    Y,
    Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]]] = {
      val z = u.asInstanceOf[Tuple7[_, _, _, _, _, _, _]]
      new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(z._5, z._6))
        .asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]]]]
    }
    override def takeTail(u: TypeHead[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple7[TypeHead[I6], TypeHead[I6], TypeHead[I6], TypeHead[I6], TypeHead[I6], TypeHead[I6], TypeHead[Y]]]
      z._7
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[I5, I6]]]
      Tuple7(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1, x.i2.i2, y)
        .asInstanceOf[TypeHead[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]]
    ], TypeTail[Y], TypeTail[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]]] =
      tuple22Plus6[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[I5, I6]]],
        TypeTail[Y],
        TypeTail[Tuple7TypeHList[I1, I2, I3, I4, I5, I6, Y]]
      ]]
  }
  def tuple22Plus7[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]],
    Y,
    Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]],
    Y,
    Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]]): TypeHead[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]]
    ] = {
      val z = u.asInstanceOf[Tuple8[_, _, _, _, _, _, _, _]]
      new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)), new ZsgTuple2(new ZsgTuple2(z._5, z._6), z._7))
        .asInstanceOf[TypeHead[
          Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]]
        ]]
    }
    override def takeTail(u: TypeHead[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]]): TypeHead[Y] = {
      val z = u
        .asInstanceOf[Tuple8[TypeHead[I7], TypeHead[I7], TypeHead[I7], TypeHead[I7], TypeHead[I7], TypeHead[I7], TypeHead[I7], TypeHead[Y]]]
      z._8
    }
    override def plus(
      u: TypeHead[
        Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]]
      ],
      y: TypeHead[Y]
    ): TypeHead[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], I7]]]
      Tuple8(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2, y)
        .asInstanceOf[TypeHead[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]]
    ], TypeTail[Y], TypeTail[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]]] =
      tuple22Plus7[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[Y]]
        .asInstanceOf[Plus[
          TypeTail[
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[Item2TypeHList[I5, I6], I7]]
          ],
          TypeTail[Y],
          TypeTail[Tuple8TypeHList[I1, I2, I3, I4, I5, I6, I7, Y]]
        ]]
  }
  def tuple22Plus8[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]], Item2TypeHList[
      Item2TypeHList[I5, I6],
      Item2TypeHList[I7, I8]
    ]],
    Y,
    Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]
  ] = new Plus[
    Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ],
    Y,
    Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]]): TypeHead[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ]] = {
      val z = u.asInstanceOf[Tuple9[_, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
        new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
      ).asInstanceOf[TypeHead[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ]]]
    }
    override def takeTail(u: TypeHead[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple9[TypeHead[I8], TypeHead[I8], TypeHead[I8], TypeHead[I8], TypeHead[I8], TypeHead[I8], TypeHead[
        I8
      ], TypeHead[I8], TypeHead[Y]]]
      z._9
    }
    override def plus(
      u: TypeHead[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ]],
      y: TypeHead[Y]
    ): TypeHead[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]]]
      Tuple9(x.i1.i1.i1, x.i1.i1.i2, x.i1.i2.i1, x.i1.i2.i2, x.i2.i1.i1, x.i2.i1.i2, x.i2.i2.i1, x.i2.i2.i2, y)
        .asInstanceOf[TypeHead[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ]], TypeTail[Y], TypeTail[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]]] =
      tuple22Plus8[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[I8], TypeTail[
        Y
      ]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ]],
        TypeTail[Y],
        TypeTail[Tuple9TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, Y]]
      ]]
  }
  def tuple22Plus9[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], I9],
    Y,
    Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], I9],
    Y,
    Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]]): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], I9]] = {
      val z = u.asInstanceOf[Tuple10[_, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        z._9
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], I9]]]
    }
    override def takeTail(u: TypeHead[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple10[TypeHead[I9], TypeHead[I9], TypeHead[I9], TypeHead[I9], TypeHead[I9], TypeHead[I9], TypeHead[
        I9
      ], TypeHead[I9], TypeHead[I9], TypeHead[Y]]]
      z._10
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], I9]],
      y: TypeHead[Y]
    ): TypeHead[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]] = {
      val x = u.asInstanceOf[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]], I9]
      ]
      Tuple10(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2,
        y
      ).asInstanceOf[TypeHead[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], I9]], TypeTail[Y], TypeTail[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]]] =
      tuple22Plus9[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[I8], TypeTail[
        I9
      ], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], I9]],
        TypeTail[Y],
        TypeTail[Tuple10TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, Y]]
      ]]
  }
  def tuple22Plus10[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[I9, I10]],
    Y,
    Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[I9, I10]],
    Y,
    Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[I9, I10]]] = {
      val z = u.asInstanceOf[Tuple11[_, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(z._9, z._10)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[I9, I10]]]]
    }
    override def takeTail(u: TypeHead[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple11[TypeHead[I10], TypeHead[I10], TypeHead[I10], TypeHead[I10], TypeHead[I10], TypeHead[I10], TypeHead[
        I10
      ], TypeHead[I10], TypeHead[I10], TypeHead[I10], TypeHead[Y]]]
      z._11
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[I9, I10]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[I9, I10]
      ]]
      Tuple11(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[I9, I10]]], TypeTail[Y], TypeTail[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]]] =
      tuple22Plus10[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[I9, I10]]],
        TypeTail[Y],
        TypeTail[Tuple11TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Y]]
      ]]
  }
  def tuple22Plus11[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], I11]],
    Y,
    Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], I11]],
    Y,
    Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], I11]]] = {
      val z = u.asInstanceOf[Tuple12[_, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(new ZsgTuple2(z._9, z._10), z._11)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], I11]]]]
    }
    override def takeTail(u: TypeHead[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple12[TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[
        I11
      ], TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[I11], TypeHead[Y]]]
      z._12
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], I11]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[I9, I10], I11]
      ]]
      Tuple12(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1,
        x.i2.i1.i2,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], I11]]
    ], TypeTail[Y], TypeTail[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]]] =
      tuple22Plus11[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[Item2TypeHList[I9, I10], I11]]],
        TypeTail[Y],
        TypeTail[Tuple12TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Y]]
      ]]
  }
  def tuple22Plus12[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]],
    Y,
    Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]],
    Y,
    Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]]] = {
      val z = u.asInstanceOf[Tuple13[_, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12))
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]]]]
    }
    override def takeTail(u: TypeHead[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple13[TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[
        I12
      ], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[I12], TypeHead[Y]]]
      z._13
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]]
      ]]
      Tuple13(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1,
        x.i2.i1.i2,
        x.i2.i2.i1,
        x.i2.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]]
    ], TypeTail[Y], TypeTail[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]]] =
      tuple22Plus12[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]]]],
        TypeTail[Y],
        TypeTail[Tuple13TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Y]]
      ]]
  }
  def tuple22Plus13[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]],
    Y,
    Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]],
    Y,
    Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]]] = {
      val z = u.asInstanceOf[Tuple14[_, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), z._13)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]]]]
    }
    override def takeTail(u: TypeHead[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple14[TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[
        I13
      ], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[I13], TypeHead[Y]]]
      z._14
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], I13]
      ]]
      Tuple14(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1.i1,
        x.i2.i1.i1.i2,
        x.i2.i1.i2.i1,
        x.i2.i1.i2.i2,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]]
    ], TypeTail[Y], TypeTail[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]]] =
      tuple22Plus13[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], I13]]],
        TypeTail[Y],
        TypeTail[Tuple14TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Y]]
      ]]
  }
  def tuple22Plus14[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]],
    Y,
    Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]],
    Y,
    Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]]] = {
      val z = u.asInstanceOf[Tuple15[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)), new ZsgTuple2(z._13, z._14))
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]]]]
    }
    override def takeTail(u: TypeHead[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]]): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple15[TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[
        I14
      ], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[I14], TypeHead[Y]]]
      z._15
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[I13, I14]]
      ]]
      Tuple15(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1.i1,
        x.i2.i1.i1.i2,
        x.i2.i1.i2.i1,
        x.i2.i1.i2.i2,
        x.i2.i2.i1,
        x.i2.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]]
    ], TypeTail[Y], TypeTail[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]]] =
      tuple22Plus14[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[I13, I14]]]],
        TypeTail[Y],
        TypeTail[Tuple15TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Y]]
      ]]
  }
  def tuple22Plus15[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]],
    Y,
    Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]],
    Y,
    Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]
  ] {
    override def takeHead(u: TypeHead[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]]): TypeHead[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]]
    ] = {
      val z = u.asInstanceOf[Tuple16[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
          new ZsgTuple2(new ZsgTuple2(z._13, z._14), z._15)
        )
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple16[
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[I15],
        TypeHead[Y]
      ]]
      z._16
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], I15]]
      ]]
      Tuple16(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1.i1,
        x.i2.i1.i1.i2,
        x.i2.i1.i2.i1,
        x.i2.i1.i2.i2,
        x.i2.i2.i1.i1,
        x.i2.i2.i1.i2,
        x.i2.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]]
    ], TypeTail[Y], TypeTail[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]]] =
      tuple22Plus15[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[Y]]
        .asInstanceOf[Plus[
          TypeTail[Item2TypeHList[
            Item2TypeHList[
              Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
              Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
            ],
            Item2TypeHList[Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]], Item2TypeHList[Item2TypeHList[I13, I14], I15]]
          ]],
          TypeTail[Y],
          TypeTail[Tuple16TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Y]]
        ]]
  }
  def tuple22Plus16[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]],
    Y,
    Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]],
    Y,
    Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]]] = {
      val z = u.asInstanceOf[Tuple17[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
          new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
        ),
        new ZsgTuple2(
          new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
          new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
        )
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple17[
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[I16],
        TypeHead[Y]
      ]]
      z._17
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ]]
      Tuple17(
        x.i1.i1.i1.i1,
        x.i1.i1.i1.i2,
        x.i1.i1.i2.i1,
        x.i1.i1.i2.i2,
        x.i1.i2.i1.i1,
        x.i1.i2.i1.i2,
        x.i1.i2.i2.i1,
        x.i1.i2.i2.i2,
        x.i2.i1.i1.i1,
        x.i2.i1.i1.i2,
        x.i2.i1.i2.i1,
        x.i2.i1.i2.i2,
        x.i2.i2.i1.i1,
        x.i2.i2.i1.i2,
        x.i2.i2.i2.i1,
        x.i2.i2.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]]], TypeTail[Y], TypeTail[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]]] =
      tuple22Plus16[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[Y]]
        .asInstanceOf[Plus[
          TypeTail[Item2TypeHList[Item2TypeHList[
            Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
            Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
          ], Item2TypeHList[
            Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
            Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
          ]]],
          TypeTail[Y],
          TypeTail[Tuple17TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Y]]
        ]]
  }
  def tuple22Plus17[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    I17 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], I17],
    Y,
    Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], I17],
    Y,
    Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], I17]] = {
      val z = u.asInstanceOf[Tuple18[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
            new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
          ),
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
            new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
          )
        ),
        z._17
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], I17]]]
    }
    override def takeTail(
      u: TypeHead[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple18[
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[I17],
        TypeHead[Y]
      ]]
      z._18
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], I17]],
      y: TypeHead[Y]
    ): TypeHead[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ], I17]]
      Tuple18(
        x.i1.i1.i1.i1.i1,
        x.i1.i1.i1.i1.i2,
        x.i1.i1.i1.i2.i1,
        x.i1.i1.i1.i2.i2,
        x.i1.i1.i2.i1.i1,
        x.i1.i1.i2.i1.i2,
        x.i1.i1.i2.i2.i1,
        x.i1.i1.i2.i2.i2,
        x.i1.i2.i1.i1.i1,
        x.i1.i2.i1.i1.i2,
        x.i1.i2.i1.i2.i1,
        x.i1.i2.i1.i2.i2,
        x.i1.i2.i2.i1.i1,
        x.i1.i2.i2.i1.i2,
        x.i1.i2.i2.i2.i1,
        x.i1.i2.i2.i2.i2,
        x.i2,
        y
      ).asInstanceOf[TypeHead[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], I17]], TypeTail[Y], TypeTail[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]]] =
      tuple22Plus17[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[
        I17
      ], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
          Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
        ]], I17]],
        TypeTail[Y],
        TypeTail[Tuple18TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Y]]
      ]]
  }
  def tuple22Plus18[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    I17 <: TypeHList,
    I18 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[I17, I18]],
    Y,
    Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[I17, I18]],
    Y,
    Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[I17, I18]]] = {
      val z = u.asInstanceOf[Tuple19[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
            new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
          ),
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
            new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
          )
        ),
        new ZsgTuple2(z._17, z._18)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[I17, I18]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple19[
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[I18],
        TypeHead[Y]
      ]]
      z._19
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[I17, I18]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ], ZsgTuple2[I17, I18]]]
      Tuple19(
        x.i1.i1.i1.i1.i1,
        x.i1.i1.i1.i1.i2,
        x.i1.i1.i1.i2.i1,
        x.i1.i1.i1.i2.i2,
        x.i1.i1.i2.i1.i1,
        x.i1.i1.i2.i1.i2,
        x.i1.i1.i2.i2.i1,
        x.i1.i1.i2.i2.i2,
        x.i1.i2.i1.i1.i1,
        x.i1.i2.i1.i1.i2,
        x.i1.i2.i1.i2.i1,
        x.i1.i2.i1.i2.i2,
        x.i1.i2.i2.i1.i1,
        x.i1.i2.i2.i1.i2,
        x.i1.i2.i2.i2.i1,
        x.i1.i2.i2.i2.i2,
        x.i2.i1,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[I17, I18]]
    ], TypeTail[Y], TypeTail[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]]] =
      tuple22Plus18[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[
        I17
      ], TypeTail[I18], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
          Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
        ]], Item2TypeHList[I17, I18]]],
        TypeTail[Y],
        TypeTail[Tuple19TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Y]]
      ]]
  }
  def tuple22Plus19[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    I17 <: TypeHList,
    I18 <: TypeHList,
    I19 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]],
    Y,
    Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]],
    Y,
    Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]]] = {
      val z = u.asInstanceOf[Tuple20[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
            new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
          ),
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
            new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
          )
        ),
        new ZsgTuple2(new ZsgTuple2(z._17, z._18), z._19)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple20[
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[I19],
        TypeHead[Y]
      ]]
      z._20
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ], ZsgTuple2[ZsgTuple2[I17, I18], I19]]]
      Tuple20(
        x.i1.i1.i1.i1.i1,
        x.i1.i1.i1.i1.i2,
        x.i1.i1.i1.i2.i1,
        x.i1.i1.i1.i2.i2,
        x.i1.i1.i2.i1.i1,
        x.i1.i1.i2.i1.i2,
        x.i1.i1.i2.i2.i1,
        x.i1.i1.i2.i2.i2,
        x.i1.i2.i1.i1.i1,
        x.i1.i2.i1.i1.i2,
        x.i1.i2.i1.i2.i1,
        x.i1.i2.i1.i2.i2,
        x.i1.i2.i2.i1.i1,
        x.i1.i2.i2.i1.i2,
        x.i1.i2.i2.i2.i1,
        x.i1.i2.i2.i2.i2,
        x.i2.i1.i1,
        x.i2.i1.i2,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]]]
    }
    override def tail: Plus[TypeTail[
      Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]]
    ], TypeTail[Y], TypeTail[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]]] =
      tuple22Plus19[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[
        I17
      ], TypeTail[I18], TypeTail[I19], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
          Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
        ]], Item2TypeHList[Item2TypeHList[I17, I18], I19]]],
        TypeTail[Y],
        TypeTail[Tuple20TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Y]]
      ]]
  }
  def tuple22Plus20[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    I17 <: TypeHList,
    I18 <: TypeHList,
    I19 <: TypeHList,
    I20 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]],
    Y,
    Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]],
    Y,
    Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]]] = {
      val z = u.asInstanceOf[Tuple21[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
            new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
          ),
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
            new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
          )
        ),
        new ZsgTuple2(new ZsgTuple2(z._17, z._18), new ZsgTuple2(z._19, z._20))
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple21[
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[I20],
        TypeHead[Y]
      ]]
      z._21
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ], ZsgTuple2[ZsgTuple2[I17, I18], ZsgTuple2[I19, I20]]]]
      Tuple21(
        x.i1.i1.i1.i1.i1,
        x.i1.i1.i1.i1.i2,
        x.i1.i1.i1.i2.i1,
        x.i1.i1.i1.i2.i2,
        x.i1.i1.i2.i1.i1,
        x.i1.i1.i2.i1.i2,
        x.i1.i1.i2.i2.i1,
        x.i1.i1.i2.i2.i2,
        x.i1.i2.i1.i1.i1,
        x.i1.i2.i1.i1.i2,
        x.i1.i2.i1.i2.i1,
        x.i1.i2.i1.i2.i2,
        x.i1.i2.i2.i1.i1,
        x.i1.i2.i2.i1.i2,
        x.i1.i2.i2.i2.i1,
        x.i1.i2.i2.i2.i2,
        x.i2.i1.i1,
        x.i2.i1.i2,
        x.i2.i2.i1,
        x.i2.i2.i2,
        y
      ).asInstanceOf[TypeHead[
        Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]
      ]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]]], TypeTail[Y], TypeTail[
      Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]
    ]] =
      tuple22Plus20[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[
        I17
      ], TypeTail[I18], TypeTail[I19], TypeTail[I20], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
          Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
        ]], Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]]]],
        TypeTail[Y],
        TypeTail[Tuple21TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Y]]
      ]]
  }
  def tuple22Plus21[
    I1 <: TypeHList,
    I2 <: TypeHList,
    I3 <: TypeHList,
    I4 <: TypeHList,
    I5 <: TypeHList,
    I6 <: TypeHList,
    I7 <: TypeHList,
    I8 <: TypeHList,
    I9 <: TypeHList,
    I10 <: TypeHList,
    I11 <: TypeHList,
    I12 <: TypeHList,
    I13 <: TypeHList,
    I14 <: TypeHList,
    I15 <: TypeHList,
    I16 <: TypeHList,
    I17 <: TypeHList,
    I18 <: TypeHList,
    I19 <: TypeHList,
    I20 <: TypeHList,
    I21 <: TypeHList,
    Y <: TypeHList
  ]: Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]],
    Y,
    Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]
  ] = new Plus[
    Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]],
    Y,
    Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]
  ] {
    override def takeHead(
      u: TypeHead[Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]]
    ): TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]]] = {
      val z = u.asInstanceOf[Tuple22[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._1, z._2), new ZsgTuple2(z._3, z._4)),
            new ZsgTuple2(new ZsgTuple2(z._5, z._6), new ZsgTuple2(z._7, z._8))
          ),
          new ZsgTuple2(
            new ZsgTuple2(new ZsgTuple2(z._9, z._10), new ZsgTuple2(z._11, z._12)),
            new ZsgTuple2(new ZsgTuple2(z._13, z._14), new ZsgTuple2(z._15, z._16))
          )
        ),
        new ZsgTuple2(new ZsgTuple2(new ZsgTuple2(z._17, z._18), new ZsgTuple2(z._19, z._20)), z._21)
      ).asInstanceOf[TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]]]]
    }
    override def takeTail(
      u: TypeHead[Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]]
    ): TypeHead[Y] = {
      val z = u.asInstanceOf[Tuple22[TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[
        I21
      ], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[
        I21
      ], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[I21], TypeHead[Y]]]
      z._22
    }
    override def plus(
      u: TypeHead[Item2TypeHList[Item2TypeHList[Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
        Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
      ], Item2TypeHList[
        Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
        Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
      ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]]],
      y: TypeHead[Y]
    ): TypeHead[Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]] = {
      val x = u.asInstanceOf[ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[ZsgTuple2[I5, I6], ZsgTuple2[I7, I8]]],
        ZsgTuple2[ZsgTuple2[ZsgTuple2[I9, I10], ZsgTuple2[I11, I12]], ZsgTuple2[ZsgTuple2[I13, I14], ZsgTuple2[I15, I16]]]
      ], ZsgTuple2[ZsgTuple2[ZsgTuple2[I17, I18], ZsgTuple2[I19, I20]], I21]]]
      Tuple22(
        x.i1.i1.i1.i1.i1,
        x.i1.i1.i1.i1.i2,
        x.i1.i1.i1.i2.i1,
        x.i1.i1.i1.i2.i2,
        x.i1.i1.i2.i1.i1,
        x.i1.i1.i2.i1.i2,
        x.i1.i1.i2.i2.i1,
        x.i1.i1.i2.i2.i2,
        x.i1.i2.i1.i1.i1,
        x.i1.i2.i1.i1.i2,
        x.i1.i2.i1.i2.i1,
        x.i1.i2.i1.i2.i2,
        x.i1.i2.i2.i1.i1,
        x.i1.i2.i2.i1.i2,
        x.i1.i2.i2.i2.i1,
        x.i1.i2.i2.i2.i2,
        x.i2.i1.i1.i1,
        x.i2.i1.i1.i2,
        x.i2.i1.i2.i1,
        x.i2.i1.i2.i2,
        x.i2.i2,
        y
      ).asInstanceOf[TypeHead[
        Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]
      ]]
    }
    override def tail: Plus[TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
      Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
    ], Item2TypeHList[
      Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
      Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
    ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]]], TypeTail[Y], TypeTail[
      Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]
    ]] =
      tuple22Plus21[TypeTail[I1], TypeTail[I2], TypeTail[I3], TypeTail[I4], TypeTail[I5], TypeTail[I6], TypeTail[I7], TypeTail[
        I8
      ], TypeTail[I9], TypeTail[I10], TypeTail[I11], TypeTail[I12], TypeTail[I13], TypeTail[I14], TypeTail[I15], TypeTail[I16], TypeTail[
        I17
      ], TypeTail[I18], TypeTail[I19], TypeTail[I20], TypeTail[I21], TypeTail[Y]].asInstanceOf[Plus[
        TypeTail[Item2TypeHList[Item2TypeHList[Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I1, I2], Item2TypeHList[I3, I4]],
          Item2TypeHList[Item2TypeHList[I5, I6], Item2TypeHList[I7, I8]]
        ], Item2TypeHList[
          Item2TypeHList[Item2TypeHList[I9, I10], Item2TypeHList[I11, I12]],
          Item2TypeHList[Item2TypeHList[I13, I14], Item2TypeHList[I15, I16]]
        ]], Item2TypeHList[Item2TypeHList[Item2TypeHList[I17, I18], Item2TypeHList[I19, I20]], I21]]],
        TypeTail[Y],
        TypeTail[Tuple22TypeHList[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Y]]
      ]]
  }
}
