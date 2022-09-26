fun addVar(x: Int, y: Int, z: Int) = x + y + z

println("Positional Argument(1) = " + addVar(10, 20, 30))
println("Positional Argument(2) = " + addVar(20, 30, 30))

println("Named Argument(1) = " + addVar(z = 100, x = 20, y = 30))
println("Named Argument(2) = " + addVar(y = 30, x = 20, z = 30))

println("인자 혼합 = " + addVar(30, z = 20, y = 30))
