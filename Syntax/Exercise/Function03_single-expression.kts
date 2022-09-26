fun add(x: Int, y: Int): Int {
  return x + y
}
println("add(10, 20) = ${add(10, 20)}")

fun add1(x: Int, y: Int): Int = x + y
println("add1(10, 20) = ${add1(10, 20)}")

fun add2(x: Int, y: Int) = x + y
println("add2(10, 20) = ${add2(10, 20)}")
