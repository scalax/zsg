package asuna.debug
import scala.annotation.implicitNotFound
class `The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context1) to .find2.debug(context1) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context1) to .find3.debug(context1) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context1) to .find4.debug(context1) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context1) to .find5.debug(context1) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context1) to .find6.debug(context1) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication1[Message, F[_], Tag, X1] extends asuna.Application1[F, Tag, X1] {
  override def application(context: asuna.Context1[F]): F[X1]
}
object NodeDebugApplication1 {
  implicit def nodeDebugApplication1Implicit[Message, F[_], Tag, X1](implicit app: asuna.Application1[F, Tag, X1]): NodeDebugApplication1[Message, F, Tag, X1] = {
    new NodeDebugApplication1[Message, F, Tag, X1] {
      override def application(context: asuna.Context1[F]): F[X1] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication1[ProName, Index, F[_], Tag, X1] extends asuna.Application1[F, Tag, X1] {
  override def application(context: asuna.Context1[F]): F[X1]
}
object TupleDebugApplication1 {
  implicit def tupleDebugApplication1Implicit[ProName, Index, F[_], Tag, X1](
    implicit app: asuna.Application1[F, Tag, X1]
  ): TupleDebugApplication1[ProName, Index, F, Tag, X1] = {
    new TupleDebugApplication1[ProName, Index, F, Tag, X1] {
      override def application(context: asuna.Context1[F]): F[X1] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context2) to .find2.debug(context2) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context2) to .find3.debug(context2) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context2) to .find4.debug(context2) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context2) to .find5.debug(context2) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context2) to .find6.debug(context2) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication2[Message, F[_, _], Tag, X1, X2] extends asuna.Application2[F, Tag, X1, X2] {
  override def application(context: asuna.Context2[F]): F[X1, X2]
}
object NodeDebugApplication2 {
  implicit def nodeDebugApplication2Implicit[Message, F[_, _], Tag, X1, X2](
    implicit app: asuna.Application2[F, Tag, X1, X2]
  ): NodeDebugApplication2[Message, F, Tag, X1, X2] = {
    new NodeDebugApplication2[Message, F, Tag, X1, X2] {
      override def application(context: asuna.Context2[F]): F[X1, X2] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication2[ProName, Index, F[_, _], Tag, X1, X2] extends asuna.Application2[F, Tag, X1, X2] {
  override def application(context: asuna.Context2[F]): F[X1, X2]
}
object TupleDebugApplication2 {
  implicit def tupleDebugApplication2Implicit[ProName, Index, F[_, _], Tag, X1, X2](
    implicit app: asuna.Application2[F, Tag, X1, X2]
  ): TupleDebugApplication2[ProName, Index, F, Tag, X1, X2] = {
    new TupleDebugApplication2[ProName, Index, F, Tag, X1, X2] {
      override def application(context: asuna.Context2[F]): F[X1, X2] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change .debug(context3) to .find1.debug(context3) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context3) to .find2.debug(context3) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context3) to .find3.debug(context3) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context3) to .find4.debug(context3) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context3) to .find5.debug(context3) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context3) to .find6.debug(context3) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication3[Message, F[_, _, _], Tag, X1, X2, X3] extends asuna.Application3[F, Tag, X1, X2, X3] {
  override def application(context: asuna.Context3[F]): F[X1, X2, X3]
}
object NodeDebugApplication3 {
  implicit def nodeDebugApplication3Implicit[Message, F[_, _, _], Tag, X1, X2, X3](
    implicit app: asuna.Application3[F, Tag, X1, X2, X3]
  ): NodeDebugApplication3[Message, F, Tag, X1, X2, X3] = {
    new NodeDebugApplication3[Message, F, Tag, X1, X2, X3] {
      override def application(context: asuna.Context3[F]): F[X1, X2, X3] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication3[ProName, Index, F[_, _, _], Tag, X1, X2, X3] extends asuna.Application3[F, Tag, X1, X2, X3] {
  override def application(context: asuna.Context3[F]): F[X1, X2, X3]
}
object TupleDebugApplication3 {
  implicit def tupleDebugApplication3Implicit[ProName, Index, F[_, _, _], Tag, X1, X2, X3](
    implicit app: asuna.Application3[F, Tag, X1, X2, X3]
  ): TupleDebugApplication3[ProName, Index, F, Tag, X1, X2, X3] = {
    new TupleDebugApplication3[ProName, Index, F, Tag, X1, X2, X3] {
      override def application(context: asuna.Context3[F]): F[X1, X2, X3] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change .debug(context4) to .find1.debug(context4) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context4) to .find2.debug(context4) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context4) to .find3.debug(context4) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context4) to .find4.debug(context4) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context4) to .find5.debug(context4) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context4) to .find6.debug(context4) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication4[Message, F[_, _, _, _], Tag, X1, X2, X3, X4] extends asuna.Application4[F, Tag, X1, X2, X3, X4] {
  override def application(context: asuna.Context4[F]): F[X1, X2, X3, X4]
}
object NodeDebugApplication4 {
  implicit def nodeDebugApplication4Implicit[Message, F[_, _, _, _], Tag, X1, X2, X3, X4](
    implicit app: asuna.Application4[F, Tag, X1, X2, X3, X4]
  ): NodeDebugApplication4[Message, F, Tag, X1, X2, X3, X4] = {
    new NodeDebugApplication4[Message, F, Tag, X1, X2, X3, X4] {
      override def application(context: asuna.Context4[F]): F[X1, X2, X3, X4] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication4[ProName, Index, F[_, _, _, _], Tag, X1, X2, X3, X4] extends asuna.Application4[F, Tag, X1, X2, X3, X4] {
  override def application(context: asuna.Context4[F]): F[X1, X2, X3, X4]
}
object TupleDebugApplication4 {
  implicit def tupleDebugApplication4Implicit[ProName, Index, F[_, _, _, _], Tag, X1, X2, X3, X4](
    implicit app: asuna.Application4[F, Tag, X1, X2, X3, X4]
  ): TupleDebugApplication4[ProName, Index, F, Tag, X1, X2, X3, X4] = {
    new TupleDebugApplication4[ProName, Index, F, Tag, X1, X2, X3, X4] {
      override def application(context: asuna.Context4[F]): F[X1, X2, X3, X4] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change .debug(context5) to .find1.debug(context5) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context5) to .find2.debug(context5) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context5) to .find3.debug(context5) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context5) to .find4.debug(context5) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context5) to .find5.debug(context5) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context5) to .find6.debug(context5) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication5[Message, F[_, _, _, _, _], Tag, X1, X2, X3, X4, X5] extends asuna.Application5[F, Tag, X1, X2, X3, X4, X5] {
  override def application(context: asuna.Context5[F]): F[X1, X2, X3, X4, X5]
}
object NodeDebugApplication5 {
  implicit def nodeDebugApplication5Implicit[Message, F[_, _, _, _, _], Tag, X1, X2, X3, X4, X5](
    implicit app: asuna.Application5[F, Tag, X1, X2, X3, X4, X5]
  ): NodeDebugApplication5[Message, F, Tag, X1, X2, X3, X4, X5] = {
    new NodeDebugApplication5[Message, F, Tag, X1, X2, X3, X4, X5] {
      override def application(context: asuna.Context5[F]): F[X1, X2, X3, X4, X5] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication5[ProName, Index, F[_, _, _, _, _], Tag, X1, X2, X3, X4, X5] extends asuna.Application5[F, Tag, X1, X2, X3, X4, X5] {
  override def application(context: asuna.Context5[F]): F[X1, X2, X3, X4, X5]
}
object TupleDebugApplication5 {
  implicit def tupleDebugApplication5Implicit[ProName, Index, F[_, _, _, _, _], Tag, X1, X2, X3, X4, X5](
    implicit app: asuna.Application5[F, Tag, X1, X2, X3, X4, X5]
  ): TupleDebugApplication5[ProName, Index, F, Tag, X1, X2, X3, X4, X5] = {
    new TupleDebugApplication5[ProName, Index, F, Tag, X1, X2, X3, X4, X5] {
      override def application(context: asuna.Context5[F]): F[X1, X2, X3, X4, X5] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change .debug(context6) to .find1.debug(context6) to continue.`
