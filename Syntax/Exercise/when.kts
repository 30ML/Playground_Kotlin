val cores = Runtime.getRuntime().availableProcessors() // CPU Core 개수

when (cores) {
  1 -> println("1 Core")
  in 2..16 -> println("$cores Cores")
  else -> println("I want you machine")
}
