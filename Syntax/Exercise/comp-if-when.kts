val number = 10

if (number < 0) {
  println("음수")
} else if (number == 0) {
  println("0")
} else if (number % 2 == 0) {
  println("짝수")
} else {
  println("홀수")
}

when {
  number < 0 -> println("음수")
  number == 0 -> println("0")
  number % 2 == 0 -> println("짝수")
  else -> println("홀수")
}