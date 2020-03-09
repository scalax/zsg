package asuna
abstract class Plus3[
    X1 , X2 , X3,
    Y1 , Y2 , Y3,
    Z1 , Z2 , Z3
] {
        def takeHead1(z: Z1): X1
        def takeTail1(z: Z1): Y1
        def plus1(x: X1, y: Y1): Z1
        def takeHead2(z: Z2): X2
        def takeTail2(z: Z2): Y2
        def plus2(x: X2, y: Y2): Z2
        def takeHead3(z: Z3): X3
        def takeTail3(z: Z3): Y3
        def plus3(x: X3, y: Y3): Z3
}
