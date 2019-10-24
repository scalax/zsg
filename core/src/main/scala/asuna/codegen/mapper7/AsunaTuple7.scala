package asuna
trait AsunaTuple7[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ] extends Any {
self =>
def i1: E1
def i2: E2
def i3: E3
def i4: E4
def i5: E5
def i6: E6
def i7: E7
def addToTuple[T](xyy: T): ( E1,  E2,  E3,  E4,  E5,  E6,  E7,  T) = ( self.i1,  self.i2,  self.i3,  self.i4,  self.i5,  self.i6,  self.i7,  xyy)
def pullToTuple[T](xyy: T): (T  , E1  , E2  , E3  , E4  , E5  , E6  , E7 ) = (xyy  , self.i1  , self.i2  , self.i3  , self.i4  , self.i5  , self.i6  , self.i7 )
def leftTuple: ( E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ) = ( self.i2  ,   self.i3  ,   self.i4  ,   self.i5  ,   self.i6  ,   self.i7  )
def rightTuple: ( E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ) = ( self.i1  ,   self.i2  ,   self.i3  ,   self.i4  ,   self.i5  ,   self.i6  )
}
