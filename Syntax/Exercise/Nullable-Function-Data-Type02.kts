val innerFunc1: (Int) -> ((Int) -> Int)? = { _ -> null }
println(innerFunc1(10)?.invoke(20))

val innerFunc2: (Int) -> ((Int) -> Int)? = { n -> { m -> n + m } }
println(innerFunc2(10)?.invoke(20))

val innerFunc3: (Int) -> ((Int) -> Int)? = 
  fun(n: Int): ((Int) -> Int)? {
    return fun(m: Int): Int {
      return n + m
    }
  }
println(innerFunc3(10)?.invoke(20))

fun funcDT(n: Int): ((Int) -> Int)? {
  fun inner(m: Int): Int { return n + m }
  return ::inner
}
println(funcDT(10)?.invoke(20))