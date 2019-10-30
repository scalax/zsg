package org.scalax.asuna.circe

object ADTs {
  case class ADT0(i1: String)
}

object Hierarchy {
  sealed trait A
  case class B(i: Int)                 extends A
  case class C(s1: String, s2: String) extends A

  sealed trait Z //new line
  case object AnZ extends Z //new line
}

object Generic {
  case class A[T](t: T)

  case class ADT[A, B, C, D, E, F](a: A, b: B, c: C, d: D, e: E, f: F)
}

object Recursive {
  sealed trait LL
  case object End                   extends LL
  case class Node(c: Int, next: LL) extends LL
  case class IntTree(value: Int, children: List[IntTree])
  sealed trait SingleTree
  case class SingleNode(value: Int, children: List[SingleTree]) extends SingleTree
}

object Defaults {
  case class ADTa(i: Int = 0)
  case class ADTb(i: Int = 1, s: String)
  case class ADTc(i: Int = 2, s: String, t: (Double, Double) = (1, 2))
}
