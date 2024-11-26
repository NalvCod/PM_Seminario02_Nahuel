class Prueba() {
    init {
        var notas = mutableListOf(
            Nota(0, "Nota 0"),
            Nota(1, "Nota 1"),
            Nota(2, "Nota 2"),
            Nota(3, "Nota 3"),
            Nota(4, "Nota 4")
        )


        var test = BlocNotas(notas)
        test.contarNota()
        test.listarNota()
        test.eliminarNota(1)
        test.introducirNota(Nota(5, "aa"))
    }




}