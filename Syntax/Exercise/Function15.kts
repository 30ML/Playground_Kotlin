val ml1 = mutableListOf(1, 2, 3, 4)
println(ml1)

fun addList1(ml: MutableList<Int>): MutableList<Int> {
  ml.add(5)
  return ml
}

val ml2 = addList1(ml1.toList().toMutableList()) // mutable list를 복사해서 처리
println(ml1 == ml2)
println(ml1)
println(ml2)