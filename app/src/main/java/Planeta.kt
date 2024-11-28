

class Planeta(nombre:String, masa:Double, periodoRotacion:Double, excentricidadOrbital:Double, var satelite: Satelite?) : CuerpoCeleste (nombre, masa, periodoRotacion, excentricidadOrbital) {

    constructor(nombre:String ="", tipo:String ="", masa:Double) : this (nombre, masa, 0.0, 0.0, null)

    override fun toString(): String {
        return "Planeta con nombre $nombre DATOS: $masa, $periodoRotacion, $excentricidadOrbital}"
    }
}