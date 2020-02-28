package asuna.codegen

object SnippetUtil {

  def XI_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(u => s" X${u} ")
  def YI_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(u => s" Y${u} ")
  def ZI_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(u => s" Z${u} ")
  def AsunaTuple2_XI_YI_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(u => s" AsunaTuple2[Y${u}, X${u}] ")
  def AsunaTuple0_Snippet(seq: Iterable[Int]): Iterable[String]= seq.map(_ => s" AsunaTuple0 ")
  def AsunaTuple1_YI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(i => s" AsunaTuple1[Y${i}] ")

}
