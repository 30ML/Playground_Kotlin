val a: () -> Unit = { println("Function") }
val b: (Int) -> Int = { x -> x * 3 }
val c: (Int, Int) -> Int = { x, y -> x + y }

a()
println(b(10))
println(c(10, 20))