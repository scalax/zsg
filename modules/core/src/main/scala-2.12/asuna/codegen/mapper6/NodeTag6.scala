package asuna
import debug._
final class NodeTag6[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag  , T5 <: TupleTag  , T6 <: TupleTag ] extends TupleTag {
def find1: T1 = throw new Exception("Debuging...")
def find2: T2 = throw new Exception("Debuging...")
def find3: T3 = throw new Exception("Debuging...")
def find4: T4 = throw new Exception("Debuging...")
def find5: T5 = throw new Exception("Debuging...")
def find6: T6 = throw new Exception("Debuging...")
def debug[F[_ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  ](c: Context1[F])(implicit
app1: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`,
F, T1  , X1_C1 ]
, app2: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 2. Please change .debug(context1) to .find2.debug(context1) to continue.`,
F , T2  , X2_C1 ]  , app3: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 3. Please change .debug(context1) to .find3.debug(context1) to continue.`,
F , T3  , X3_C1 ]  , app4: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 4. Please change .debug(context1) to .find4.debug(context1) to continue.`,
F , T4  , X4_C1 ]  , app5: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 5. Please change .debug(context1) to .find5.debug(context1) to continue.`,
F , T5  , X5_C1 ]  , app6: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 6. Please change .debug(context1) to .find6.debug(context1) to continue.`,
F , T6  , X6_C1 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum1(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
def debug[F[_  , _ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1    , X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  ](c: Context2[F])(implicit
app1: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`,
F, T1  , X1_C1  , X1_C2 ]
, app2: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 2. Please change .debug(context2) to .find2.debug(context2) to continue.`,
F , T2  , X2_C1  , X2_C2 ]  , app3: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 3. Please change .debug(context2) to .find3.debug(context2) to continue.`,
F , T3  , X3_C1  , X3_C2 ]  , app4: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 4. Please change .debug(context2) to .find4.debug(context2) to continue.`,
F , T4  , X4_C1  , X4_C2 ]  , app5: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 5. Please change .debug(context2) to .find5.debug(context2) to continue.`,
F , T5  , X5_C1  , X5_C2 ]  , app6: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 6. Please change .debug(context2) to .find6.debug(context2) to continue.`,
F , T6  , X6_C1  , X6_C2 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum2(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
def debug[F[_  , _  , _ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1    , X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2    , X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  ](c: Context3[F])(implicit
app1: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 1. Please change .debug(context3) to .find1.debug(context3) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3 ]
, app2: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 2. Please change .debug(context3) to .find2.debug(context3) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3 ]  , app3: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 3. Please change .debug(context3) to .find3.debug(context3) to continue.`,
F , T3  , X3_C1  , X3_C2  , X3_C3 ]  , app4: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 4. Please change .debug(context3) to .find4.debug(context3) to continue.`,
F , T4  , X4_C1  , X4_C2  , X4_C3 ]  , app5: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 5. Please change .debug(context3) to .find5.debug(context3) to continue.`,
F , T5  , X5_C1  , X5_C2  , X5_C3 ]  , app6: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 6. Please change .debug(context3) to .find6.debug(context3) to continue.`,
F , T6  , X6_C1  , X6_C2  , X6_C3 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum3(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
def debug[F[_  , _  , _  , _ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1    , X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2    , X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3    , X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  ](c: Context4[F])(implicit
app1: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 1. Please change .debug(context4) to .find1.debug(context4) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, app2: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 2. Please change .debug(context4) to .find2.debug(context4) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , app3: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 3. Please change .debug(context4) to .find3.debug(context4) to continue.`,
F , T3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , app4: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 4. Please change .debug(context4) to .find4.debug(context4) to continue.`,
F , T4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , app5: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 5. Please change .debug(context4) to .find5.debug(context4) to continue.`,
F , T5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ]  , app6: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 6. Please change .debug(context4) to .find6.debug(context4) to continue.`,
F , T6  , X6_C1  , X6_C2  , X6_C3  , X6_C4 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum4(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
def debug[F[_  , _  , _  , _  , _ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1    , X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2    , X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3    , X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4    , X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  ](c: Context5[F])(implicit
app1: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 1. Please change .debug(context5) to .find1.debug(context5) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, app2: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 2. Please change .debug(context5) to .find2.debug(context5) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , app3: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 3. Please change .debug(context5) to .find3.debug(context5) to continue.`,
F , T3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , app4: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 4. Please change .debug(context5) to .find4.debug(context5) to continue.`,
F , T4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , app5: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 5. Please change .debug(context5) to .find5.debug(context5) to continue.`,
F , T5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ]  , app6: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 6. Please change .debug(context5) to .find6.debug(context5) to continue.`,
F , T6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum5(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
def debug[F[_  , _  , _  , _  , _  , _ ]   , X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1    , X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2    , X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3    , X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4    , X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5    , X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  ](c: Context6[F])(implicit
app1: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 1. Please change .debug(context6) to .find1.debug(context6) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, app2: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 2. Please change .debug(context6) to .find2.debug(context6) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]  , app3: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 3. Please change .debug(context6) to .find3.debug(context6) to continue.`,
F , T3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6 ]  , app4: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 4. Please change .debug(context6) to .find4.debug(context6) to continue.`,
F , T4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6 ]  , app5: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 5. Please change .debug(context6) to .find5.debug(context6) to continue.`,
F , T5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6 ]  , app6: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 6. Please change .debug(context6) to .find6.debug(context6) to continue.`,
F , T6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6 ] ):
F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ] ] = {
NodeTag6.noteTagApplicationImplicit_tagNum6_typeParamNum6(app1  , app2  , app3  , app4  , app5  , app6 ).application(c)
}
}
final object NodeTag6 extends support.NodeTag6ApplicationCompanion
