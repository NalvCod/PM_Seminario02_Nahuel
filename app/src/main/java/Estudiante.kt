class Estudiante (var nombre:String, var edad:Int, var calificaciones: MutableList<Int>) {

    override fun toString(): String {
        return "Nombre: $nombre | Edad: $edad | Notas: $calificaciones"
    }

    fun media():Float{
        var suma = 0f
        var divisor = calificaciones.size

        for (nota in calificaciones){
            suma += nota
        }
        var media = suma/divisor

        return media
    }
}
