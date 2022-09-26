var n = 0
var m = 0

loop@ while (n < 3) {
  println("n: " + n)
  while (m < 5) {
    println("m: " + m)
    m++
    if (m == 3) break@loop
  }
  n++
}