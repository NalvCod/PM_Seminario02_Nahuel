class Satelite (nombre:String, masa:Double, periodoRotacion:Double, excentricidadOrbital:Double) : CuerpoCeleste (nombre, masa, periodoRotacion, excentricidadOrbital){

    override fun toString(): String {
        return "Satelite con nombre $nombre DATOS: $masa, $periodoRotacion, $excentricidadOrbital}"
    }

}