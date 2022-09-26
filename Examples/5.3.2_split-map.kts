val input = readLine()!!.split(' ').map { it.toInt() }

var sum = 0

for (i in (0 until input.size)) {
  sum += input[i]
}

println(sum)