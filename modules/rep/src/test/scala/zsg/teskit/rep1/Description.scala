package zsg.testkit.rep1

import zsg.rep.RepFunction

class Description(val description: String)

object Description extends DescriptionImplicit1 {
  implicit def implicit2: RepFunction[StartRoute, Description, RouteModel] = RepFunction((start, de) => new RouteModel(description = de.description))
  implicit def implicit3: RepFunction[RouteModel, Description, RouteModel] = RepFunction((route, de) => new RouteModel(description = de.description))
}

trait DescriptionImplicit1 {
  implicit def implicit1[I]: RepFunction[I, Description, I] = RepFunction.identity
}
