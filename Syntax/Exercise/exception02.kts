fun add() = println(100)
fun except() { throw Exception("예외 발생: except()") }

try {
  add()
	except()
	// throw Exception("예외 발생: try")
} catch(e: Exception) {
  println("$e")
} finally {
  println("예외 발생과 상관 없이 처리")
}