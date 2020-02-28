package asuna.codegen

object SnippetUtil {

  def XI_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(u => s"X${u}")

}
