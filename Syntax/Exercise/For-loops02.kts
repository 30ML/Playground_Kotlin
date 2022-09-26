// for (i in 10..1) { // NOT WORKING
for (i in 10 downTo 1) {
  print(i.toString() + ", ")
}
println()

for (i in 10.downTo(1)) {
  print(i.toString() + ", ")
}
println()

for (i in 10.downTo(10)) {
  print(i.toString() + ", ")
}
println()