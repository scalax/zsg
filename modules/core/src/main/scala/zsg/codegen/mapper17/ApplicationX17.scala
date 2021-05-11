package zsg
abstract class ApplicationX17[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context17[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15  , I16  , I17 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17 ]
}
object ApplicationX17 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context17[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15  , I16  , I17 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17 ]): ApplicationX17[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15  , I16  , I17 ] =
        new ApplicationX17[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15  , I16  , I17 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17 ] = i
        }
}
