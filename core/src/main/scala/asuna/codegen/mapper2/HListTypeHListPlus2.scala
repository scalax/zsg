package asuna
class HListTypeHListPlus2 {
@inline def plus2[ E1 <: TypeHList  ,   E2 <: TypeHList  ]: Plus[
HListTypeHList1[ E1  ],
E2,
HListTypeHList2[ E1  ,   E2  ]
] =
AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
HListTypeHList1[ E1  ],
E2,
HListTypeHList2[ E1  ,   E2  ]
]]
}
object HListTypeHListPlus2 extends HListTypeHListPlus2
