package zsg.codegen

object SnippetUtil {

  def XI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"X${u}")
  def YI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"Y${u}")
  def ZI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"Z${u}")

}
