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