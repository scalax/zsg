package net.scalax.asuna.model

import net.scalax.asuna.mapper.encoder.UnusedData
import org.scalatest._

class ModelTest extends FlatSpec with Matchers {

  case class A(i1: Int, i2: String, i3: Long, i4: String)
  case class B(i5: Char, i6: String)
  case class C(i2: String, i3: Long)

  "model" should "auto gen class" in {
    val a                        = A(12, "34", 56L, "78")
    val b                        = B('r', "abc")
    val foo: UnusedData[B, A, C] = (b, a)
    foo.unused should be(C("34", 56L))
  }

}
