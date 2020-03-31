package asuna.codegen

object MergeUtil {

  def XI_CI_NodeTag(xi: Seq[Int])(ci: Seq[Int]): List[String] = xi.to(List).flatMap(xii => ci.map(cii => s"X${xii}_C${cii} <: TupleTag"))
  def TargetI_NodeTag(xi: Seq[Int]): List[String]             = xi.to(List).map(xii => s"Target${xii} <: TupleTag")
  def MergeI_NodeTag_Implicit_Parameter(xi: Seq[Int])(ci: Seq[Int]): List[String] = {
    ci.to(List).map { index =>
      val xi_param = xi.map { xii =>
        s"""X${xii}_C${index}"""
      } ++: s"""Target${index}""" +: Nil
      s"""nodeTagImplicit${index}: Merge${xi.size}[${xi_param.mkString(" , ")}]""".stripMargin
    }
  }
  def MergeI_NodeTag_Type(xi: Seq[Int])(ci: Seq[Int]): List[String] = {
    xi.to(List).map { index =>
      val xi_param = ci.map { cii =>
        s"""X${index}_C${cii}"""
      }
      s"""NodeTag${ci.size}[${xi_param.mkString(" , ")}]""".stripMargin
    } ::: s"""NodeTag${ci.size}[${ci.map(cii => s"""Target${cii}""").mkString(" , ")}]""" :: Nil
  }

  def XI_CI_TupleTag(xi: Seq[Int])(ci: Seq[Int]): List[String] = xi.to(List).flatMap(xii => ci.map(cii => s"X${xii}_C${cii}"))
  def TargetI_TupleTag(xi: Seq[Int]): List[String]             = xi.to(List).map(xii => s"Target${xii}")
  def MergeI_TupleTag_Implicit_Parameter(xi: Seq[Int])(ci: Seq[Int]): List[String] = {
    ci.to(List).map { index =>
      val xi_param = xi.map { xii =>
        s"""X${xii}_C${index}"""
      } ++: s"""Target${index}""" +: Nil
      s"""tupleTagImplicit${index}: Merge${xi.size}[${xi_param.mkString(" , ")}]""".stripMargin
    }
  }
  def MergeI_TupleTag_Type(xi: Seq[Int])(ci: Seq[Int]): List[String] = {
    xi.to(List).map { index =>
      val xi_param = ci.map { cii =>
        s"""X${index}_C${cii}"""
      }
      s"""TupleTag${ci.size}[${xi_param.mkString(" , ")}]""".stripMargin
    } ::: s"""TupleTag${ci.size}[${ci.map(cii => s"""Target${cii}""").mkString(" , ")}]""" :: Nil
  }

}
