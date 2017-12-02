import java.io.File

fun main(args: Array<String>)
{
    val root : String = "c:\\Project\\"
    val f : FileTreeWalk = File(root).walkTopDown() ;
    fun elaborate(str : String)
    {
        println (str)
    }
    f.forEach {elaborate(it.name)}
}