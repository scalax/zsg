package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import zsg.ApplicationX2
import zsg.Context2
import zsg.ApplicationX3
import zsg.Context3
import zsg.ApplicationX4
import zsg.Context4
import zsg.ApplicationX5
import zsg.Context5
import zsg.ApplicationX6
import zsg.Context6
import zsg.ApplicationX7
import zsg.Context7
import zsg.ApplicationX8
import zsg.Context8
import scala.language.higherKinds
object ApplicationFetchContent {
         inline  def app1[F[  _ ], T <: Context1[F]  ,I1 ](
             using inline  ii: ApplicationX1[F, T  ,I1 ]
        ): ApplicationX1[F, T  ,I1 ] = ii
         inline  def app2[F[  _   ,  _ ], T <: Context2[F]  ,I1  ,I2 ](
             using inline  ii: ApplicationX2[F, T  ,I1  ,I2 ]
        ): ApplicationX2[F, T  ,I1  ,I2 ] = ii
         inline  def app3[F[  _   ,  _   ,  _ ], T <: Context3[F]  ,I1  ,I2  ,I3 ](
             using inline  ii: ApplicationX3[F, T  ,I1  ,I2  ,I3 ]
        ): ApplicationX3[F, T  ,I1  ,I2  ,I3 ] = ii
         inline  def app4[F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]  ,I1  ,I2  ,I3  ,I4 ](
             using inline  ii: ApplicationX4[F, T  ,I1  ,I2  ,I3  ,I4 ]
        ): ApplicationX4[F, T  ,I1  ,I2  ,I3  ,I4 ] = ii
         inline  def app5[F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]  ,I1  ,I2  ,I3  ,I4  ,I5 ](
             using inline  ii: ApplicationX5[F, T  ,I1  ,I2  ,I3  ,I4  ,I5 ]
        ): ApplicationX5[F, T  ,I1  ,I2  ,I3  ,I4  ,I5 ] = ii
         inline  def app6[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ](
             using inline  ii: ApplicationX6[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ]
        ): ApplicationX6[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ] = ii
         inline  def app7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ](
             using inline  ii: ApplicationX7[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ]
        ): ApplicationX7[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ] = ii
         inline  def app8[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ](
             using inline  ii: ApplicationX8[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ]
        ): ApplicationX8[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ] = ii
}
