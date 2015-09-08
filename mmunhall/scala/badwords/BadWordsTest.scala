import scala.io.Source

object BadWordsTest {
    def main(args: Array[String]) {
        var badWords = Map[String,String]()

        for (line <- Source.fromFile(args(0)).getLines) {
            val splitLine = line.split(":")
            badWords += splitLine(0) -> splitLine(1)
        }

        val originalText = "Hello Shoot. Hot shoot. Darn bears, darn lions."

        val gIfyer = new GIfyer(originalText)
        gIfyer.printR
        gIfyer.makeG(badWords)
        gIfyer.printG
    }
}
