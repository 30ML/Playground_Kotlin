val i = 1..10
val c = 'a'..'z'

val iIter = i.iterator()
val cIter = c.iterator()

iIter.forEach { print(it.toString() + ", ") } // 내부 순환
println()

for (i in cIter) print(i + ", ") // 외부 순환
println()