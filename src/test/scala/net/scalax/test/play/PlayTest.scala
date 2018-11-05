package net.scalax.asuna.circe

import ai.x.play.json.Jsonx
import net.scalax.asuna.implements.play.abc.PlayHelper
import play.api.libs.json.{Format, Json, Writes}

object PlayTest extends App with PlayHelper {

  case class TreeItem(id: Int, name: String, items: List[TreeItem])

  lazy val encoder1: Format[TreeItem] = Abc.encoder2

  object Abc {

    implicit lazy val encoder3: Format[TreeItem] = encoder1
    lazy val encoder2: Format[TreeItem]          = Jsonx.formatCaseClass[TreeItem]

  }

  val model = TreeItem(
      12
    , "34"
    , List(
        TreeItem(67, "89", List(TreeItem(1416, "1718", List(TreeItem(1920, "2122", List.empty), TreeItem(2324, "2526", List.empty)))))
      , TreeItem(1011, "1213", List.empty)
    )
  )

  println(Json.stringify(encoder1.writes(model)))

  lazy val encoder4: Writes[TreeItem] = play.effect(play.singleModel[TreeItem](Def).compile).write

  object Def {
    lazy val items: Writes[List[TreeItem]] = {
      implicit val encoder6 = encoder4
      implicitly
    }
  }

  println(Json.stringify(encoder4.writes(model)))

  println(encoder1.writes(model) == encoder4.writes(model))

}
