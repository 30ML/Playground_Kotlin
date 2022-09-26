val toUpperCase = { str: String -> str.uppercase() }
println(toUpperCase.invoke("summer"))

val upper = fun (str: String): String {
  return str.uppercase()
}
println(upper.invoke("fall in love"))

fun toLowerCase(str: String): String {
  return str.lowercase()
}
println(toLowerCase("SUMMER"))

val lower = ::toLowerCase
println(lower.invoke("Summer"))