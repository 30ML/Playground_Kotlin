val a = 100
val b = 100
val c = null

println(a == b)
println(a.equals(b))
println(a?.equals(b) ?: (b === null))
println(a === b)

println(c == null)
println(c === null)
println(a?.equals(c) ?: (c === null))