val il = listOf(1, 2, 3, 4)
println(il)

fun addList(il: List<Int>): List<Int> {
  return il + listOf(6, 7)
}

println("result pop!")
val il2 = addList(il)
println(il)
println(il2)
println(il2 == il)