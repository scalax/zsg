package asuna
abstract class Plus6[
    X1 , X2 , X3 , X4 , X5 , X6,
    Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
    Z1 , Z2 , Z3 , Z4 , Z5 , Z6
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
        def takeHead4(z: Z4): X4
        def takeTail4(z: Z4): Y4
        def plus4(x: X4, y: Y4): Z4
        def takeHead5(z: Z5): X5
        def takeTail5(z: Z5): Y5
        def plus5(x: X5, y: Y5): Z5
        def takeHead6(z: Z6): X6
        def takeTail6(z: Z6): Y6
        def plus6(x: X6, y: Y6): Z6
}
