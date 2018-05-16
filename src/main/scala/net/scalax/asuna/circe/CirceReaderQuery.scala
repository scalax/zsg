package net.scalax.asuna.core

import cats.Traverse
import io.circe.{ Json, JsonObject }
import io.circe.syntax._
import cats.kernel.CommutativeSemigroup
import cats.data._
import cats.implicits._
import net.scalax.asuna.shape.DataShapeValue

trait CirceReaderQuery[U] {

  def shapeValue: DataShapeValue[U, CirceReaderAbs]

  implicit val commutativeSemigroupListString: CommutativeSemigroup[List[ValidateField]] = {
    new CommutativeSemigroup[List[ValidateField]] {
      override def combine(x: List[ValidateField], y: List[ValidateField]): List[ValidateField] = {
        x ::: y
      }
    }
  }

  def sequence[T](list: List[ValidatedNel[ValidateField, T]]): ValidatedNel[ValidateField, List[T]] = {
    Traverse[List].sequence[ValidatedNel[ValidateField, ?], T](list)
  }

  def validateJson(list: List[CirceReaderAbs], jsonObj: JsonObject): ValidatedNel[ValidateField, List[Any]] = {
    val validatedList = list.map { r =>
      val json = jsonObj.apply(r.keyName).getOrElse(Json.Null)
      implicit val decoder = r.circeReader
      val dataEt = json.as[r.DataType]
      (dataEt match {
        case Left(e) =>
          Validated.invalidNel(ValidateField(r.keyName, s"${r.keyName}的属性类型不匹配或不能为空"))
        case Right(d) =>
          r.validate(d)
      }): ValidatedNel[ValidateField, r.ResultType]
    }

    sequence(validatedList)
  }

  def tranData(jsonObj: JsonObject): ValidatedNel[ValidateField, U] = {
    val impl = implicitly[DataShape[DataShapeValue[U, CirceReaderAbs], U, DataShapeValue[U, CirceReaderAbs], CirceReaderAbs]]
    val rGroup = impl.toLawRep(impl.wrapRep(shapeValue))
    val listAnyData = validateJson(rGroup.reps, jsonObj)
    listAnyData.map(items => impl.takeData(DataGroup(items = items, subs = List.empty), shapeValue).current.right.get)

  }

}