fun outer1(x: Int) {
  fun inner(y: Int) = x + y
  println(inner(x))
}
outer1(10)

fun outer2(x: Int): Int {
  fun inner(y: Int) = x + y
  return inner(x)
}
println(outer2(10))

fun outer3(x: Int): Int {
  return (fun (y: Int): Int = x + y)(10)
}
println(outer3(10))

fun outer4(x: Int): Int {
  return { y: Int -> x + y }(10)
}
println(outer4(10))