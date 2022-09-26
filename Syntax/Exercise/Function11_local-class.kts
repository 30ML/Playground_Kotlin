fun outerFunc(x: Int): Int {
  val y = 100
  fun localFunc() = x + y
  return localFunc()
}
println("지역함수 실행 = " + outerFunc(100))