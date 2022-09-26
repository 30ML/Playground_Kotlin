loop@ for (i in 1..3) {
  for (j in 1..5) {
    if (j == 3) {
      println("내포 순환")
      break@loop
    }
    println("for 순환 $j")
  }
}