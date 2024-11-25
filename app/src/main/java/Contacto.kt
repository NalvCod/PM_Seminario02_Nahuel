class Contacto(var nombre:String, var tlf:Int, email:String) { //Puedo ponerlo por defecto directamente aquí
    constructor() : this("Nombre", 650810357, "correo") {

    }

    override fun toString(): String {
        return "Nombre: $nombre "
    }

}