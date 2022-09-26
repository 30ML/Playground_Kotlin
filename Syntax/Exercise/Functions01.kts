fun ret(): () -> Int {
  return { 100 }
}
val r = ret()
println(r())

val il = listOf(1, 2, 3)

println(il.map { it * it })

class LL(val action: (Int) -> Int)
val l = LL({ it * 2 })
println(l.action(10))