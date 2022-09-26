println((fun (매개변수1: Int, 매개변수2: Int): Int { // anonymous function 바로 실행
  return 매개변수1 + 매개변수2
}) (100, 200))

val 덧셈 = fun (매개변수1: Int, 매개변수2: Int): Int {
  return 매개변수1 + 매개변수2
}
val res1 = 덧셈(300, 200)
println(res1)

val res2 = (fun (매개변수1: Int, 매개변수2: Int): Int {
  return 매개변수1 + 매개변수2
}) (500, 200)
println(res2)