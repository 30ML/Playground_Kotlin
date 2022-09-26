val ml1 = mutableListOf(1, 2, 3, 4)
println(ml1)

fun addList1(ml1: MutableList<Int>): MutableList<Int> {
  ml1.add(5)
  return ml1
}

val ml2 = addList1(ml1.toList().toMutableList()) // mutable list를 복사해서 처리
println(ml1 == ml2)
println(ml1)
println(ml2)