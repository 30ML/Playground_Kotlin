val a: () -> Unit = fun() { println("Function") }
val b: (Int) -> Int = fun(x: Int): Int { return x * 3 }
val c: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }

a()
println(b(10))
println(c(10, 20))