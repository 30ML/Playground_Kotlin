for (i in 1..10) {
  if (i % 2 == 0) {
    println("continue $i")
    continue
  }

  if (i == 7) {
    println("break $i")
    break
  }
}