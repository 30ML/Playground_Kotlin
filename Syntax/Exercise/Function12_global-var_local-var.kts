var outVar = 300
var outVarR = 999

fun outerFunc1(x: Int): Int {
  val y = 100
  fun localFunc() = x + y + outVarR
  return localFunc()
}

fun outerFunc2(x: Int): Int {
  val y = 100
  fun localFunc(): Int {
    outVar += x
    return x + y + outVar
  }
  return localFunc()
}

println("전역변수 참조 = " + outerFunc1(100))
println("전역변수 갱신 = " + outerFunc2(100))
println("전역변수 = " + outVar)