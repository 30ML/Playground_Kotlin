val res3 = (fun (x: Int): (Int) -> Int {
  val inner = fun(y: Int): Int {
    return x + y
  }
  return inner
}) (10)(20)
println(res3)

val res4 = (fun (x: Int): (Int) -> Int {
  return fun(y: Int): Int {
    return x + y
  }
}) (10)(20)
println(res4)

val res5 = fun(x: Int, y: Int, f: (Int, Int) -> Int): Int {
  return f(x, y)
}
println(res5(100, 200, fun(x: Int, y: Int): Int { return x + y }))