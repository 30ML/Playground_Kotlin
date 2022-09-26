val producePrinter1: () -> () -> Unit = {{ println("함수 전달 1") }}

val producePrinter2 = {{ println("함수 전달 2") }}

fun outer(): () -> Unit {
  return { println("함수 전달 3") }
}
val producePrinter3: () -> () -> Unit = ::outer

producePrinter1()()
producePrinter2()()
producePrinter3()()
