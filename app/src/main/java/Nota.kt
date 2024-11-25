open class Nota (var id:Int = 0, var linea:String ="") {

    override fun toString(): String {
        return "El id es $id y el texto: $linea"
    }
}