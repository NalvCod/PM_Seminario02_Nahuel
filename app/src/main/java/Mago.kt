class Mago (nombre:String, pv:Float, pm:Float, nivel:Int) : Pnj(nombre , pv, pm, nivel) {

    override fun lvlUp() {
        nivel += 1
        pv += pv*0.04f
        pm += pm*0.03f
    }

    override fun toString(): String {
        return "Mago $nombre de nivel $nivel: \nPM[$pm] | PV[$pv]\n"
    }
}