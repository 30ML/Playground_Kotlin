val r = ('a'..'c').iterator()

while (r.hasNext()) {
  print(r.next())
}
println()

('a'..'c').forEach(::print)
println()