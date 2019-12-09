package asuna.debug
class `The implicit not founded property's index is 1. Please change findX(context1) to .findX.find1(context1) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context1) to .findX.find2(context1) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context1) to .findX.find3(context1) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context1) to .findX.find4(context1) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context1) to .findX.find5(context1) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context1) to .findX.find6(context1) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context1) to .findX.find7(context1) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context1) to .findX.find8(context1) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context2) to .findX.find1(context2) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context2) to .findX.find2(context2) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context2) to .findX.find3(context2) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context2) to .findX.find4(context2) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context2) to .findX.find5(context2) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context2) to .findX.find6(context2) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context2) to .findX.find7(context2) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context2) to .findX.find8(context2) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context3) to .findX.find1(context3) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context3) to .findX.find2(context3) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context3) to .findX.find3(context3) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context3) to .findX.find4(context3) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context3) to .findX.find5(context3) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context3) to .findX.find6(context3) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context3) to .findX.find7(context3) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context3) to .findX.find8(context3) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context4) to .findX.find1(context4) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context4) to .findX.find2(context4) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context4) to .findX.find3(context4) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context4) to .findX.find4(context4) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context4) to .findX.find5(context4) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context4) to .findX.find6(context4) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context4) to .findX.find7(context4) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context4) to .findX.find8(context4) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context5) to .findX.find1(context5) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context5) to .findX.find2(context5) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context5) to .findX.find3(context5) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context5) to .findX.find4(context5) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context5) to .findX.find5(context5) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context5) to .findX.find6(context5) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context5) to .findX.find7(context5) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context5) to .findX.find8(context5) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context6) to .findX.find1(context6) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context6) to .findX.find2(context6) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context6) to .findX.find3(context6) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context6) to .findX.find4(context6) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context6) to .findX.find5(context6) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context6) to .findX.find6(context6) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context6) to .findX.find7(context6) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context6) to .findX.find8(context6) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
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
class `The implicit not founded property's index is 1. Please change findX(context7) to .findX.find1(context7) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context7) to .findX.find2(context7) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context7) to .findX.find3(context7) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context7) to .findX.find4(context7) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context7) to .findX.find5(context7) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context7) to .findX.find6(context7) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context7) to .findX.find7(context7) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context7) to .findX.find8(context7) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
trait NodeDebugApplication7[Message, F[_, _, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6, X7] extends asuna.Application7[F, Tag, X1, X2, X3, X4, X5, X6, X7] {
  override def application(context: asuna.Context7[F]): F[X1, X2, X3, X4, X5, X6, X7]
}
object NodeDebugApplication7 {
  implicit def nodeDebugApplication7Implicit[Message, F[_, _, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6, X7](
    implicit app: asuna.Application7[F, Tag, X1, X2, X3, X4, X5, X6, X7]
  ): NodeDebugApplication7[Message, F, Tag, X1, X2, X3, X4, X5, X6, X7] = {
    new NodeDebugApplication7[Message, F, Tag, X1, X2, X3, X4, X5, X6, X7] {
      override def application(context: asuna.Context7[F]): F[X1, X2, X3, X4, X5, X6, X7] = app.application(context)
    }
  }
}
class `The implicit not founded property's index is 1. Please change findX(context8) to .findX.find1(context8) to continue debug.`
class `The implicit not founded property's index is 2. Please change findX(context8) to .findX.find2(context8) to continue debug.`
class `The implicit not founded property's index is 3. Please change findX(context8) to .findX.find3(context8) to continue debug.`
class `The implicit not founded property's index is 4. Please change findX(context8) to .findX.find4(context8) to continue debug.`
class `The implicit not founded property's index is 5. Please change findX(context8) to .findX.find5(context8) to continue debug.`
class `The implicit not founded property's index is 6. Please change findX(context8) to .findX.find6(context8) to continue debug.`
class `The implicit not founded property's index is 7. Please change findX(context8) to .findX.find7(context8) to continue debug.`
class `The implicit not founded property's index is 8. Please change findX(context8) to .findX.find8(context8) to continue debug.`
@scala.annotation.implicitNotFound(msg = "${Message}")
trait NodeDebugApplication8[Message, F[_, _, _, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6, X7, X8] extends asuna.Application8[F, Tag, X1, X2, X3, X4, X5, X6, X7, X8] {
  override def application(context: asuna.Context8[F]): F[X1, X2, X3, X4, X5, X6, X7, X8]
}
object NodeDebugApplication8 {
  implicit def nodeDebugApplication8Implicit[Message, F[_, _, _, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6, X7, X8](
    implicit app: asuna.Application8[F, Tag, X1, X2, X3, X4, X5, X6, X7, X8]
  ): NodeDebugApplication8[Message, F, Tag, X1, X2, X3, X4, X5, X6, X7, X8] = {
    new NodeDebugApplication8[Message, F, Tag, X1, X2, X3, X4, X5, X6, X7, X8] {
      override def application(context: asuna.Context8[F]): F[X1, X2, X3, X4, X5, X6, X7, X8] = app.application(context)
    }
  }
}
