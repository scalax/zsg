package asuna

trait TypeHList {
  type H
  type T <: TypeHList
}

final class NoData

final object NoData {
  final val value: NoData = new NoData
}

final class TypeHNil extends TypeHList {
  override final type H = NoData
  override final type T = TypeHNil
}
