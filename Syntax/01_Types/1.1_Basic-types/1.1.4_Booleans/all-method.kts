var height = 46
println(height in 1..53)

val list = listOf(1, 2, null)

println(list.any({ it == null }))
println(list.all({ it == null }))
println(list.none({ it == null }))