class BlocNotas (var notas:MutableList<Nota>) {

    fun introducirNotas(){
        print("aaa")
    }

    fun listarNotas(){

    }

    fun eliminarNotas(posicion:Int){
        notas.removeAt(posicion)
    }

    fun contarNotas():Int{
        return notas.size
    }

}