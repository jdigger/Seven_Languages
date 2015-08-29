/*
    This is admittedly half-assed, but it works and fulfills the requirement.
*/

class Board(a1:Char, a2:Char, a3:Char, b1:Char, b2:Char, b3:Char, c1:Char, c2:Char, c3:Char) {

    def winner():Char = {
        // x x x
        // o o o
        // o o o
        if (a1 != '_' && a1 == a2 && a1 == a3) {
            return a1
        }

        // o o o
        // x x x
        // o o o
        if (b1 != '_' && b1 == b2 && b1 == b3) {
            return b1
        }

        // o o o
        // o o o
        // x x x
        if (c1 != '_' && c1 == c2 && c1 == c3) {
            return c1
        }

        // x o o
        // x o o
        // x o o
        if (a1 != '_' && a1 == b1 && a1 == c1) {
            return a1
        }

        // o x o
        // o x o
        // o x o
        if (a2 != '_' && a2 == b2 && a2 == c2) {
            return a2
        }

        // o o x
        // o o x
        // o o x
        if (a3 != '_' && a3 == b3 && a3 == c3) {
            return a3
        }

        // x o o
        // o x o
        // o o x
        if (a1 != '_' && a1 == b2 && a1 == c3) {
            return a1
        }

        // o o x
        // o x o
        // x o o
        if (a3 != '_' && a3 == b2 && a3 == c1) {
            return a3
        }

        return '_'
    }
}

if (args.length < 1 || !(args(0).matches("^[XO_]{9,9}$"))) {
	println("Incorrect argument. First argument expected to be nine character string of X, O and _.")
    System.exit(1)
}

val board = new Board(args(0)(0), args(0)(1), args(0)(2), args(0)(3), args(0)(4), args(0)(5), args(0)(6), args(0)(7), args(0)(8))
println("Winner is " + board.winner())
