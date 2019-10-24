package asuna
class HListTypeHListPlus5 {
@inline def plus5[ E1 <: TypeHList  ,   E2 <: TypeHList  ,   E3 <: TypeHList  ,   E4 <: TypeHList  ,   E5 <: TypeHList  ]: Plus[
HListTypeHList4[ E1  ,   E2  ,   E3  ,   E4  ],
E5,
HListTypeHList5[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ]
] =
AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
HListTypeHList4[ E1  ,   E2  ,   E3  ,   E4  ],
E5,
HListTypeHList5[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ]
]]
}
object HListTypeHListPlus5 extends HListTypeHListPlus5
