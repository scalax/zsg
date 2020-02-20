package asuna
import debug._
final class NodeTag3[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag ] extends TupleTag {
def find1: T1 = throw new Exception("Debuging...")
def find2: T2 = throw new Exception("Debuging...")
def find3: T3 = throw new Exception("Debuging...")
def debug[F[_ ]   , X1_C1  , X2_C1  , X3_C1  ](c: Context1[F])(implicit
app1: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`,
F, T1  , X1_C1 ]
, app2: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 2. Please change .debug(context1) to .find2.debug(context1) to continue.`,
F , T2  , X2_C1 ]  , app3: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 3. Please change .debug(context1) to .find3.debug(context1) to continue.`,
F , T3  , X3_C1 ] ):
F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ] ] = {
NodeTag3.noteTagApplicationImplicit_tagNum3_typeParamNum1(app1  , app2  , app3 ).application(c)
}
def debug[F[_  , _ ]   , X1_C1  , X2_C1  , X3_C1    , X1_C2  , X2_C2  , X3_C2  ](c: Context2[F])(implicit
app1: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`,
F, T1  , X1_C1  , X1_C2 ]
, app2: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 2. Please change .debug(context2) to .find2.debug(context2) to continue.`,
F , T2  , X2_C1  , X2_C2 ]  , app3: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 3. Please change .debug(context2) to .find3.debug(context2) to continue.`,
F , T3  , X3_C1  , X3_C2 ] ):
F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]  , AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ] ] = {
NodeTag3.noteTagApplicationImplicit_tagNum3_typeParamNum2(app1  , app2  , app3 ).application(c)
}
def debug[F[_  , _  , _ ]   , X1_C1  , X2_C1  , X3_C1    , X1_C2  , X2_C2  , X3_C2    , X1_C3  , X2_C3  , X3_C3  ](c: Context3[F])(implicit
app1: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 1. Please change .debug(context3) to .find1.debug(context3) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3 ]
, app2: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 2. Please change .debug(context3) to .find2.debug(context3) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3 ]  , app3: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 3. Please change .debug(context3) to .find3.debug(context3) to continue.`,
F , T3  , X3_C1  , X3_C2  , X3_C3 ] ):
F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]  , AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ] ] = {
NodeTag3.noteTagApplicationImplicit_tagNum3_typeParamNum3(app1  , app2  , app3 ).application(c)
}
}
final object NodeTag3 extends support.NodeTag3ApplicationCompanion
