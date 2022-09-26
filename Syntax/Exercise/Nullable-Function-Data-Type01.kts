fun nullFunc(action: (() -> Unit)?): Long {
  val start = System.nanoTime() // 시스템 시간 조회
  action?.invoke()
  return System.nanoTime() - start
}

println(nullFunc(null))
println(nullFunc({ println("Hello World") }))
println(nullFunc(fun(): Unit { println("Anonymous Function") }))

fun unitFunc() = println("함수 처리")
println(nullFunc(::unitFunc))