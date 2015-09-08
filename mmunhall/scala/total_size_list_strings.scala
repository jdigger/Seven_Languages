val stringCountCurried = args.foldLeft(0)((sum, arg) =>
    sum + arg.length
)

val stringCountWeird = (0 /: args) {(stringCountWeird, arg) =>
    stringCountWeird + arg.length
}

println("stringCountCurried: There are " + stringCountCurried + " characters in the list of strings.")
println("stringCountWeird: There are " + stringCountWeird + " characters in the list of strings.")
