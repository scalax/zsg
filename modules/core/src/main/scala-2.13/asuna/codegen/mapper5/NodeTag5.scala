package asuna
import debug._
final class NodeTag5[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag] extends TupleTag {
  def find1: T1 = throw new Exception("Debuging...")
  def find2: T2 = throw new Exception("Debuging...")
  def find3: T3 = throw new Exception("Debuging...")
  def find4: T4 = throw new Exception("Debuging...")
  def find5: T5 = throw new Exception("Debuging...")
  def find[F[_], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1](c: Context1[F])(
    implicit
    app1: asuna.debug.NodeDebugApplication1[
      `The implicit not founded property's index is 1. Please change .find(context1) to .find1.find(context1) to continue debug.`,
      F,
      T1,
      X1_C1
    ],
    app2: asuna.debug.NodeDebugApplication1[
      `The implicit not founded property's index is 2. Please change .find(context1) to .find2.find(context1) to continue debug.`,
      F,
      T2,
      X2_C1
    ],
    app3: asuna.debug.NodeDebugApplication1[
      `The implicit not founded property's index is 3. Please change .find(context1) to .find3.find(context1) to continue debug.`,
      F,
      T3,
      X3_C1
    ],
    app4: asuna.debug.NodeDebugApplication1[
      `The implicit not founded property's index is 4. Please change .find(context1) to .find4.find(context1) to continue debug.`,
      F,
      T4,
      X4_C1
    ],
    app5: asuna.debug.NodeDebugApplication1[
      `The implicit not founded property's index is 5. Please change .find(context1) to .find5.find(context1) to continue debug.`,
      F,
      T5,
      X5_C1
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum1(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2](c: Context2[F])(
    implicit
    app1: asuna.debug.NodeDebugApplication2[
      `The implicit not founded property's index is 1. Please change .find(context2) to .find1.find(context2) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2
    ],
    app2: asuna.debug.NodeDebugApplication2[
      `The implicit not founded property's index is 2. Please change .find(context2) to .find2.find(context2) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2
    ],
    app3: asuna.debug.NodeDebugApplication2[
      `The implicit not founded property's index is 3. Please change .find(context2) to .find3.find(context2) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2
    ],
    app4: asuna.debug.NodeDebugApplication2[
      `The implicit not founded property's index is 4. Please change .find(context2) to .find4.find(context2) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2
    ],
    app5: asuna.debug.NodeDebugApplication2[
      `The implicit not founded property's index is 5. Please change .find(context2) to .find5.find(context2) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum2(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3](c: Context3[F])(
    implicit
    app1: asuna.debug.NodeDebugApplication3[
      `The implicit not founded property's index is 1. Please change .find(context3) to .find1.find(context3) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3
    ],
    app2: asuna.debug.NodeDebugApplication3[
      `The implicit not founded property's index is 2. Please change .find(context3) to .find2.find(context3) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3
    ],
    app3: asuna.debug.NodeDebugApplication3[
      `The implicit not founded property's index is 3. Please change .find(context3) to .find3.find(context3) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3
    ],
    app4: asuna.debug.NodeDebugApplication3[
      `The implicit not founded property's index is 4. Please change .find(context3) to .find4.find(context3) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3
    ],
    app5: asuna.debug.NodeDebugApplication3[
      `The implicit not founded property's index is 5. Please change .find(context3) to .find5.find(context3) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum3(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X1_C4, X2_C4, X3_C4, X4_C4, X5_C4](
    c: Context4[F]
  )(
    implicit
    app1: asuna.debug.NodeDebugApplication4[
      `The implicit not founded property's index is 1. Please change .find(context4) to .find1.find(context4) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4
    ],
    app2: asuna.debug.NodeDebugApplication4[
      `The implicit not founded property's index is 2. Please change .find(context4) to .find2.find(context4) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4
    ],
    app3: asuna.debug.NodeDebugApplication4[
      `The implicit not founded property's index is 3. Please change .find(context4) to .find3.find(context4) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3,
      X3_C4
    ],
    app4: asuna.debug.NodeDebugApplication4[
      `The implicit not founded property's index is 4. Please change .find(context4) to .find4.find(context4) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3,
      X4_C4
    ],
    app5: asuna.debug.NodeDebugApplication4[
      `The implicit not founded property's index is 5. Please change .find(context4) to .find5.find(context4) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3,
      X5_C4
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3], AsunaTuple5[
    X1_C4,
    X2_C4,
    X3_C4,
    X4_C4,
    X5_C4
  ]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum4(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X1_C5, X2_C5, X3_C5, X4_C5, X5_C5](
    c: Context5[F]
  )(
    implicit
    app1: asuna.debug.NodeDebugApplication5[
      `The implicit not founded property's index is 1. Please change .find(context5) to .find1.find(context5) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5
    ],
    app2: asuna.debug.NodeDebugApplication5[
      `The implicit not founded property's index is 2. Please change .find(context5) to .find2.find(context5) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5
    ],
    app3: asuna.debug.NodeDebugApplication5[
      `The implicit not founded property's index is 3. Please change .find(context5) to .find3.find(context5) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3,
      X3_C4,
      X3_C5
    ],
    app4: asuna.debug.NodeDebugApplication5[
      `The implicit not founded property's index is 4. Please change .find(context5) to .find4.find(context5) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3,
      X4_C4,
      X4_C5
    ],
    app5: asuna.debug.NodeDebugApplication5[
      `The implicit not founded property's index is 5. Please change .find(context5) to .find5.find(context5) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3,
      X5_C4,
      X5_C5
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3], AsunaTuple5[
    X1_C4,
    X2_C4,
    X3_C4,
    X4_C4,
    X5_C4
  ], AsunaTuple5[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum5(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _, _, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X1_C6, X2_C6, X3_C6, X4_C6, X5_C6](
    c: Context6[F]
  )(
    implicit
    app1: asuna.debug.NodeDebugApplication6[
      `The implicit not founded property's index is 1. Please change .find(context6) to .find1.find(context6) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6
    ],
    app2: asuna.debug.NodeDebugApplication6[
      `The implicit not founded property's index is 2. Please change .find(context6) to .find2.find(context6) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6
    ],
    app3: asuna.debug.NodeDebugApplication6[
      `The implicit not founded property's index is 3. Please change .find(context6) to .find3.find(context6) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3,
      X3_C4,
      X3_C5,
      X3_C6
    ],
    app4: asuna.debug.NodeDebugApplication6[
      `The implicit not founded property's index is 4. Please change .find(context6) to .find4.find(context6) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3,
      X4_C4,
      X4_C5,
      X4_C6
    ],
    app5: asuna.debug.NodeDebugApplication6[
      `The implicit not founded property's index is 5. Please change .find(context6) to .find5.find(context6) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3,
      X5_C4,
      X5_C5,
      X5_C6
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3], AsunaTuple5[
    X1_C4,
    X2_C4,
    X3_C4,
    X4_C4,
    X5_C4
  ], AsunaTuple5[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5], AsunaTuple5[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum6(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _, _, _, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X1_C7, X2_C7, X3_C7, X4_C7, X5_C7](
    c: Context7[F]
  )(
    implicit
    app1: asuna.debug.NodeDebugApplication7[
      `The implicit not founded property's index is 1. Please change .find(context7) to .find1.find(context7) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7
    ],
    app2: asuna.debug.NodeDebugApplication7[
      `The implicit not founded property's index is 2. Please change .find(context7) to .find2.find(context7) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6,
      X2_C7
    ],
    app3: asuna.debug.NodeDebugApplication7[
      `The implicit not founded property's index is 3. Please change .find(context7) to .find3.find(context7) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3,
      X3_C4,
      X3_C5,
      X3_C6,
      X3_C7
    ],
    app4: asuna.debug.NodeDebugApplication7[
      `The implicit not founded property's index is 4. Please change .find(context7) to .find4.find(context7) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3,
      X4_C4,
      X4_C5,
      X4_C6,
      X4_C7
    ],
    app5: asuna.debug.NodeDebugApplication7[
      `The implicit not founded property's index is 5. Please change .find(context7) to .find5.find(context7) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3,
      X5_C4,
      X5_C5,
      X5_C6,
      X5_C7
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3], AsunaTuple5[
    X1_C4,
    X2_C4,
    X3_C4,
    X4_C4,
    X5_C4
  ], AsunaTuple5[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5], AsunaTuple5[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6], AsunaTuple5[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum7(app1, app2, app3, app4, app5).application(c)
  }
  def find[F[_, _, _, _, _, _, _, _], X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X1_C8, X2_C8, X3_C8, X4_C8, X5_C8](
    c: Context8[F]
  )(
    implicit
    app1: asuna.debug.NodeDebugApplication8[
      `The implicit not founded property's index is 1. Please change .find(context8) to .find1.find(context8) to continue debug.`,
      F,
      T1,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7,
      X1_C8
    ],
    app2: asuna.debug.NodeDebugApplication8[
      `The implicit not founded property's index is 2. Please change .find(context8) to .find2.find(context8) to continue debug.`,
      F,
      T2,
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6,
      X2_C7,
      X2_C8
    ],
    app3: asuna.debug.NodeDebugApplication8[
      `The implicit not founded property's index is 3. Please change .find(context8) to .find3.find(context8) to continue debug.`,
      F,
      T3,
      X3_C1,
      X3_C2,
      X3_C3,
      X3_C4,
      X3_C5,
      X3_C6,
      X3_C7,
      X3_C8
    ],
    app4: asuna.debug.NodeDebugApplication8[
      `The implicit not founded property's index is 4. Please change .find(context8) to .find4.find(context8) to continue debug.`,
      F,
      T4,
      X4_C1,
      X4_C2,
      X4_C3,
      X4_C4,
      X4_C5,
      X4_C6,
      X4_C7,
      X4_C8
    ],
    app5: asuna.debug.NodeDebugApplication8[
      `The implicit not founded property's index is 5. Please change .find(context8) to .find5.find(context8) to continue debug.`,
      F,
      T5,
      X5_C1,
      X5_C2,
      X5_C3,
      X5_C4,
      X5_C5,
      X5_C6,
      X5_C7,
      X5_C8
    ]
  ): F[AsunaTuple5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1], AsunaTuple5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2], AsunaTuple5[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3], AsunaTuple5[
    X1_C4,
    X2_C4,
    X3_C4,
    X4_C4,
    X5_C4
  ], AsunaTuple5[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5], AsunaTuple5[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6], AsunaTuple5[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7], AsunaTuple5[
    X1_C8,
    X2_C8,
    X3_C8,
    X4_C8,
    X5_C8
  ]] = {
    NodeTag5.noteTagApplicationImplicit_tagNum5_typeParamNum8(app1, app2, app3, app4, app5).application(c)
  }
}
final object NodeTag5 extends support.NodeTag5ApplicationCompanion
