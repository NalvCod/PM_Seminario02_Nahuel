class Matematicas (var a:Int = 0, var b:Int = 0){
    fun restar():Int{
        return a-b
    }

    fun sumar():Int{
        return a+b
    }

    fun multiplicar():Int{
        return a*b
    }

    fun dividir():Float{
        return (a.toFloat()/b.toFloat())
    }

}