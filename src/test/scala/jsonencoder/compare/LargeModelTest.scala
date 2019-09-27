package org.scalax.asuna.mapper.test

import org.scalax.asuna.mapper.test.CirceLargeModel.LargeModel_2

object LargeModelTest extends App {

  trait LargeModelPoly extends CircePoly[LargeModelPoly] {

    implicit lazy val largeModel_1_en: CirceEncoder[CirceLargeModel.LargeModel_1] = EncoderTest.initEncoder[CirceLargeModel.LargeModel_1, LargeModelPoly].encoder
    //implicit lazy val largeModel_2_en: CirceEncoder[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder
    /*implicit lazy val largeModel_1_de: CirceDecoder[CirceLargeModel.LargeModel_1] = DecoderTest.implicitDecoder
    implicit lazy val largeModel_2_de: CirceDecoder[CirceLargeModel.LargeModel_2] = DecoderTest.implicitDecoder*/

  }

  object LargeModelPoly extends LargeModelPoly

  object JsonLarge extends CircePolyGetter[LargeModelPoly]

  //val i1 = JsonLarge.toJson(CirceLargeModel.largeModel_2)
  //val i2 = JsonLarge.fromJson[CirceLargeModel.LargeModel_2](i1)

  println(i1.noSpaces)
  println("==================== line ====================")
  //println(i2)

