class GIfyer(text:String) extends Censor {
    val rText = text
    var gText = text

    def printR() = {
        println("ORIGINAL TEXT")
        println("-------------")
        println(rText)
        println
    }

    def printG() = {
        println("MODIFIED TEXT")
        println("-------------")
        println(gText)
        println
    }

    def makeG(replaceMap:Map[String,String]) = {
        gText = replace(text, replaceMap)
    }
}
