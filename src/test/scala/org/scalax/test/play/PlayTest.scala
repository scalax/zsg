package org.scalax.asuna.circe

import org.scalax.asuna.implements.play.abc.PlayHelper
import play.api.libs.json.{Format, Json, Writes}

object PlayTest extends App with PlayHelper {

  case class TreeItem(id: Int, name: String, items: List[TreeItem])

  val model = TreeItem(
      12
    , "34"
    , List(
        TreeItem(67, "89", List(TreeItem(1416, "1718", List(TreeItem(1920, "2122", List.empty), TreeItem(2324, "2526", List.empty)))))
      , TreeItem(1011, "1213", List.empty)
    )
  )

  val json1 = {
    implicit lazy val encoder1: Format[TreeItem] = encoder2
    lazy val encoder2: Format[TreeItem]          = Json.format[TreeItem]

    val json = encoder2.writes(model)
    println(Json.stringify(json))
    json
  }

  val json2 = {
    implicit lazy val encoder6: Writes[TreeItem] = play.effect(play.singleModel[TreeItem](Def).compile).write

    object Def

    val json = encoder6.writes(model)
    println(Json.stringify(json))
    json
  }

  println(json1 == json2)

}
