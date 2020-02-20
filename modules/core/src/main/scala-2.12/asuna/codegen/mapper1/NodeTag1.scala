package asuna
import debug._
final class NodeTag1[T1 <: TupleTag ] extends TupleTag {
def find1: T1 = throw new Exception("Debuging...")
def debug[F[_ ]   , X1_C1  ](c: Context1[F])(implicit
app1: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`,
F, T1  , X1_C1 ]
):
F[AsunaTuple1[X1_C1 ] ] = {
NodeTag1.noteTagApplicationImplicit_tagNum1_typeParamNum1(app1 ).application(c)
}
def debug[F[_  , _ ]   , X1_C1    , X1_C2  ](c: Context2[F])(implicit
app1: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`,
F, T1  , X1_C1  , X1_C2 ]
):
F[AsunaTuple1[X1_C1 ]  , AsunaTuple1[X1_C2 ] ] = {
NodeTag1.noteTagApplicationImplicit_tagNum1_typeParamNum2(app1 ).application(c)
}
def debug[F[_  , _  , _ ]   , X1_C1    , X1_C2    , X1_C3  ](c: Context3[F])(implicit
app1: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 1. Please change .debug(context3) to .find1.debug(context3) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3 ]
):
F[AsunaTuple1[X1_C1 ]  , AsunaTuple1[X1_C2 ]  , AsunaTuple1[X1_C3 ] ] = {
NodeTag1.noteTagApplicationImplicit_tagNum1_typeParamNum3(app1 ).application(c)
}
}
final object NodeTag1 extends support.NodeTag1ApplicationCompanion
