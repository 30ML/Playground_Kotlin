fun defaultArg(x: Int = 100, y: Int = 200) = x + y

println("Positional Args 전부 전달 = " + defaultArg(300, 400))
println("Named Args 전부 전달 = " + defaultArg(y = 300, x = 400))

println("No Args = " + defaultArg())
println("Only 1 Arg = " + defaultArg(500))