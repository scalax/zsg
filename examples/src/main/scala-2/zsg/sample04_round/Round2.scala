package zsg
import scala.language.higherKinds

abstract class Map2[X1, X2, Z1, Z2] {
  def take1(z: Z1): X1
  def plus1(x: X1): Z1
  def take2(z: Z2): X2
  def plus2(x: X2): Z2
}

object Map2 {
  def p[X1, Z1]: Map2[X1, Z1, X1, Z1] =
    new Map2[X1, Z1, X1, Z1] {
      override def take1(z: X1): X1 = z
      override def plus1(x: X1): X1 = x
      override def take2(z: Z1): Z1 = z
      override def plus2(x: Z1): Z1 = x
    }
}

abstract class CContext[F[_, _], T1, T2] {

  def append[U1, U2, Z1, Z2](i: F[U1, U2], p: Plus2[U1, U2, T1, T2, Z1, Z2]): F[Z1, Z2]
  def map[Z1, Z2](p: Map2[T1, T2, Z1, Z2]): F[Z1, Z2]

}

object MM {

  def implicitP[F[_, _], T1, T2, U1, U2](
    i1: CContext[F, T1, T2],
    i2: CContext[F, U1, U2]
  ): CContext[F, ZsgTuple2[T1, U1], ZsgTuple2[T2, U2]] = {
    new CContext[F, ZsgTuple2[T1, U1], ZsgTuple2[T2, U2]] {
      override def append[Y1, Y2, Z1, Z2](i: F[Y1, Y2], p: Plus2[Y1, Y2, ZsgTuple2[T1, U1], ZsgTuple2[T2, U2], Z1, Z2]): F[Z1, Z2] = {
        i2.append(
          i1.append(
            i,
            new Plus2[Y1, Y2, T1, T2, ZsgTuple2[Y1, T1], ZsgTuple2[Y2, T2]] {
              override def takeHead1(z: ZsgTuple2[Y1, T1]): Y1    = z.i1
              override def takeTail1(z: ZsgTuple2[Y1, T1]): T1    = z.i2
              override def plus1(x: Y1, y: T1): ZsgTuple2[Y1, T1] = new ZsgTuple2(x, y)
              override def takeHead2(z: ZsgTuple2[Y2, T2]): Y2    = z.i1
              override def takeTail2(z: ZsgTuple2[Y2, T2]): T2    = z.i2
              override def plus2(x: Y2, y: T2): ZsgTuple2[Y2, T2] = new ZsgTuple2(x, y)
            }
          ),
          new Plus2[ZsgTuple2[Y1, T1], ZsgTuple2[Y2, T2], U1, U2, Z1, Z2] {
            override def takeHead1(z: Z1): ZsgTuple2[Y1, T1]    = new ZsgTuple2(p.takeHead1(z), p.takeTail1(z).i1)
            override def takeTail1(z: Z1): U1                   = p.takeTail1(z).i2
            override def plus1(x: ZsgTuple2[Y1, T1], y: U1): Z1 = p.plus1(x.i1, new ZsgTuple2(x.i2, y))
            override def takeHead2(z: Z2): ZsgTuple2[Y2, T2]    = new ZsgTuple2(p.takeHead2(z), p.takeTail2(z).i1)
            override def takeTail2(z: Z2): U2                   = p.takeTail2(z).i2
            override def plus2(x: ZsgTuple2[Y2, T2], y: U2): Z2 = p.plus2(x.i1, new ZsgTuple2(x.i2, y))
          }
        )
      }

      override def map[Z1, Z2](p: Map2[ZsgTuple2[T1, U1], ZsgTuple2[T2, U2], Z1, Z2]): F[Z1, Z2] = {
        i2.append(
          i1.map(Map2.p[T1, T2]),
          new Plus2[T1, T2, U1, U2, Z1, Z2] {
            override def takeHead1(z: Z1): T1    = p.take1(z).i1
            override def takeTail1(z: Z1): U1    = p.take1(z).i2
            override def plus1(x: T1, y: U1): Z1 = p.plus1(new ZsgTuple2(x, y))
            override def takeHead2(z: Z2): T2    = p.take2(z).i1
            override def takeTail2(z: Z2): U2    = p.take2(z).i2
            override def plus2(x: T2, y: U2): Z2 = p.plus2(new ZsgTuple2(x, y))
          }
        )
      }
    }
  }

  def implicitP2[F[_, _], T1, T2](i1: CContext[F, T1, T2]): CContext[F, T1, T2] = {
    new CContext[F, T1, T2] {
      override def append[Y1, Y2, Z1, Z2](i: F[Y1, Y2], p: Plus2[Y1, Y2, T1, T2, Z1, Z2]): F[Z1, Z2] = {
        i1.append(
          i,
          new Plus2[Y1, Y2, T1, T2, Z1, Z2] {
            override def takeHead1(z: Z1): Y1    = p.takeHead1(z)
            override def takeTail1(z: Z1): T1    = p.takeTail1(z)
            override def plus1(x: Y1, y: T1): Z1 = p.plus1(x, y)
            override def takeHead2(z: Z2): Y2    = p.takeHead2(z)
            override def takeTail2(z: Z2): T2    = p.takeTail2(z)
            override def plus2(x: Y2, y: T2): Z2 = p.plus2(x, y)
          }
        )
      }

      override def map[Z1, Z2](p: Map2[T1, T2, Z1, Z2]): F[Z1, Z2] = {
        i1.map(new Map2[T1, T2, Z1, Z2] {
          override def take1(z: Z1): T1 = p.take1(z)
          override def plus1(x: T1): Z1 = p.plus1(x)
          override def take2(z: Z2): T2 = p.take2(z)
          override def plus2(x: T2): Z2 = p.plus2(x)
        })
      }
    }
  }

}
