package net.scalax.slick.async

import net.scalax.asuna.core._

import scala.language.higherKinds
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory
import shapeless._
import tag._

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ Await, Future, duration }

class DataModelHelperTest
  extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter {

  val logger = LoggerFactory.getLogger(getClass)

  def toCommon[A](f: A): A @@ OutputData = tag[OutputData](f)

  def toIO[A]: IOData[A, A] = new IOData[A, A] {
    override def apply(i: A): A = i
  }

  def toSub[A](c: A): OutputSubData[A, A] = new OutputSubData[A, A] {
    override val current = c
    override val sub = c
  }

  override def beforeAll: Unit = {
  }

  before {
  }

  after {
  }

  "hlist data" should "merge beautiful 1" in {
    val h = toCommon("sdfasf") :: toCommon("werfsefsfsg") :: toCommon(34234) :: toCommon(2342525L) :: HNil
    val testH = "sdfasf" :: "werfsefsfsg" :: 34234 :: 2342525L :: HNil
    DMHelper.compile(h) should be(testH)
  }

  it should "merge beautiful 2" in {
    val h = toCommon("sdfasf") :: toIO[String] :: toCommon(34234) :: toCommon(2342525L) :: HNil
    val testH = "sdfasf" :: "werfsefsfsg" :: 34234 :: 2342525L :: HNil
    DMHelper.compile(h).apply("werfsefsfsg" :: HNil) should be(testH)
  }

  it should "merge beautiful 3" in {
    val h = toCommon("sdfasf") :: toIO[String] :: toCommon(34234) :: toIO[Long] :: toIO[Int] :: HNil
    val testH = "sdfasf" :: "werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil
    DMHelper.compile(h).apply("werfsefsfsg" :: 2342525L :: 223264 :: HNil) should be(testH)
  }

  it should "merge beautiful 4" in {
    val h = toCommon("sdfasf") :: toIO[String] :: toSub(34234) :: toSub(2342525L) :: toIO[Int] :: HNil
    val testH = "sdfasf" :: "werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil
    val testH2 = 34234 :: 2342525L :: HNil
    val m = DMHelper.compile(h)
    m.current("werfsefsfsg" :: 223264 :: HNil) should be(testH)
    m.sub should be(testH2)
  }

}