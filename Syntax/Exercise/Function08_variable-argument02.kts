val ll = listOf(1, 2, 3, 4)

fun addList1(ll: List<Int>): List<Int> {
  val result = ll + listOf(6, 7)
  return result
}

val ll2 = addList1(ll)
println(ll2 == ll)

val ml = mutableListOf(1, 2, 3, 4)

fun addList2(ml: MutableList<Int>): MutableList<Int> {
  ml.add(5)
  return ml
}

val ml2 = addList2(ml)
println(ml == ml2)