class `The implicit not founded property's index is 2. Please change .debug(context6) to .find2.debug(context6) to continue.`
class `The implicit not founded property's index is 3. Please change .debug(context6) to .find3.debug(context6) to continue.`
class `The implicit not founded property's index is 4. Please change .debug(context6) to .find4.debug(context6) to continue.`
class `The implicit not founded property's index is 5. Please change .debug(context6) to .find5.debug(context6) to continue.`
class `The implicit not founded property's index is 6. Please change .debug(context6) to .find6.debug(context6) to continue.`
@implicitNotFound(msg = "${Message}")
trait NodeDebugApplication6[Message, F[_, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6] extends asuna.Application6[F, Tag, X1, X2, X3, X4, X5, X6] {
  override def application(context: asuna.Context6[F]): F[X1, X2, X3, X4, X5, X6]
}
object NodeDebugApplication6 {
  implicit def nodeDebugApplication6Implicit[Message, F[_, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6](
    implicit app: asuna.Application6[F, Tag, X1, X2, X3, X4, X5, X6]
  ): NodeDebugApplication6[Message, F, Tag, X1, X2, X3, X4, X5, X6] = {
    new NodeDebugApplication6[Message, F, Tag, X1, X2, X3, X4, X5, X6] {
      override def application(context: asuna.Context6[F]): F[X1, X2, X3, X4, X5, X6] = app.application(context)
    }
  }
}
@implicitNotFound(msg = "ProName: ${ProName}\nindex: ${Index}")
trait TupleDebugApplication6[ProName, Index, F[_, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6] extends asuna.Application6[F, Tag, X1, X2, X3, X4, X5, X6] {
  override def application(context: asuna.Context6[F]): F[X1, X2, X3, X4, X5, X6]
}
object TupleDebugApplication6 {
  implicit def tupleDebugApplication6Implicit[ProName, Index, F[_, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6](
    implicit app: asuna.Application6[F, Tag, X1, X2, X3, X4, X5, X6]
  ): TupleDebugApplication6[ProName, Index, F, Tag, X1, X2, X3, X4, X5, X6] = {
    new TupleDebugApplication6[ProName, Index, F, Tag, X1, X2, X3, X4, X5, X6] {
      override def application(context: asuna.Context6[F]): F[X1, X2, X3, X4, X5, X6] = app.application(context)
    }
  }
}
