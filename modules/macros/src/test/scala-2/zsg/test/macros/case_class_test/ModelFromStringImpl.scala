package zsg.macros.case_class_test

trait ModelFromStringImpl[M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromStringImpl {
  implicit val outImplicit1: ModelFromStringImpl[String] = new ModelFromStringImpl[String] {
    override def getData(str: List[FieldModel]): (List[FieldModel], String) = {
      str match {
        case FieldModel(StringProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }

  implicit val outImplicit2: ModelFromStringImpl[Int] = new ModelFromStringImpl[Int] {
    override def getData(str: List[FieldModel]): (List[FieldModel], Int) = {
      str match {
        case FieldModel(IntProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }

  implicit val outImplicit3: ModelFromStringImpl[Long] = new ModelFromStringImpl[Long] {
    override def getData(str: List[FieldModel]): (List[FieldModel], Long) = {
      str match {
        case FieldModel(LongProperty(value), _, _, _) :: tail => (tail, value)
      }
    }
  }
}
