{ println("no args") }()

println({ x: Int -> x * x }(10))
println({ x: Int, y: Int -> x * y}(10, 20))

val a = { x: Int, y: Int -> x + y }
println(a(200, 300))

fun func(x: Int, y: Int, f: (Int, Int) -> Int): Int {
  return f(x, y)
}
println(func(100, 200, { x, y -> x + y }))