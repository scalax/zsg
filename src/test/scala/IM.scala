import org.scalax.asuna.mapper._
import org.scalax.asuna.mapper.item._

object Test01 extends App {

  class IK extends KindContext {
    type M[I <: TypeParam] = (String => (String, I#H), (String, I#T#H) => String)
  }

  val c = new Context[IK] {

    override def isReverse: Boolean = false
    override def useHList: Boolean  = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
        x: (String => (String, X#H), (String, X#T#H) => String)
      , y: (String => (String, Y#H), (String, Y#T#H) => String)
      , p: Plus[X, Y, Z]
    ): (String => (String, Z#H), (String, Z#T#H) => String) = {
      ({ str: String =>
        val (i1Str, xh) = x._1(str)
        val (i2Str, yh) = y._1(i1Str)
        (i2Str, p.plus(xh, yh))
      }, { (str: String, i: Z#T#H) =>
        x._2(y._2(str, p.sub.takeHead(i)), p.sub.takeTail(i))
      })
    }

    override def start: (String => (String, XyyItem0), (String, XyyItem0) => String) = ((n: String) => (n, ArticleXyy0), (n, _: XyyItem0) => (n))

  }

  implicit def implicit1: Application[IK, String, TypeParam2[String, String]] = new Application[IK, String, TypeParam2[String, String]] {
    override def application(context: Context[IK]): (String => (String, String), (String, String) => String) = {
      ({ n: String =>
        val i = n.split(",")
        (i.tail.mkString, i.head)
      }, { (n1: String, n2: String) =>
        n2 + n1
      })
    }
  }

  implicit def implicit2: Application[IK, Int, TypeParam2[Int, Int]] = new Application[IK, Int, TypeParam2[Int, Int]] {
    override def application(context: Context[IK]): (String => (String, Int), (String, Int) => String) = {
      ({ n: String =>
        val i = n.split(",")
        (i.tail.mkString, i.head.toInt)
      }, { (n1: String, n2: Int) =>
        n2 + n1
      })
    }
  }

  val bar = c.lift(BuildTagContect.nodeTag(BuildTagContect.tag(new AppendTag[String], new AppendTag[Int]), BuildTagContect.tag(new AppendTag[Int])))

  val foo: Test01.IK#M[EatXyyType2[EatXyyType2[TypeParam2[String, String], TypeParam2[Int, Int]], EatXyyType1[TypeParam2[Int, Int]]]] = bar

  val (bar1, bar2): (String => (String, XyyItem2[XyyItem2[String, Int], XyyItem1[Int]]), (String, XyyItem2[XyyItem2[String, Int], XyyItem1[Int]]) => String) = bar

  val i0: XyyItem0 = ArticleXyy0
  println(bar2("", i0.eat(i0.eat("8").eat(2)).eat(i0.eat(2)))) //822

}
