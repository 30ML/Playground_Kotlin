fun unit() { println("Unit") }
fun triple(x: Int): Int { return x * 3 }
fun add(x: Int, y: Int): Int { return x + y }

val a: () -> Unit = ::unit
val b: (Int) -> Int = ::triple
val c: (Int, Int) -> Int = ::add

a()
println(b(10))
println(c(10, 20))