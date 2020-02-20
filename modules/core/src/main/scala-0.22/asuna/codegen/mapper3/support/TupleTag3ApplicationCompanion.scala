package asuna.support
import scala.language.higherKinds
import asuna.TupleTag3
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.AsunaTuple3
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
class TupleTag3ApplicationCompanion {
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum1[
F[_ ],
H1
, X1_C1
](given
t1: Application1[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1] ])
: Application1[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus1_parameter0: Plus1[
AsunaTuple0
, X3_C1
, AsunaTuple1[X3_C1]
] = Plus1.cachePlusWithTypeParameter0
new Application1[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1] ]
{
override def application(context: Context1[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
] = {
context.append(t1, context.start)(plus1_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum2[
F[_  , _ ],
H1
, X1_C1  , X1_C2
](given
t1: Application2[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1] ])
: Application2[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus2_parameter0: Plus2[
AsunaTuple0
, AsunaTuple0
, X3_C1  , X3_C2
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]
] = Plus2.cachePlusWithTypeParameter0
new Application2[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1] ]
{
override def application(context: Context2[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ] ] = {
context.append(t1, context.start)(plus2_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum3[
F[_  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3
](given
t1: Application3[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1] ])
: Application3[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus3_parameter0: Plus3[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]
] = Plus3.cachePlusWithTypeParameter0
new Application3[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1] ]
{
override def application(context: Context3[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ] ] = {
context.append(t1, context.start)(plus3_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum4[
F[_  , _  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3  , X1_C4
](given
t1: Application4[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1]  , AsunaTuple1[X4_C1] ])
: Application4[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus4_parameter0: Plus4[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]  , AsunaTuple1[X3_C4]
] = Plus4.cachePlusWithTypeParameter0
new Application4[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1]  , AsunaTuple3[X4_C1] ]
{
override def application(context: Context4[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ] ] = {
context.append(t1, context.start)(plus4_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum5[
F[_  , _  , _  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
](given
t1: Application5[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1]  , AsunaTuple1[X4_C1]  , AsunaTuple1[X5_C1] ])
: Application5[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus5_parameter0: Plus5[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]  , AsunaTuple1[X3_C4]  , AsunaTuple1[X3_C5]
] = Plus5.cachePlusWithTypeParameter0
new Application5[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1]  , AsunaTuple3[X4_C1]  , AsunaTuple3[X5_C1] ]
{
override def application(context: Context5[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ] ] = {
context.append(t1, context.start)(plus5_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
](given
t1: Application6[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1]  , AsunaTuple1[X4_C1]  , AsunaTuple1[X5_C1]  , AsunaTuple1[X6_C1] ])
: Application6[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus6_parameter0: Plus6[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]  , AsunaTuple1[X3_C4]  , AsunaTuple1[X3_C5]  , AsunaTuple1[X3_C6]
] = Plus6.cachePlusWithTypeParameter0
new Application6[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1]  , AsunaTuple3[X4_C1]  , AsunaTuple3[X5_C1]  , AsunaTuple3[X6_C1] ]
{
override def application(context: Context6[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ] ] = {
context.append(t1, context.start)(plus6_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
](given
t1: Application7[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1]  , AsunaTuple1[X4_C1]  , AsunaTuple1[X5_C1]  , AsunaTuple1[X6_C1]  , AsunaTuple1[X7_C1] ])
: Application7[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus7_parameter0: Plus7[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]  , AsunaTuple1[X3_C4]  , AsunaTuple1[X3_C5]  , AsunaTuple1[X3_C6]  , AsunaTuple1[X3_C7]
] = Plus7.cachePlusWithTypeParameter0
new Application7[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1]  , AsunaTuple3[X4_C1]  , AsunaTuple3[X5_C1]  , AsunaTuple3[X6_C1]  , AsunaTuple3[X7_C1] ]
{
override def application(context: Context7[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ]  , AsunaTuple3[X1_C7  , X2_C7  , X3_C7 ] ] = {
context.append(t1, context.start)(plus7_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum1_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ],
H1
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
](given
t1: Application8[
F,
TupleTag3[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X2_C1]  , AsunaTuple1[X3_C1]  , AsunaTuple1[X4_C1]  , AsunaTuple1[X5_C1]  , AsunaTuple1[X6_C1]  , AsunaTuple1[X7_C1]  , AsunaTuple1[X8_C1] ])
: Application8[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus8_parameter0: Plus8[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, AsunaTuple1[X3_C1]  , AsunaTuple1[X3_C2]  , AsunaTuple1[X3_C3]  , AsunaTuple1[X3_C4]  , AsunaTuple1[X3_C5]  , AsunaTuple1[X3_C6]  , AsunaTuple1[X3_C7]  , AsunaTuple1[X3_C8]
] = Plus8.cachePlusWithTypeParameter0
new Application8[
F,
TupleTag3[H1]  , AsunaTuple3[X1_C1]  , AsunaTuple3[X2_C1]  , AsunaTuple3[X3_C1]  , AsunaTuple3[X4_C1]  , AsunaTuple3[X5_C1]  , AsunaTuple3[X6_C1]  , AsunaTuple3[X7_C1]  , AsunaTuple3[X8_C1] ]
{
override def application(context: Context8[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ]  , AsunaTuple3[X1_C7  , X2_C7  , X3_C7 ]  , AsunaTuple3[X1_C8  , X2_C8  , X3_C8 ] ] = {
context.append(t1, context.start)(plus8_parameter0)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum1[
F[_ ],
H1, H2
, X1_C1
, X2_C1
](given
t1: Application1[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ])
: Application1[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus1_parameter1: Plus1[
X1_C1
, X2_C1
, AsunaTuple2[X1_C1, X2_C1]
] = Plus1.cachePlusWithTypeParameter1
new Application1[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ]
{
override def application(context: Context1[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
] = {
context.append(t2, t1)(plus1_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum2[
F[_  , _ ],
H1, H2
, X1_C1  , X1_C2
, X2_C1  , X2_C2
](given
t1: Application2[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ])
: Application2[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus2_parameter1: Plus2[
X1_C1
, X1_C2
, X2_C1  , X2_C2
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]
] = Plus2.cachePlusWithTypeParameter1
new Application2[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ]
{
override def application(context: Context2[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ] ] = {
context.append(t2, t1)(plus2_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum3[
F[_  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
](given
t1: Application3[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ])
: Application3[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus3_parameter1: Plus3[
X1_C1
, X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]
] = Plus3.cachePlusWithTypeParameter1
new Application3[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ]
{
override def application(context: Context3[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ] ] = {
context.append(t2, t1)(plus3_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum4[
F[_  , _  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
](given
t1: Application4[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ])
: Application4[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus4_parameter1: Plus4[
X1_C1
, X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]
] = Plus4.cachePlusWithTypeParameter1
new Application4[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ]
{
override def application(context: Context4[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ] ] = {
context.append(t2, t1)(plus4_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum5[
F[_  , _  , _  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
](given
t1: Application5[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ])
: Application5[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus5_parameter1: Plus5[
X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]
] = Plus5.cachePlusWithTypeParameter1
new Application5[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ]
{
override def application(context: Context5[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ] ] = {
context.append(t2, t1)(plus5_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
](given
t1: Application6[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ])
: Application6[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus6_parameter1: Plus6[
X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]
] = Plus6.cachePlusWithTypeParameter1
new Application6[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ]
{
override def application(context: Context6[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ] ] = {
context.append(t2, t1)(plus6_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
](given
t1: Application7[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ])
: Application7[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus7_parameter1: Plus7[
X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]
] = Plus7.cachePlusWithTypeParameter1
new Application7[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ]
{
override def application(context: Context7[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ]  , AsunaTuple3[X1_C7  , X2_C7  , X3_C7 ] ] = {
context.append(t2, t1)(plus7_parameter1)
}
}
}
inline given tupleTagApplicationImplicit_tagNum2_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ],
H1, H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
](given
t1: Application8[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ])
: Application8[
F,
TupleTag3[H1] , AsunaTuple3[X1_C1]] = {
val plus8_parameter1: Plus8[
X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8]
] = Plus8.cachePlusWithTypeParameter1
new Application8[
F,
TupleTag3[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ]
{
override def application(context: Context8[F]): F[AsunaTuple3[X1_C1  , X2_C1  , X3_C1 ]
, AsunaTuple3[X1_C2  , X2_C2  , X3_C2 ]  , AsunaTuple3[X1_C3  , X2_C3  , X3_C3 ]  , AsunaTuple3[X1_C4  , X2_C4  , X3_C4 ]  , AsunaTuple3[X1_C5  , X2_C5  , X3_C5 ]  , AsunaTuple3[X1_C6  , X2_C6  , X3_C6 ]  , AsunaTuple3[X1_C7  , X2_C7  , X3_C7 ]  , AsunaTuple3[X1_C8  , X2_C8  , X3_C8 ] ] = {
context.append(t2, t1)(plus8_parameter1)
}
}
}
}
