fun add() = println(100)

try {
  add()
  throw Exception("예외 발생")
} catch(e: Exception) {
  println(e)
} finally {
  println("정상적으로 처리")
}