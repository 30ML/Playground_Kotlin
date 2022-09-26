val cores = Runtime.getRuntime().availableProcessors()

fun systemInto_(cores: Int): String {
  val result = when(cores) {
    1 -> "1 Core"
    in 2..16 -> "$cores Cores"
    else -> "I want your machine"
  }
  return result
}

println(systemInto_(cores))