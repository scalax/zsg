package asuna.sample04_round

trait PI

object PI {
  given m as Context11[PI]
}

class Context11[M] {
   inline def ii(i: Int, iiii: String): String = i.toString + iiii
}

object IIii {
  inline def mi[U <: Context11[PI]](given u: U): U = u

  println(mi.ii(2, "222"): String)
}
