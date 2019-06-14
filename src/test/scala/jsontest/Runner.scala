package runner

import content._

object Runner extends App {

  object 鼎1Getter extends Getter[鼎1]
  object 鼎2Getter extends Getter[鼎2]
  object 百年交好     extends Getter[(汉朝, 匈奴)]

  println(鼎1Getter.toJson(米粒01("米粒01", 1)).noSpaces)
  println(鼎1Getter.toJson(米粒03("米粒03", 3)).noSpaces)

  println(鼎2Getter.toJson(黑豆01("黑豆01", 1)).noSpaces)
  println(鼎2Getter.toJson(黑豆02("黑豆02", 1)).noSpaces)

  println(百年交好.toJson(汉人01("汉人01", 16)).noSpaces)
  println(百年交好.toJson(汉人02("汉人02", 18)).noSpaces)

  val 单于 = 郅支单于(name = "郅支单于", age = 18, 娶 = List(昭君(name = "昭君", age = 16, 出塞 = Option.empty)))
  println(百年交好.toJson(单于).noSpaces)

  //百年交好.toJson(米粒01("米粒01", 1))  //not compiled

}
