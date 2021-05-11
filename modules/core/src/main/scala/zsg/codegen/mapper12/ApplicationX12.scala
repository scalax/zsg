package zsg
abstract class ApplicationX12[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context12[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12 ]
}
object ApplicationX12 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context12[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12 ]): ApplicationX12[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12 ] =
        new ApplicationX12[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12 ] = i
        }
}
