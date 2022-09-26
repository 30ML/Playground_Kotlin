var outVar = 300

fun outerFunc(x: Int): Int {
  val y = 100

  fun innerFunc(): Int {
    var z = 777
    z += outVar
    
    fun localFunc() = x + y + z
    return localFunc()
  }
  return innerFunc()
}

println(outerFunc(100))