val range1 = 1..10
val range2 = 1.rangeTo(10)

println(range1.javaClass.kotlin)
println(range1 == range2)
println("range2 first = ${range2.first}")
println("range2 last = ${range2.last}")

val range3 = 1.until(10)
println("range3 first = ${range3.first}")
println("range3 last = ${range3.last}")

val range4 = 10.downTo(1)
println("range4 first = ${range4.first}")
println("range4 last = ${range4.last}")