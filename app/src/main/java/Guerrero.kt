class Guerrero (nombre:String, pv:Float, pm:Float, nivel:Int) : Pnj(nombre , pv, pm, nivel) {

    override fun lvlUp() {
        nivel += 1
        pv += pv*0.08f
        pm += pm*0.01f
    }

    override fun toString(): String {
        return "Gerrero $nombre de nivel $nivel: \nPM[$pm] | PV[$pv]\n"
    }
}