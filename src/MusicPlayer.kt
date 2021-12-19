class MusicPlayer {
    private var music: Array<String> = arrayOf()

    fun add(sonora: String): Array<String>{
        music += sonora
        return music
    }
    fun show(){
        for(sonora in music){
            println(music)
        }
    }
    fun play(){
        println(music[0] + "Music Player")
    }
}
fun main() { //args: Array<String>
    val m = MusicPlayer()

    while(true) {
        val input = readLine()!!.toString()
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}