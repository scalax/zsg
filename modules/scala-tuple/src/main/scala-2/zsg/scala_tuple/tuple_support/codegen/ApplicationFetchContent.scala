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
import zsg.ApplicationX9
import zsg.Context9
import zsg.ApplicationX10
import zsg.Context10
import zsg.ApplicationX11
import zsg.Context11
import zsg.ApplicationX12
import zsg.Context12
import zsg.ApplicationX13
import zsg.Context13
import zsg.ApplicationX14
import zsg.Context14
import zsg.ApplicationX15
import zsg.Context15
import zsg.ApplicationX16
import zsg.Context16
import zsg.ApplicationX17
import zsg.Context17
import zsg.ApplicationX18
import zsg.Context18
import zsg.ApplicationX19
import zsg.Context19
import zsg.ApplicationX20
import zsg.Context20
import zsg.ApplicationX21
import zsg.Context21
import zsg.ApplicationX22
import zsg.Context22
import scala.language.higherKinds
object ApplicationFetchContent {
         @inline  def app1[F[  _ ], T <: Context1[F]  ,I1 ](
             implicit ii: ApplicationX1[F, T  ,I1 ]
        ): ApplicationX1[F, T  ,I1 ] = ii
         @inline  def app2[F[  _   ,  _ ], T <: Context2[F]  ,I1  ,I2 ](
             implicit ii: ApplicationX2[F, T  ,I1  ,I2 ]
        ): ApplicationX2[F, T  ,I1  ,I2 ] = ii
         @inline  def app3[F[  _   ,  _   ,  _ ], T <: Context3[F]  ,I1  ,I2  ,I3 ](
             implicit ii: ApplicationX3[F, T  ,I1  ,I2  ,I3 ]
        ): ApplicationX3[F, T  ,I1  ,I2  ,I3 ] = ii
         @inline  def app4[F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]  ,I1  ,I2  ,I3  ,I4 ](
             implicit ii: ApplicationX4[F, T  ,I1  ,I2  ,I3  ,I4 ]
        ): ApplicationX4[F, T  ,I1  ,I2  ,I3  ,I4 ] = ii
         @inline  def app5[F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]  ,I1  ,I2  ,I3  ,I4  ,I5 ](
             implicit ii: ApplicationX5[F, T  ,I1  ,I2  ,I3  ,I4  ,I5 ]
        ): ApplicationX5[F, T  ,I1  ,I2  ,I3  ,I4  ,I5 ] = ii
         @inline  def app6[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ](
             implicit ii: ApplicationX6[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ]
        ): ApplicationX6[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6 ] = ii
         @inline  def app7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ](
             implicit ii: ApplicationX7[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ]
        ): ApplicationX7[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7 ] = ii
         @inline  def app8[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ](
             implicit ii: ApplicationX8[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ]
        ): ApplicationX8[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8 ] = ii
         @inline  def app9[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context9[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9 ](
             implicit ii: ApplicationX9[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9 ]
        ): ApplicationX9[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9 ] = ii
         @inline  def app10[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context10[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10 ](
             implicit ii: ApplicationX10[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10 ]
        ): ApplicationX10[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10 ] = ii
         @inline  def app11[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context11[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11 ](
             implicit ii: ApplicationX11[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11 ]
        ): ApplicationX11[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11 ] = ii
         @inline  def app12[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context12[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12 ](
             implicit ii: ApplicationX12[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12 ]
        ): ApplicationX12[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12 ] = ii
         @inline  def app13[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context13[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13 ](
             implicit ii: ApplicationX13[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13 ]
        ): ApplicationX13[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13 ] = ii
         @inline  def app14[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context14[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14 ](
             implicit ii: ApplicationX14[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14 ]
        ): ApplicationX14[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14 ] = ii
         @inline  def app15[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context15[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15 ](
             implicit ii: ApplicationX15[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15 ]
        ): ApplicationX15[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15 ] = ii
         @inline  def app16[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context16[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16 ](
             implicit ii: ApplicationX16[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16 ]
        ): ApplicationX16[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16 ] = ii
         @inline  def app17[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context17[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17 ](
             implicit ii: ApplicationX17[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17 ]
        ): ApplicationX17[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17 ] = ii
         @inline  def app18[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context18[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18 ](
             implicit ii: ApplicationX18[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18 ]
        ): ApplicationX18[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18 ] = ii
         @inline  def app19[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context19[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19 ](
             implicit ii: ApplicationX19[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19 ]
        ): ApplicationX19[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19 ] = ii
         @inline  def app20[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context20[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20 ](
             implicit ii: ApplicationX20[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20 ]
        ): ApplicationX20[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20 ] = ii
         @inline  def app21[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context21[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21 ](
             implicit ii: ApplicationX21[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21 ]
        ): ApplicationX21[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21 ] = ii
         @inline  def app22[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context22[F]  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21  ,I22 ](
             implicit ii: ApplicationX22[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21  ,I22 ]
        ): ApplicationX22[F, T  ,I1  ,I2  ,I3  ,I4  ,I5  ,I6  ,I7  ,I8  ,I9  ,I10  ,I11  ,I12  ,I13  ,I14  ,I15  ,I16  ,I17  ,I18  ,I19  ,I20  ,I21  ,I22 ] = ii
}
