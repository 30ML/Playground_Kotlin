var n = 0
while (n < 2) {
  println("n: " + n)
  
  var m = 0
  while (m < 2) {
    println("m: " + m)
    m++
    if (m == 2) continue
  }
  n++
}