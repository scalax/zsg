package asuna

trait Plus[X <: TypeHList, Y <: TypeHList, Z <: TypeHList] extends Any {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): X#H
  def takeTail(t: Z#H): Y#H
  def sub: Plus[X#T, Y#T, Z#T]
}
