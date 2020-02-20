package asuna
import debug._
final class NodeTag2[T1 <: TupleTag  , T2 <: TupleTag ] extends TupleTag {
def find1: T1 = throw new Exception("Debuging...")
def find2: T2 = throw new Exception("Debuging...")
def debug[F[_ ]   , X1_C1  , X2_C1  ](c: Context1[F])(implicit
app1: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`,
F, T1  , X1_C1 ]
, app2: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 2. Please change .debug(context1) to .find2.debug(context1) to continue.`,
F , T2  , X2_C1 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum1(app1  , app2 ).application(c)
}
def debug[F[_  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2  ](c: Context2[F])(implicit
app1: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`,
F, T1  , X1_C1  , X1_C2 ]
, app2: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 2. Please change .debug(context2) to .find2.debug(context2) to continue.`,
F , T2  , X2_C1  , X2_C2 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum2(app1  , app2 ).application(c)
}
}
final object NodeTag2 extends support.NodeTag2ApplicationCompanion
