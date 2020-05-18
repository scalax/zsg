package zsg.macros.single.utils

import org.apache.commons.codec.digest.DigestUtils

trait Sha1Helper {

  val c: scala.reflect.macros.blackbox.Context

  def toSha1(i: String): String =
    if (i.isEmpty)
      DigestUtils.sha1Hex(c.enclosingPosition.toString + "scala.macro")
    else
      DigestUtils.sha1Hex(i)

}
