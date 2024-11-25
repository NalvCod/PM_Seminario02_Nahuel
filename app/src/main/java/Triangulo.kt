class Triangulo(var l1:Float = 0.0f, var l2:Float = 0.0f, var l3:Float = 0.0f, var perimetro:Float = 0.0f, var tipoTriangulo:String = "") {

    fun rectangulo():Boolean{
        val lados = listOf(l1, l2, l3).sorted()

        if ((lados[0]*lados[0]) + (lados[1]*lados[1]) == (lados[2]*lados[2])) return true
        else return false
    }
}