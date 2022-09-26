fun add(x: Int, y: Int) = x + y // Function
println(add(100, 200))
println({ x: Int, y: Int -> x + y }(100, 200)) // Lambda Expression
println((fun (x: Int, y: Int) = x + y)(100, 200)) // Anonymous Function