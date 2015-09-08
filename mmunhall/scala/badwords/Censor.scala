trait Censor {
    def replace(text:String, replaceMap:Map[String,String]):String = {
        var replaceString = text
        replaceMap.foreach(sub =>
            replaceString = replaceString.replaceAll(sub._1, sub._2)
        )
        return replaceString
    }
}
