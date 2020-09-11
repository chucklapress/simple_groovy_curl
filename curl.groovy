def proc = 'curl -L http://www.wherethetruck.is'.execute()
proc.waitFor()
println proc.err.text
println proc.text
