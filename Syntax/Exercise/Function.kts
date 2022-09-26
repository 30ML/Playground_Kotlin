fun add(x: Int, y: Int) = x + y
val addVal = ::add

println(add(10, 20))
println((::add).hashCode() == addVal.hashCode())
println(add(30, 20))
println((::add).hashCode() == addVal.hashCode())