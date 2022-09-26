fun comSingle(x: Int, y: Int) = if (x > y) x else y // if expression

val r = comSingle(20, 10)
println(r)

open class People {
  fun hello() = println("Hello World")
}

fun comSingle1() = object: People() { // People()을 상속한 익명 객체 반환
}

val p = comSingle1()
p.hello()