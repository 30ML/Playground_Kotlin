fun add_ex(): Nothing = throw Exception("예외")

val y = try {
  add_ex()
} catch(e: Exception) {
  200
} finally {
  300
}

println(y)