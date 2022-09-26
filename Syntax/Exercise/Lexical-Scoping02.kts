fun funcLen(length: Int): (String) -> Boolean {
  return { input: String -> input.length == length }
}

val len4 = funcLen(4)
println(len4("벌써 여름인가"))
println(len4("여름인가"))

val len6 = funcLen(6)
println(len6("벌써 여름인가"))
println(len6("여름인가"))