fun addVarArg(vararg x: Int): Int {
  var result = 0
  for (el in x) result += el
  return result
}

println("Variable Arg: 0 = " + addVarArg())
println("Variable Arg: 4 = " + addVarArg(1, 2, 3, 4))
println("Variable Arg: 6 = " + addVarArg(1, 2, 3, 4, 5, 6))

val ll = intArrayOf(1, 2, 3, 4)
println("spread operator = " + addVarArg(*ll))