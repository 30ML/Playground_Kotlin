fun systemInfoR(): String = 
  when(val cores = Runtime.getRuntime().availableProcessors()) {
    1 -> "1 Core"
    in 2..16 -> "$cores Cores"
    else -> "I want your machine"
  }

  println(systemInfoR())