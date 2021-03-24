package zsg.macros.case_class_test

import zsg.PropertyTag

trait ModelFromStringImpl[I, M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromStringImpl {
  implicit val outImplicit1: ModelFromStringImpl[PropertyTag[String], String] = new ModelFromStringImpl[PropertyTag[String], String] {
    override def getData(str: List[FieldModel]): (List[FieldModel], String) = {
      str match {
        case FieldModel(StringProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }

  implicit val outImplicit2: ModelFromStringImpl[PropertyTag[Int], Int] = new ModelFromStringImpl[PropertyTag[Int], Int] {
    override def getData(str: List[FieldModel]): (List[FieldModel], Int) = {
      str match {
        case FieldModel(IntProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }

  implicit val outImplicit3: ModelFromStringImpl[PropertyTag[Long], Long] = new ModelFromStringImpl[PropertyTag[Long], Long] {
    override def getData(str: List[FieldModel]): (List[FieldModel], Long) = {
      str match {
        case FieldModel(LongProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }
}
