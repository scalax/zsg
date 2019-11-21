package asuna.test

import asuna.{AppendTag, BuildTag, MergeProperty2, NodeTag2, TupleTag2, TupleTag3, TupleTag4}

object TagTest {

  class Test1
  class Test2
  class Test3

  val tag1 = BuildTag.lift(BuildTag.nodeTag(
    BuildTag.tag(new AppendTag[String], new AppendTag[Int], new AppendTag[Long], new AppendTag[String]),
    BuildTag.tag(new AppendTag[Long], new AppendTag[Int], new AppendTag[String])
  ))
  val tag2 = BuildTag.lift(BuildTag.nodeTag(
    BuildTag.tag(new AppendTag[Test1], new AppendTag[Int], new AppendTag[Long], new AppendTag[String]),
    BuildTag.tag(new AppendTag[Long], new AppendTag[Test2], new AppendTag[Test3])
  ))

  val result = BuildTag.mergeTag(tag1, tag2)
  val ii: AppendTag[NodeTag2[
    TupleTag4[MergeProperty2[String, Test1], MergeProperty2[Int, Int], MergeProperty2[Long, Long], MergeProperty2[String, String]],
    TupleTag3[MergeProperty2[Long, Long], MergeProperty2[Int, Test2], MergeProperty2[String, Test3]]
  ]] = result

}
