package net.scalax.asuna.circe.json4s

import org.json4s.JsonAST.JValue

trait Json4sEncoder[T] extends (T => JValue)