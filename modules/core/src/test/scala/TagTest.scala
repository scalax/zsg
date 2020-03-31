package asuna.test

import asuna.{AppendTag, NodeTag1, NodeTag2, PropertyTag1, PropertyTag2, PropertyTag3, TupleTag2}

object TagTest {

  class Test1

  class Test2

  class Test3

  val tag1 = AppendTag.lift(
    AppendTag.nodeTag(
      AppendTag.nodeTag(
        AppendTag.tag(
          new AppendTag[PropertyTag1[List[String], Test1]],
          new AppendTag[PropertyTag1[List[Int], Int]]
        ),
        AppendTag.tag(new AppendTag[PropertyTag1[List[Long], Long]], new AppendTag[PropertyTag1[List[Long], Long]])
      ),
      AppendTag.nodeTag(AppendTag.tag(new AppendTag[PropertyTag1[List[Int], Test2]], new AppendTag[PropertyTag1[List[String], Test3]]))
    )
  )

  val tag2 = AppendTag.lift(
    AppendTag.nodeTag(
      AppendTag.nodeTag(
        AppendTag.tag(
          new AppendTag[PropertyTag1[List[Test1], Test1]],
          new AppendTag[PropertyTag1[List[Int], Int]]
        ),
        AppendTag.tag(new AppendTag[PropertyTag1[List[Long], Long]], new AppendTag[PropertyTag1[List[Long], Long]])
      ),
      AppendTag.nodeTag(AppendTag.tag(new AppendTag[PropertyTag1[List[Test2], Test2]], new AppendTag[PropertyTag1[List[Test3], Test3]]))
    )
  )

  val tag3 = AppendTag.lift(
    AppendTag.nodeTag(
      AppendTag.nodeTag(
        AppendTag.tag(
          new AppendTag[PropertyTag1[List[String], Test1]],
          new AppendTag[PropertyTag1[List[Int], Int]]
        ),
        AppendTag.tag(new AppendTag[PropertyTag1[List[Long], Long]], new AppendTag[PropertyTag1[List[Long], Long]])
      ),
      AppendTag.nodeTag(AppendTag.tag(new AppendTag[PropertyTag1[List[String], Test2]], new AppendTag[PropertyTag1[List[Test3], Test3]]))
    )
  )

  val result = AppendTag.mergeTag(tag1, tag2, tag3)
  val ii: AppendTag[NodeTag2[NodeTag2[
    TupleTag2[PropertyTag3[List[String], List[Test1], List[String], Test1], PropertyTag3[List[Int], List[Int], List[Int], Int]],
    TupleTag2[PropertyTag3[List[Long], List[Long], List[Long], Long], PropertyTag3[List[Long], List[Long], List[Long], Long]]
  ], NodeTag1[TupleTag2[PropertyTag3[List[Int], List[Test2], List[String], Test2], PropertyTag3[List[String], List[Test3], List[Test3], Test3]]]]] = result

}
