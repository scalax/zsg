package net.scalax.asuna.helper.template

import net.scalax.asuna.helper.SetterContent

trait CaseClassDataHelperAbs {
  def toSetterContent(setterContent: SetterContent): SetterContent
}