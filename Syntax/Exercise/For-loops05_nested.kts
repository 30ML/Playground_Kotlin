for (i in 1..2) {
  for (j in 1..3) {
    if (j == 2) {
      println("내포 순환")
      break
    }
    println("for 순환 $j")
  }
}