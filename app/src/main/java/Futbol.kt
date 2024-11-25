import kotlin.random.Random

class Futbol (nombre: String, pais:String) {

    fun championsLeague(lista:List<Futbol>) {
        val numeros = IntArray(8)
        var cont = 0
        while (cont < 8) {
            val num = Random.nextInt(16)
            if (num !in numeros) {
                numeros[cont] = num
                cont++
            }
        }
    }
}
