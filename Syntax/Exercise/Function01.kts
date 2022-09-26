fun 함수명(매개변수명1: String, 매개변수명2: String): Pair<String, String> {
  val 지역변수1 = 100
  val 지역변수2 = 300

  fun 지역함수명(매개변수명: String): String {
    return "매개변수명"
  }

  class 지역클래스명 {}
  // object 지역 오브젝트{}

  println("$지역변수1 $지역변수2")

  return Pair(매개변수명1, 매개변수명2)
}

val 결과값 = 함수명("함수", "호출")
println(결과값)