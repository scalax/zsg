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

  def toSubOnly[A](c: A): SubOnly[A] = new SubOnly[A] {
    override val sub = c
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

  //DataModelHelper2 start
  "hlist data" should "merge beautiful 1" in {
    val h = toCommon("werfsefsfsg") :: toCommon(34234) :: toCommon(2342525L) :: HNil
    val testH = "werfsefsfsg" :: 34234 :: 2342525L :: HNil
    DMHelper.compile(h) should be(testH)
  }

  it should "merge beautiful 2" in {
    val h = toIO[String] :: toCommon(34234) :: toCommon(2342525L) :: HNil
    val testH = "werfsefsfsg" :: 34234 :: 2342525L :: HNil
    DMHelper.compile(h).apply("werfsefsfsg" :: HNil) should be(testH)
  }

  it should "merge beautiful 3" in {
    val h = toSub("sdfasf") :: toCommon("sdfsrgertg") :: toCommon(34234) :: HNil
    val testH = "sdfasf" :: "sdfsrgertg" :: 34234 :: HNil
    val subH = "sdfasf" :: HNil
    DMHelper.compile(h).current should be(testH)
    DMHelper.compile(h).sub should be(subH)
  }

  it should "merge beautiful 4" in {
    val h = toSubOnly("sdfasf") :: toCommon("sdfsrgertg") :: toCommon(34234) :: HNil
    val testH = "sdfsrgertg" :: 34234 :: HNil
    val subH = "sdfasf" :: HNil
    DMHelper.compile(h).current should be(testH)
    DMHelper.compile(h).sub should be(subH)
  }

  it should "merge beautiful 5" in {
    val h1 = toIO[String] :: toSub(34234) :: toSub(2342525L) :: toIO[Int] :: HNil
    val h = DMHelper.compile(h1) :: toCommon("sdfasf") :: HNil
    val testH = ("werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil) :: "sdfasf" :: HNil
    val testH2 = (34234 :: 2342525L :: HNil) :: HNil
    val m = DMHelper.compile(h)
    m.apply(("werfsefsfsg" :: 223264 :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }
  //DataModelHelper2 end

  //DataModelHelper3 start
  it should "merge beautiful 6" in {
    val h = toCommon("34234") :: toIO[Long] :: HNil
    val testH = "34234" :: 2342525L :: HNil
    DMHelper.compile(h).apply(2342525L :: HNil) should be(testH)
  }

  it should "merge beautiful 7" in {
    val h = toIO[String] :: toIO[Long] :: HNil
    val testH = "34234" :: 2342525L :: HNil
    DMHelper.compile(h).apply("34234" :: 2342525L :: HNil) should be(testH)
  }

  it should "merge beautiful 8" in {
    val h1 = toIO[String] :: toSub(34234) :: toSub(2342525L) :: toIO[Int] :: HNil
    val h = DMHelper.compile(h1) :: toIO[String] :: HNil
    val testH = ("werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil) :: "123aabbcc" :: HNil
    val testH2 = (34234 :: 2342525L :: HNil) :: HNil
    val m = DMHelper.compile(h)
    m.apply(("werfsefsfsg" :: 223264 :: HNil) :: "123aabbcc" :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 9" in {
    val h = toSubOnly("12f46se") :: toIO[Long] :: HNil
    val testH = 2342525L :: HNil
    val testH2 = "12f46se" :: HNil
    DMHelper.compile(h).apply(2342525L :: HNil) should be(testH)
    DMHelper.compile(h).sub should be(testH2)
  }
  //DataModelHelper3 end

  //DataModelHelper4 start
  it should "merge beautiful 10" in {
    val h = toCommon("34234") :: toSub(2342525L) :: HNil
    val testH = "34234" :: 2342525L :: HNil
    val testH2 = 2342525L :: HNil
    DMHelper.compile(h).current should be(testH)
    DMHelper.compile(h).sub should be(testH2)
  }

  it should "merge beautiful 11" in {
    val h = toIO[Long] :: toSub("leinvitr") :: HNil
    val testH = 2342525L :: "leinvitr" :: HNil
    val testH2 = "leinvitr" :: HNil
    DMHelper.compile(h).apply(2342525L :: HNil) should be(testH)
    DMHelper.compile(h).sub should be(testH2)
  }

  it should "merge beautiful 12" in {
    val h = toSub(34234) :: toSub(2342525L) :: HNil
    val testH = 34234 :: 2342525L :: HNil
    val m = DMHelper.compile(h)
    m.current should be(testH)
    m.sub should be(testH)
  }

  it should "merge beautiful 13" in {
    val h1 = toIO[String] :: toSub(34234) :: toSub(2342525L) :: toIO[Int] :: HNil
    val h = DMHelper.compile(h1) :: toSub("adfggert") :: HNil
    val testH = ("werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil) :: "adfggert" :: HNil
    val testH2 = (34234 :: 2342525L :: HNil) :: "adfggert" :: HNil
    val m = DMHelper.compile(h)
    m.apply(("werfsefsfsg" :: 223264 :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 14" in {
    val h = toSubOnly(34234) :: toSub(2342525L) :: HNil
    val testH = 2342525L :: HNil
    val testH2 = 34234 :: 2342525L :: HNil
    val m = DMHelper.compile(h)
    m.current should be(testH)
    m.sub should be(testH2)
  }
  //DataModelHelper4 end

  //DataModelHelper5 start
  it should "merge beautiful 15" in {
    val h1 = toIO[String] :: toSub(34234) :: toSub(2342525L) :: toIO[Int] :: HNil
    val h2 = toIO[Long] :: toSub(2342) :: toSub(23424L) :: toCommon("sdfsdfser") :: toIO[String] :: HNil
    val h = DMHelper.compile(h1) :: DMHelper.compile(h2) :: HNil
    val testH = ("werfsefsfsg" :: 34234 :: 2342525L :: 223264 :: HNil) :: (23424L :: 2342 :: 23424L :: "sdfsdfser" :: "sdfsrere" :: HNil) :: HNil
    val testH2 = (34234 :: 2342525L :: HNil) :: (2342 :: 23424L :: HNil) :: HNil
    val m = DMHelper.compile(h)
    m.apply(("werfsefsfsg" :: 223264 :: HNil) :: (23424L :: "sdfsrere" :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 16" in {
    val h2 = toIO[Long] :: toSub(2342) :: toSub(23424L) :: toCommon("sdfsdfser") :: toIO[String] :: HNil
    val h = toSubOnly("sfster") :: DMHelper.compile(h2) :: HNil
    val testH = (23424L :: 2342 :: 23424L :: "sdfsdfser" :: "sdfsrere" :: HNil) :: HNil
    val testH2 = "sfster" :: (2342 :: 23424L :: HNil) :: HNil
    val m = DMHelper.compile(h)
    m.apply((23424L :: "sdfsrere" :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }
  //DataModelHelper5 end

  //DataModelHelper6 start
  it should "merge beautiful 17" in {
    val h = toCommon("sddfsate") :: toSubOnly(234235L) :: HNil
    val testH = "sddfsate" :: HNil
    val testH2 = 234235L :: HNil
    val m = DMHelper.compile(h)
    m.current should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 18" in {
    val h = toIO[String] :: toSubOnly(234235L) :: HNil
    val testH = "sddfsate" :: HNil
    val testH2 = 234235L :: HNil
    val m = DMHelper.compile(h)
    m.apply("sddfsate" :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 19" in {
    val h = toSub("sddfsate") :: toSubOnly(234235L) :: HNil
    val testH = "sddfsate" :: HNil
    val testH2 = "sddfsate" :: 234235L :: HNil
    val m = DMHelper.compile(h)
    m.current should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 20" in {
    val h1 = toIO[Long] :: toSub(2342) :: toSub(23424L) :: toCommon("sdfsdfser") :: toIO[String] :: HNil
    val h = DMHelper.compile(h1) :: toSubOnly(49786L) :: HNil
    val testH = (23424L :: 2342 :: 23424L :: "sdfsdfser" :: "sdfsrere" :: HNil) :: HNil
    val testH2 = (2342 :: 23424L :: HNil) :: 49786L :: HNil
    val m = DMHelper.compile(h)
    m.apply((23424L :: "sdfsrere" :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 21" in {
    val h1 = toIO[Long] :: toSub(2342) :: toSub(23424L) :: toCommon("sdfsdfser") :: toIO[String] :: HNil
    val h = DMHelper.compile(h1) :: toSubOnly(49786L) :: HNil
    val testH = (23424L :: 2342 :: 23424L :: "sdfsdfser" :: "sdfsrere" :: HNil) :: HNil
    val testH2 = (2342 :: 23424L :: HNil) :: 49786L :: HNil
    val m = DMHelper.compile(h)
    m.apply((23424L :: "sdfsrere" :: HNil) :: HNil) should be(testH)
    m.sub should be(testH2)
  }

  it should "merge beautiful 22" in {
    val h = toSubOnly("dfwertr") :: toSubOnly(15645L) :: HNil
    val testH = "dfwertr" :: 15645L :: HNil
    val m = DMHelper.compile(h)
    m.sub should be(testH)
  }
  //DataModelHelper6 end

}