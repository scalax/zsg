package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import zsg.Application2
import zsg.Context2
import zsg.Application3
import zsg.Context3
import zsg.Application4
import zsg.Context4
import zsg.Application5
import zsg.Context5
import zsg.Application6
import zsg.Context6
import zsg.Application7
import zsg.Context7
import zsg.Application8
import zsg.Context8
import scala.language.higherKinds
object ApplicationFetchContent {
         inline  def app1[F[  _ ], T <: Context1[F]  ,I1 ](
             using inline  ii: Application1[F, T  ,I1 ]
        ): F[  I1 ] = ii.application
         inline  def app2[F[  _   ,  _ ], T <: Context2[F]  ,I1  ,I2 ](
             using inline  ii: Application2[F, T  ,I1  ,I2 ]
        ): F[  I1   ,  I2 ] = ii.application
         inline  def app3[F[  _   ,  _   ,  _ ], T <: Context3[F]  ,I1  ,I2  ,I3 ](
             using inline  ii: Application3[F, T  ,I1  ,I2  ,I3 ]
        ): F[  I1   ,  I2   ,  I3 ] = ii.application
         inline  def app4[F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]  ,I1  ,I2  ,I3  ,I4 ](
             using inline  ii: Application4[F, T  ,I1  ,I2  ,I3  ,I4 ]
        ): F[  I1   ,  I2   ,  I3   ,  I4 ] = ii.application
         inline  def app5[F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]  ,I1  ,I2  ,I3  ,I4  ,I5 ](
             using inline  ii: Application5[F, T  ,I1  ,I2  ,I3  ,I4  ,I5 ]
        ): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5 ] = ii.application
         inline  def app6[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ](
             using inline  ii: Application6[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ]
        ): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6 ] = ii.application
         inline  def app7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ](
             using inline  ii: Application7[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ]
        ): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7 ] = ii.application
         inline  def app8[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ](
             using inline  ii: Application8[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ]
        ): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8 ] = ii.application
}
