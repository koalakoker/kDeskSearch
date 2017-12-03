import java.io.File

fun main(args: Array<String>)
{
//    val root : String = "c:\\Project\\"
    val root : String = "/Users/koalakoker/IdeaProjects"
    val f : FileTreeWalk = File(root).walkTopDown() ;
    var count : Int = 0
    var size: Int = 0
    val map = HashMap<String, String>()

    fun elaborate(str : String, path : String)
    {
        //println (str)
        map.put(str, path)

        count++
        size += str.length
    }

    f.forEach {elaborate(it.name, it.absolutePath)}
    println("Total: ${count} - Size ${size}")

    println(map["app.kt"])
}