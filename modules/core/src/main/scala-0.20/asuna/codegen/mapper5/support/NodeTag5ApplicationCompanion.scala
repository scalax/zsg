package asuna.support
import scala.language.higherKinds
import asuna.TupleTag
import asuna.NodeTag5
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.AsunaTuple3
import asuna.AsunaTuple4
import asuna.AsunaTuple5
import asuna.Application1
import asuna.Plus1
import asuna.Context1
import asuna.Application2
import asuna.Plus2
import asuna.Context2
import asuna.Application3
import asuna.Plus3
import asuna.Context3
import asuna.Application4
import asuna.Plus4
import asuna.Context4
import asuna.Application5
import asuna.Plus5
import asuna.Context5
import asuna.Application6
import asuna.Plus6
import asuna.Context6
import asuna.Application7
import asuna.Plus7
import asuna.Context7
import asuna.Application8
import asuna.Plus8
import asuna.Context8
trait NodeTag5ApplicationCompanion {
given noteTagApplicationImplicit_tagNum5_typeParamNum1[
F[_ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
](given
t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ] )
: Application1[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ] ] = {
val plus1_parameter0: Plus1[
AsunaTuple0
, X5_C1
, AsunaTuple1[X5_C1]
] = Plus1.cachePlusWithTypeParameter0
val plus1_parameter1: Plus1[
AsunaTuple1[X5_C1 ]
, X4_C1
, AsunaTuple2[X4_C1  , X5_C1 ]
] = Plus1.cachePlusWithTypeParameter1
val plus1_parameter2: Plus1[
AsunaTuple2[X4_C1  , X5_C1 ]
, X3_C1
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
] = Plus1.cachePlusWithTypeParameter2
val plus1_parameter3: Plus1[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, X2_C1
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
] = Plus1.cachePlusWithTypeParameter3
val plus1_parameter4: Plus1[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, X1_C1
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
] = Plus1.cachePlusWithTypeParameter4
new Application1[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ] ]
{
override final def application(context: Context1[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus1_parameter0)
, t4.application(context))(plus1_parameter1)
, t3.application(context))(plus1_parameter2)
, t2.application(context))(plus1_parameter3)
, t1.application(context))(plus1_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum2[
F[_  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
](given
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ] )
: Application2[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ] ] = {
val plus2_parameter0: Plus2[
AsunaTuple0
, AsunaTuple0
, X5_C1  , X5_C2
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]
] = Plus2.cachePlusWithTypeParameter0
val plus2_parameter1: Plus2[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]
, X4_C1  , X4_C2
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]
] = Plus2.cachePlusWithTypeParameter1
val plus2_parameter2: Plus2[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]
, X3_C1  , X3_C2
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]
] = Plus2.cachePlusWithTypeParameter2
val plus2_parameter3: Plus2[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]
, X2_C1  , X2_C2
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
] = Plus2.cachePlusWithTypeParameter3
val plus2_parameter4: Plus2[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, X1_C1  , X1_C2
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
] = Plus2.cachePlusWithTypeParameter4
new Application2[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ] ]
{
override final def application(context: Context2[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus2_parameter0)
, t4.application(context))(plus2_parameter1)
, t3.application(context))(plus2_parameter2)
, t2.application(context))(plus2_parameter3)
, t1.application(context))(plus2_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum3[
F[_  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
, X5_C1  , X5_C2  , X5_C3
](given
t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ]  , t5: Application3[F, H5  , X5_C1  , X5_C2  , X5_C3 ] )
: Application3[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ] ] = {
val plus3_parameter0: Plus3[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]
] = Plus3.cachePlusWithTypeParameter0
val plus3_parameter1: Plus3[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]
, X4_C1  , X4_C2  , X4_C3
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]
] = Plus3.cachePlusWithTypeParameter1
val plus3_parameter2: Plus3[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]
, X3_C1  , X3_C2  , X3_C3
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]
] = Plus3.cachePlusWithTypeParameter2
val plus3_parameter3: Plus3[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]
, X2_C1  , X2_C2  , X2_C3
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
] = Plus3.cachePlusWithTypeParameter3
val plus3_parameter4: Plus3[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, X1_C1  , X1_C2  , X1_C3
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
] = Plus3.cachePlusWithTypeParameter4
new Application3[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ] ]
{
override final def application(context: Context3[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus3_parameter0)
, t4.application(context))(plus3_parameter1)
, t3.application(context))(plus3_parameter2)
, t2.application(context))(plus3_parameter3)
, t1.application(context))(plus3_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum4[
F[_  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
](given
t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , t3: Application4[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , t4: Application4[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , t5: Application4[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ] )
: Application4[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ] ] = {
val plus4_parameter0: Plus4[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]  , AsunaTuple1[X5_C4]
] = Plus4.cachePlusWithTypeParameter0
val plus4_parameter1: Plus4[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]  , AsunaTuple1[X5_C4 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]
] = Plus4.cachePlusWithTypeParameter1
val plus4_parameter2: Plus4[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]
] = Plus4.cachePlusWithTypeParameter2
val plus4_parameter3: Plus4[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
] = Plus4.cachePlusWithTypeParameter3
val plus4_parameter4: Plus4[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
] = Plus4.cachePlusWithTypeParameter4
new Application4[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ] ]
{
override final def application(context: Context4[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus4_parameter0)
, t4.application(context))(plus4_parameter1)
, t3.application(context))(plus4_parameter2)
, t2.application(context))(plus4_parameter3)
, t1.application(context))(plus4_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
](given
t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , t5: Application5[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ] )
: Application5[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ] ] = {
val plus5_parameter0: Plus5[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]  , AsunaTuple1[X5_C4]  , AsunaTuple1[X5_C5]
] = Plus5.cachePlusWithTypeParameter0
val plus5_parameter1: Plus5[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]  , AsunaTuple1[X5_C4 ]  , AsunaTuple1[X5_C5 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]
] = Plus5.cachePlusWithTypeParameter1
val plus5_parameter2: Plus5[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]
] = Plus5.cachePlusWithTypeParameter2
val plus5_parameter3: Plus5[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
] = Plus5.cachePlusWithTypeParameter3
val plus5_parameter4: Plus5[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
] = Plus5.cachePlusWithTypeParameter4
new Application5[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ] ]
{
override final def application(context: Context5[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus5_parameter0)
, t4.application(context))(plus5_parameter1)
, t3.application(context))(plus5_parameter2)
, t2.application(context))(plus5_parameter3)
, t1.application(context))(plus5_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
](given
t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]  , t3: Application6[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6 ]  , t4: Application6[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6 ]  , t5: Application6[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6 ] )
: Application6[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ] ] = {
val plus6_parameter0: Plus6[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]  , AsunaTuple1[X5_C4]  , AsunaTuple1[X5_C5]  , AsunaTuple1[X5_C6]
] = Plus6.cachePlusWithTypeParameter0
val plus6_parameter1: Plus6[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]  , AsunaTuple1[X5_C4 ]  , AsunaTuple1[X5_C5 ]  , AsunaTuple1[X5_C6 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]
] = Plus6.cachePlusWithTypeParameter1
val plus6_parameter2: Plus6[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]
] = Plus6.cachePlusWithTypeParameter2
val plus6_parameter3: Plus6[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
] = Plus6.cachePlusWithTypeParameter3
val plus6_parameter4: Plus6[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
] = Plus6.cachePlusWithTypeParameter4
new Application6[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ] ]
{
override final def application(context: Context6[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus6_parameter0)
, t4.application(context))(plus6_parameter1)
, t3.application(context))(plus6_parameter2)
, t2.application(context))(plus6_parameter3)
, t1.application(context))(plus6_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7
](given
t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
, t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]  , t3: Application7[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 ]  , t4: Application7[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ]  , t5: Application7[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7 ] )
: Application7[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ] ] = {
val plus7_parameter0: Plus7[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]  , AsunaTuple1[X5_C4]  , AsunaTuple1[X5_C5]  , AsunaTuple1[X5_C6]  , AsunaTuple1[X5_C7]
] = Plus7.cachePlusWithTypeParameter0
val plus7_parameter1: Plus7[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]  , AsunaTuple1[X5_C4 ]  , AsunaTuple1[X5_C5 ]  , AsunaTuple1[X5_C6 ]  , AsunaTuple1[X5_C7 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]  , AsunaTuple2[X4_C7  , X5_C7 ]
] = Plus7.cachePlusWithTypeParameter1
val plus7_parameter2: Plus7[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]  , AsunaTuple2[X4_C7  , X5_C7 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple3[X3_C7  , X4_C7  , X5_C7 ]
] = Plus7.cachePlusWithTypeParameter2
val plus7_parameter3: Plus7[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple3[X3_C7  , X4_C7  , X5_C7 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple4[X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
] = Plus7.cachePlusWithTypeParameter3
val plus7_parameter4: Plus7[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple4[X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
] = Plus7.cachePlusWithTypeParameter4
new Application7[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ] ]
{
override final def application(context: Context7[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus7_parameter0)
, t4.application(context))(plus7_parameter1)
, t3.application(context))(plus7_parameter2)
, t2.application(context))(plus7_parameter3)
, t1.application(context))(plus7_parameter4)
}
}
}
given noteTagApplicationImplicit_tagNum5_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8
](given
t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , t3: Application8[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , t4: Application8[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , t5: Application8[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ] )
: Application8[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ] ] = {
val plus8_parameter0: Plus8[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8
, AsunaTuple1[X5_C1]  , AsunaTuple1[X5_C2]  , AsunaTuple1[X5_C3]  , AsunaTuple1[X5_C4]  , AsunaTuple1[X5_C5]  , AsunaTuple1[X5_C6]  , AsunaTuple1[X5_C7]  , AsunaTuple1[X5_C8]
] = Plus8.cachePlusWithTypeParameter0
val plus8_parameter1: Plus8[
AsunaTuple1[X5_C1 ]
, AsunaTuple1[X5_C2 ]  , AsunaTuple1[X5_C3 ]  , AsunaTuple1[X5_C4 ]  , AsunaTuple1[X5_C5 ]  , AsunaTuple1[X5_C6 ]  , AsunaTuple1[X5_C7 ]  , AsunaTuple1[X5_C8 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8
, AsunaTuple2[X4_C1  , X5_C1 ]  , AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]  , AsunaTuple2[X4_C7  , X5_C7 ]  , AsunaTuple2[X4_C8  , X5_C8 ]
] = Plus8.cachePlusWithTypeParameter1
val plus8_parameter2: Plus8[
AsunaTuple2[X4_C1  , X5_C1 ]
, AsunaTuple2[X4_C2  , X5_C2 ]  , AsunaTuple2[X4_C3  , X5_C3 ]  , AsunaTuple2[X4_C4  , X5_C4 ]  , AsunaTuple2[X4_C5  , X5_C5 ]  , AsunaTuple2[X4_C6  , X5_C6 ]  , AsunaTuple2[X4_C7  , X5_C7 ]  , AsunaTuple2[X4_C8  , X5_C8 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple3[X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple3[X3_C8  , X4_C8  , X5_C8 ]
] = Plus8.cachePlusWithTypeParameter2
val plus8_parameter3: Plus8[
AsunaTuple3[X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple3[X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple3[X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple3[X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple3[X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple3[X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple3[X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple3[X3_C8  , X4_C8  , X5_C8 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple4[X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple4[X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
] = Plus8.cachePlusWithTypeParameter3
val plus8_parameter4: Plus8[
AsunaTuple4[X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple4[X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple4[X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple4[X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple4[X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple4[X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple4[X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple4[X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
] = Plus8.cachePlusWithTypeParameter4
new Application8[
F,
NodeTag5[H1  , H2  , H3  , H4  , H5 ]  , AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]  , AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ] ]
{
override final def application(context: Context8[F]): F[AsunaTuple5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, AsunaTuple5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]  , AsunaTuple5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]  , AsunaTuple5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]  , AsunaTuple5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]  , AsunaTuple5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]  , AsunaTuple5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]  , AsunaTuple5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t5.application(context))(plus8_parameter0)
, t4.application(context))(plus8_parameter1)
, t3.application(context))(plus8_parameter2)
, t2.application(context))(plus8_parameter3)
, t1.application(context))(plus8_parameter4)
}
}
}
}
