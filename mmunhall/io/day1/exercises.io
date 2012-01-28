write("1 + 1: ")
writeln(1 + 1)
writeln

write ("if (0): ")
writeln (if (0))
write ("if (\"\"): ")
writeln (if(""))
write ("if (nil): ")
writeln (if(nil))
writeln

writeln("To tell what slots an object's prototype supports: [object] proto slotNames: ")
Dad := Object clone
Dad name := "Papa"
Son := Dad clone
writeln(Dad slotNames)
writeln(Son proto slotNames)
writeln

writeln(": Assigns a value.")
writeln(":= Creates an object if it doesn't exist, then sets value to that object.")
writeln("::= Creates an object, sets it's value, and creates a setter for the object/property.")
writeln

Dad saymyname := method("My name is ", self name)
writeln(Dad saymyname, "\n")


writeln("1 + 'one': Won't work because Io is strongly typed.")
writeln(1 + 'one')
writeln("Io must be strongly typed.")
