package net.scalax.asuna.helper

import net.scalax.asuna.helper.encoder.macroImpl.CaseModelContentHelper

import scala.language.experimental.macros

trait CaseModelContent[Case] {

  def set(arr: Array[Any], propertyName: Symbol, value: Any): Unit

  def toModel(arr: Array[Any]): Case

  def get(caseModel: Case, propertyName: Symbol): Any

  def getFromArr(caseModel: Array[Any], propertyName: Symbol): Any

}

object CaseModelContent {

  def getInstance[Case](implicit content: CaseModelContent[Case]): CaseModelContent[Case] = content
  implicit def getInstanceImplicit[Case]: CaseModelContent[Case] = macro CaseModelContentHelper.CaseModelContentHelperImpl.impl[Case]

}

trait CaseModelContent1111[Case] {

  def toModel(arr: Abcdef): Case
  def get(caseModel: Case, propertyName: Symbol): Any

}

trait Abcdef {
  def fetchValue(symbol: Symbol): Any
}

object CaseModelContent1111 {

  def set(propertyGen: Abcdef, propertyName: Symbol, value: Any): Abcdef = {
    new Abcdef {
      override def fetchValue(symbol: Symbol): Any = {
        if (propertyName eq symbol) {
          value
        } else {
          propertyGen.fetchValue(symbol)
        }
      }
    }
  }

  def emptySetter: Abcdef = new Abcdef {
    override def fetchValue(symbol: Symbol): Any = ()
  }

  def set6(propertyGen: Abcdef, propertyName1: Symbol, value1: Any, propertyName2: Symbol, value2: Any, propertyName3: Symbol, value3: Any, propertyName4: Symbol, value4: Any, propertyName5: Symbol, value5: Any, propertyName6: Symbol, value6: Any, propertyName7: Symbol, value7: Any, propertyName8: Symbol, value8: Any, propertyName9: Symbol, value9: Any, propertyName10: Symbol, value10: Any): Abcdef = {
    new Abcdef {
      override def fetchValue(symbol: Symbol): Any = {
        if (propertyName1 eq symbol) {
          value1
        } else {
          if (propertyName2 eq symbol) {
            value2
          } else {
            if (propertyName3 eq symbol) {
              value3
            } else {
              if (propertyName4 eq symbol) {
                value4
              } else {
                if (propertyName5 eq symbol) {
                  value5
                } else {
                  if (propertyName6 eq symbol) {
                    value6
                  } else {
                    if (propertyName7 eq symbol) {
                      value7
                    } else {
                      if (propertyName8 eq symbol) {
                        value8
                      } else {
                        if (propertyName9 eq symbol) {
                          value9
                        } else {
                          if (propertyName10 eq symbol) {
                            value10
                          } else {
                            propertyGen.fetchValue(symbol)
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  def getInstance[Case](implicit content: CaseModelContent1111[Case]): CaseModelContent1111[Case] = content
  implicit def getInstanceImplicit[Case]: CaseModelContent1111[Case] = macro CaseModelContentHelper.CaseModelContentHelperImpl.impl1111[Case]

}

trait CaseModelContent2222[Case] {

  def toModel(arr: SetterContent): Case
  def get(caseModel: Case, propertyName: Symbol): Any

}

class SetterContent(val key: Symbol, val value: Any, val tail: SetterContent)

object CaseModelContent2222 {

  def set(arr: SetterContent, pro: Symbol, data: Any): SetterContent = {
    new SetterContent(key = pro, value = data, tail = arr)
  }

  val empty: SetterContent = null

  def getInstance[Case](implicit content: CaseModelContent2222[Case]): CaseModelContent2222[Case] = content
  implicit def getInstanceImplicit[Case]: CaseModelContent2222[Case] = macro CaseModelContentHelper.CaseModelContentHelperImpl.impl2222[Case]
}