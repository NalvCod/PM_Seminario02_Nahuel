import android.media.Image.Plane

class SistemaSolar (val planetas : List<Planeta>) {


    fun planetaMayor():Planeta{
        var max = planetas[0]
        for (planeta in planetas){
            if (planeta.masa >= max.masa){
                max = planeta
            }
        }
        return max
    }

    fun planetaMenor():Planeta{
        var min = planetas[0]
        for (planeta in planetas){
            if (planeta.masa <= min.masa){
                min = planeta
            }
        }
        return min
    }

    fun planetaMedia():Int{
        var suma = 0
        for (planeta in planetas){
            suma += planeta.masa.toInt()
        }
        return suma / (planetas.size+1)
    }
}