  org.scalax.asuna.mapper.item.BuildTagContect.lift(org.scalax.asuna.mapper.item.BuildTagContect.nodeTag(
    org.scalax.asuna.mapper.item.BuildTagContect.nodeTag(
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$101) => x$101.miaomiao1)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$102) => x$102.miaomiao2)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$103) => x$103.miaomiao3)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$104) => x$104.miaomiao4)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$105) => x$105.miaomiao5)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$106) => x$106.miaomiao6)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$107) => x$107.miaomiao7)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$108) => x$108.miaomiao8))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$109) => x$109.miaomiao9)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$110) => x$110.miaomiao10)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$111) => x$111.miaomiao11)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$112) => x$112.miaomiao12)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$113) => x$113.miaomiao13)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$114) => x$114.miaomiao14)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$115) => x$115.miaomiao15)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$116) => x$116.miaomiao16))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$117) => x$117.miaomiao17)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$118) => x$118.miaomiao18)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$119) => x$119.miaomiao19)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$120) => x$120.miaomiao20)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$121) => x$121.miaomiao21)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$122) => x$122.miaomiao22)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$123) => x$123.miaomiao23)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$124) => x$124.miaomiao24))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$125) => x$125.miaomiao25)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$126) => x$126.miaomiao26)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$127) => x$127.miaomiao27)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$128) => x$128.miaomiao28)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$129) => x$129.miaomiao29)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$130) => x$130.miaomiao30)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$131) => x$131.miaomiao31)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$132) => x$132.miaomiao32))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$133) => x$133.miaomiao33)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$134) => x$134.miaomiao34)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$135) => x$135.miaomiao35)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$136) => x$136.miaomiao36)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$137) => x$137.miaomiao37)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$138) => x$138.miaomiao38)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$139) => x$139.miaomiao39)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$140) => x$140.miaomiao40))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$141) => x$141.miaomiao41)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$142) => x$142.miaomiao42)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$143) => x$143.miaomiao43)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$144) => x$144.miaomiao44)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$145) => x$145.miaomiao45)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$146) => x$146.miaomiao46)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$147) => x$147.miaomiao47)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$148) => x$148.miaomiao48))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$149) => x$149.miaomiao49)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$150) => x$150.miaomiao50)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$151) => x$151.miaomiao51)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$152) => x$152.miaomiao52)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$153) => x$153.miaomiao53)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$154) => x$154.miaomiao54)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$155) => x$155.miaomiao55)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$156) => x$156.miaomiao56))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$157) => x$157.miaomiao57)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$158) => x$158.miaomiao58)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$159) => x$159.miaomiao59)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$160) => x$160.miaomiao60)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$161) => x$161.miaomiao61)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$162) => x$162.miaomiao62)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$163) => x$163.miaomiao63)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$164) => x$164.miaomiao64))
      )
    ),
    org.scalax.asuna.mapper.item.BuildTagContect.nodeTag(
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$165) => x$165.miaomiao65)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$166) => x$166.miaomiao66)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$167) => x$167.miaomiao67)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$168) => x$168.miaomiao68)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$169) => x$169.miaomiao69)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$170) => x$170.miaomiao70)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$171) => x$171.miaomiao71)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$172) => x$172.miaomiao72))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$173) => x$173.miaomiao73)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$174) => x$174.miaomiao74)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$175) => x$175.miaomiao75)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$176) => x$176.miaomiao76)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$177) => x$177.miaomiao77)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$178) => x$178.miaomiao78)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$179) => x$179.miaomiao79)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$180) => x$180.miaomiao80))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$181) => x$181.miaomiao81)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$182) => x$182.miaomiao82)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$183) => x$183.miaomiao83)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$184) => x$184.miaomiao84)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$185) => x$185.miaomiao85)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$186) => x$186.miaomiao86)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$187) => x$187.miaomiao87)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$188) => x$188.miaomiao88))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$189) => x$189.miaomiao89)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$190) => x$190.miaomiao90)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$191) => x$191.miaomiao91)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$192) => x$192.miaomiao92)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$193) => x$193.miaomiao93)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$194) => x$194.miaomiao94)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$195) => x$195.miaomiao95)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$196) => x$196.miaomiao96))
      ),
      org.scalax.asuna.mapper.item.BuildTagContect.tag(
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$197) => x$197.miaomiao97)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$198) => x$198.miaomiao98)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$199) => x$199.miaomiao99)),
        new org.scalax.asuna.mapper.append.macroImpl.ModelApply[LargeModel_2]().to(((x$200) => x$200.miaomiao100))
      )
    )
  ))

  org.scalax.asuna.mapper.item.BuildTagContect.item2(
    org.scalax.asuna.mapper.item.BuildTagContect.item8(
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao1", "miaomiao2", "miaomiao3", "miaomiao4", "miaomiao5", "miaomiao6", "miaomiao7", "miaomiao8"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao9", "miaomiao10", "miaomiao11", "miaomiao12", "miaomiao13", "miaomiao14", "miaomiao15", "miaomiao16"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao17", "miaomiao18", "miaomiao19", "miaomiao20", "miaomiao21", "miaomiao22", "miaomiao23", "miaomiao24"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao25", "miaomiao26", "miaomiao27", "miaomiao28", "miaomiao29", "miaomiao30", "miaomiao31", "miaomiao32"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao33", "miaomiao34", "miaomiao35", "miaomiao36", "miaomiao37", "miaomiao38", "miaomiao39", "miaomiao40"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao41", "miaomiao42", "miaomiao43", "miaomiao44", "miaomiao45", "miaomiao46", "miaomiao47", "miaomiao48"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao49", "miaomiao50", "miaomiao51", "miaomiao52", "miaomiao53", "miaomiao54", "miaomiao55", "miaomiao56"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao57", "miaomiao58", "miaomiao59", "miaomiao60", "miaomiao61", "miaomiao62", "miaomiao63", "miaomiao64")
    ),
    org.scalax.asuna.mapper.item.BuildTagContect.item5(
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao65", "miaomiao66", "miaomiao67", "miaomiao68", "miaomiao69", "miaomiao70", "miaomiao71", "miaomiao72"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao73", "miaomiao74", "miaomiao75", "miaomiao76", "miaomiao77", "miaomiao78", "miaomiao79", "miaomiao80"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao81", "miaomiao82", "miaomiao83", "miaomiao84", "miaomiao85", "miaomiao86", "miaomiao87", "miaomiao88"),
      org.scalax.asuna.mapper.item.BuildTagContect.item8("miaomiao89", "miaomiao90", "miaomiao91", "miaomiao92", "miaomiao93", "miaomiao94", "miaomiao95", "miaomiao96"),
      org.scalax.asuna.mapper.item.BuildTagContect.item4("miaomiao97", "miaomiao98", "miaomiao99", "miaomiao100")
    )
  )

}
