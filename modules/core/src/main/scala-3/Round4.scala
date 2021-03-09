package asuna.sample04_round

trait PI

object PI {
  given Context11[PI] = new Context11[PI]
}

class Context11[M] {
  inline def ii(i: Int, iiii: String): String = i.toString + "2233" + iiii
}

object IIii {
  inline def mi[U <: Context11[PI]](inline i: Int, inline m: String)(using u: U): String = u.ii(i, m)

  println(mi(2, "222"): String) //编译结果：println(BoxesRunTime.boxToInteger(2).toString() + "2233" + "222")
}