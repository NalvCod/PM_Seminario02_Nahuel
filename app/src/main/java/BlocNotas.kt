class BlocNotas (var notas:MutableList<Nota>) {

    fun introducirNota(nota:Nota){
        notas.add(nota)
    }

    fun listarNota(){
        println(notas.toString())
    }

    fun eliminarNota(posicion:Int){
        notas.removeAt(posicion)
    }

    fun contarNota():Int{
        return notas.size
    }

}