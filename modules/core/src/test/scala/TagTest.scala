package asuna.test

import asuna.{AppendTag, BuildTag, NodeTag2, PropertyTag1, PropertyTag2, TupleTag3, TupleTag4}

object TagTest {

  class Test1

  class Test2

  class Test3

  val tag1 = BuildTag.lift(
    BuildTag.nodeTag(
      BuildTag.tag(
        new AppendTag[PropertyTag1[List[String], Test1]],
        new AppendTag[PropertyTag1[List[Int], Int]],
        new AppendTag[PropertyTag1[List[Long], Long]],
        new AppendTag[PropertyTag1[List[String], String]]
      ),
      BuildTag.tag(new AppendTag[PropertyTag1[List[Long], Long]], new AppendTag[PropertyTag1[List[Int], Test2]], new AppendTag[PropertyTag1[List[String], Test3]])
    ))
  val tag2 = BuildTag.lift(
    BuildTag.nodeTag(
      BuildTag.tag(
        new AppendTag[PropertyTag1[List[Test1], Test1]],
        new AppendTag[PropertyTag1[List[Int], Int]],
        new AppendTag[PropertyTag1[List[Long], Long]],
        new AppendTag[PropertyTag1[List[String], String]]
      ),
      BuildTag.tag(new AppendTag[PropertyTag1[List[Long], Long]], new AppendTag[PropertyTag1[List[Test2], Test2]], new AppendTag[PropertyTag1[List[Test3], Test3]])
    ))

  val result = BuildTag.mergeTag(tag1, tag2)
  val ii: AppendTag[NodeTag2[
    TupleTag4[PropertyTag2[List[String], List[Test1], Test1],
      PropertyTag2[List[Int], List[Int], Int],
      PropertyTag2[List[Long], List[Long], Long],
      PropertyTag2[List[String], List[String], String]],
    TupleTag3[PropertyTag2[List[Long], List[Long], Long], PropertyTag2[List[Int], List[Test2], Test2], PropertyTag2[List[String], List[Test3], Test3]]
  ]] = result

}
