trait Censor {
    def replace(text:String, replaceMap:Map[String,String]):String = {
        var replaceString = text
        replaceMap.foreach(sub =>
            replaceString = replaceString.replaceAll(sub._1, sub._2)
        )
        return replaceString
    }
}

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

val badWords = Map(
    "shoot" -> "pucky",
    "Shoot" -> "Pucky",
    "darn" -> "ducky",
    "Darn" -> "Ducky"
)
val originalText = "Hello Shoot. Hot shoot. Darn bears, darn lions."

val gIfyer = new GIfyer(originalText)
gIfyer.printR
gIfyer.makeG(badWords)
gIfyer.printG
