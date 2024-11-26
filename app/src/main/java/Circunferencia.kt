open class Circunferencia (var radio: Float = 0f) {

    constructor(posCentroX:Int = 0, posCentroY:Int = 0, puntoAleatorioX:Int = 0, puntoAleatorioY: Int = 0) : this(radio = 0.0f){
        //Podría usar Pair para X e Y

    }

    fun longitud(): Double {
        return 2 * 3.14 * radio
    }

    override fun toString(): String {
        return super.toString()
    }


}