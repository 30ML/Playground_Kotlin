fun outer1(x: Int): (Int) -> Int {
  fun inner(y: Int) = x + y
  return ::inner // 함수 참조 반환
}
val inner1 = outer1(10)
println(inner1(10))

fun outer2(x: Int): (Int) -> Int {
  return { y: Int -> x + y } // lambda expression 반환
}
val inner2 = outer2(10)
println(inner2(10))

fun outer3(x: Int): (Int) -> Int {
  return fun(y: Int) = x + y // anonymous function 반환
}
val inner3 = outer3(10)
println(inner3(10))
