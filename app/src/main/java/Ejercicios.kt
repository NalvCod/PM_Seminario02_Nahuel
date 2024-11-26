import kotlin.random.Random

fun main(){
    /*
    Ejercicio 1.
    Crea la clase de datos Planeta.
    Cada planeta tendrá un nombre, tipo –Rocoso o gaseoso- y una masa. Crea la clase
    sistema solar la cual tendrá una lista de planetas y los métodos .planetaMayor() que
    devuelve el planeta de mayor masa, .planetaMenor() que devuelve el planeta de menor
    masa y .masaMedia() que devuelve la masa media de los planetas del sistema solar.
     */
    println("\nEJERCICIO 1")
    var planetas = listOf(
        Planeta ("Mercurio", "gaseoso", 2000),
        Planeta ("Venus", "gaseoso", 3000),
        Planeta ("Tierra", "rocoso", 5000),
        Planeta ("Tierra", "rocoso", 6000),
        Planeta ("Marte", "rocoso", 5000),
        Planeta ("Jupiter", "rocoso", 9000),
        Planeta ("Saturno", "rocoso", 5000),
        Planeta ("Urano", "rocoso", 7000),
        Planeta ("Neptuno", "rocoso", 200),
        Planeta ("Plutón", "rocoso", 5000),
    )
    var ss = SistemaSolar(planetas)
    println(ss.planetaMayor())
    println(ss.planetaMedia())
    println(ss.planetaMenor())

    /*
    Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro, tipo
    de triángulo (isósceles, escaleno o equilátero). Implementar el métdo
    .rectangulo():Boolean que calcula si el triángulo es rectángulo. Nota (se parte de la
    hipótesis de que la longitud de los lados dados crean un triángulo)
     */
    println("\nEJERCICIO 2")
    var triangulo = Triangulo(3f, 4f, 5f, 0f, "aa")
    println(triangulo.rectangulo())


    /*
    Ejercicio 3: Gestión de Contactos
    Crea una clase llamada Contacto que represente la información de un contacto en una lista de contactos. La
    clase debe tener propiedades como nombre, número de teléfono y dirección de correo electrónico. Luego,
    crea una lista de objetos Contacto y permite a los usuarios agregar, eliminar y mostrar contactos.
     */

    println("\nEJERCICIO 3")

    var listaContactos = mutableListOf(
        Contacto("Nahuel", 666666, "gmial.com"),
        Contacto("Manu", 5555, "gmial.es"),
        Contacto(),
    )
    var contacto = Contacto ("AA", 6666, "hotmail")
    listaContactos.add(contacto)


    println(contacto)
    println(contacto.hashCode())

    /*
    Ejercicio 4: Registro de Estudiantes
    Crea una clase llamada Estudiante que contenga información como nombre, edad y calificaciones. Luego,
    crea una lista de objetos Estudiante y permite a los usuarios agregar nuevos estudiantes, mostrar la
    información de un estudiante en particular y calcular el promedio de calificaciones de todos los estudiantes.
     */
    println("\nEJERCICIO 4")

    var estudiantes = mutableListOf(
        Estudiante("Nahuel", 25, mutableListOf(10, 3, 5, 6)),
        Estudiante("Jaime", 19, mutableListOf(10, 5, 5, 7)),
        Estudiante("Manuel", 20, mutableListOf(5, 8, 5, 7)),
        Estudiante("Pablo", 28, mutableListOf(3, 8, 5, 5))
    )
    println(estudiantes)

    var suma = 0f
    for (i in 0 .. estudiantes.size-1){
        suma += estudiantes[i].media()
    }

    println("La media es ${suma/estudiantes.size}")

    /*
    Ejercicio 5: Control de Inventario
    Crea una clase Producto que represente productos en un inventario. La clase debe tener propiedades como
    nombre del producto, precio y cantidad en stock. Luego, crea una lista de objetos Producto y permite a los
    usuarios agregar nuevos productos, actualizar el stock y mostrar el inventario.
     */

    var objetosProducto = mutableListOf(
        Producto("Movil", 250.90f, 3),
        Producto("Carcasa", 5f, 10)
    )

    /*
    Ejercicio 6. Crea una lista con los nueve planeta del Sistema Solar. Usa la clase planeta creada en el ejercicio 1
    Ejercicio 7. Muestra por pantalla toda la información de todos los planetas
    Ejercicio 8. Muestra por pantalla todos los planetas que empiecen por la letra ‘M’
    Ejercicio 9. Muestra por pantalla todos los planetas gaseosos cuya masa sea superior a 20 veces la de la tierra
    Ejercicio 10. Muestra por pantalla la masa media de los planetas del sistema solar
     */
    println("\nEJERCICIOS 6 A 10")

    println(planetas)

    println("PLANETAS CON M: ")
    for (planeta in planetas){
        if (planeta.nombre[0] == 'M'){
            print(planeta)
        }
    }

    println("PLANETAS CON MASA 20 VECES SUPERIOR A LA TIERRA")
    val masaTierra = planetas.get(2).masa

    for (planeta in planetas){
        if (planeta.masa > masaTierra*20){
            println(planeta)
        }
    }

    print("MEDIA: ")
    println(ss.planetaMedia())

    /*
    Ejercicio 11. Crea la clase equipo de fútbol que contenga el nombre y país del equipo
    Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no puede haber más
        de cuatro equipos por país)
    Ejercicio 13. Crea la función championsLeague() que recibe como entrada la
        lista con los 16 equipos y muestra por pantalla un sorteo de octavos* de final
        de la Champions. *(no tengas en cuenta que equipos de un mismo país no
        pueden enfrentarse)
     */
    println("\nEJERCICIOS 11 A 13")

    var equiposFutbol = mutableListOf(
        Futbol("Equipo 1", "España"),
        Futbol("Equipo 2", "Italia"),
        Futbol("Equipo 3", "Francia"),
        Futbol("Equipo 4", "Alemania"),
        Futbol("Equipo 5", "Japón"),
        Futbol("Equipo 6", "Irlanda"),
        Futbol("Equipo 7", "Canadá"),
        Futbol("Equipo 8", "EEUU"),
        Futbol("Equipo 9", "España"),
        Futbol("Equipo 10", "España"),
        Futbol("Equipo 11", "España"),
        Futbol("Equipo 12", "España"),
        Futbol("Equipo 13", "España"),
        Futbol("Equipo 14", "España"),
        Futbol("Equipo 15", "España"),
        Futbol("Equipo 16", "España"),
    )

    fun championsLeague(lista:MutableList<Futbol>): MutableList<Futbol> {
        var listaNueva : MutableList<Futbol> = mutableListOf<Futbol>()
        val numeros = IntArray(8)
        var cont = 0
        while (cont < 8) {
            val num = Random.nextInt(16)
            if (num !in numeros) {
                numeros[cont++] = num //Post incremento segun Jaime. Cuando lo lee, suma uno
                listaNueva.add(lista[num])
            }
        }
        return listaNueva
    }

    var listaN = championsLeague(equiposFutbol)
    println(listaN)

    /*
    Ejercicio 14:
    Crea la clase circunferencia. El constructor primario recibirá el
    radio de la circunferencia y el secundario recibirá la posición del centro de la
    circunferencia y un punto cualquiera de la misma. Crear el metodo longitud()
    y sobrecargar el metodo toString() de forma que muestre toda la info de la circunferencia
     */
    println("\nEJERCICIO 14")

    /*
    Ejercicio 15:
    Crea la clase Círculo que hereda de circunferencia. Tendrá dos
    constructores, el primero recibirá el radio y el color del círculo y el segundo
    su centro, un punto cualquiera y su color. Crear el metodo área() y
    sobrecargar el metodo toString() de forma que muestre toda la info de la
    circunferencia
     */

    println("\nEJERCICIO 15")

    /*
    Ejercicio 16:
    Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar
    operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu
    programa principal.
     */
    println("\nEJERCICIO 16")
    var m = Matematicas (2,3)
    println(m.restar())
    println(m.sumar())
    println(m.dividir())
    println(m.multiplicar())

    /*
    Ejercicio 17:
    clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define
    constructor, accedentes y toString.

    clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define
    constructor, accedentes y toString.

    clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
    todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
    notas contiene el bloc de notas. Debes utilizar una colección.

    clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta.
     */
    println("\nEJERCICIO 17")


    /*
    Ejercicio 18.
    Define una jerarquía de clases que permita almacenar datos sobre los
    planetas y satélites que forman parte del sistema solar (junto con el sol).
    Algunos atributos que puede ser interesante recoger son: la masa del
    cuerpo, su diámetro medio, el período de rotación sobre el propio eje,
    período de traslación alrededor del cuerpo que orbitan, distancia media a
    ese cuerpo, excentricidad de la órbita, etc.

    Define un metodo que, dado un objeto del sistema solar (planeta o satélite),
    imprima toda la información de que se dispone sobre el mismo.
     */
    println("\nEJERCICIO 18")

    /*
    Ejercicio 19.
    Crea la clase PNJ que representa un personaje en un juego de rol. La clase tendrá los atributos,
    nombre, PV –Puntos de Vida-, PM –Puntos mágicos- y LVL. Crea las clases hijas de PNJ Guerrero y
    Mago. Dichas clases implementarán el metodo levelUp() queincrementa el atributo LVL del
    personaje y sus atributos PV y MP. Los guerreros por cada nuevo nivel tendrán un 8% más
    de PV y un 1% más de PM mientras que los magos tendrán un 4% más de PV y
    un 3% más de PM. Crear un guerrero de nivel 1 con 400PV y 50PM y
    un mago de nivel 1 con 1600PV y 150PM. Partiendo del hecho de
    que ambos personajes subirán de nivel siempre a la vez ¿en qué
    nivel el guerrero tendrá más PV que el mago?
     */
    println("\nEJERCICIO 19")
    var guerrerito = Guerrero("Manu", 400f, 50f, 1)
    var maguito = Mago("Nagu", 1600f, 150f, 1)
//    for (i in 0 .. 100){
//        guerrerito.lvlUp()
//        println(guerrerito.toString())
//        maguito.lvlUp()
//        println(maguito.toString())
//    }
    println("Hasta el nivel 99 el guerrero no tendrá más PV que el mago")

    /*
    Ejercicio 20.
    Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del
    juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función
    que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
    dicho año y plataforma. La función también debe poder usarse especificando solo el año
    o solo la plataforma.
     */
    println("\nEJERCICIO 20")
    var listaJuegos = mutableListOf(
        Videojuegos("Anal Cruissing", 2000, "Noentiendo Switch"),
        Videojuegos("Mainkampf", 2010, "Mojón"),
        Videojuegos("The legend of Zerda", 1989, "GameCube"),
        Videojuegos("Hollow Knight", 2000, "Noentiendo Switch")
    )

    fun devolverVideojuegoAnhoPlataforma(lista:MutableList<Videojuegos>, anho:Int = 0, plataforma : String =""):MutableList<Videojuegos>{
        var listaJuegosEncontrados : MutableList<Videojuegos> = mutableListOf()
        for (juego in lista){
            if (juego.anho == anho && juego.plataforma == ""){
                listaJuegosEncontrados.add(juego)
            }else if (juego.plataforma == plataforma && juego.anho == 0){
                listaJuegosEncontrados.add(juego)
            }
        }
        return listaJuegosEncontrados
    }

    /*
    Ejercicio 21.
    Crear una función que dada una lista de videojuegos, lista de años y lista de
    plataformas devuelva los juegos de la lista que fueron creados en esos años y para esas
    plataformas. La función debe poder usarse si solo se especifica la lista de años o la lista
    de plataformas.
     */
    println("\nEJERCICIO 21")
    var listaAnhos = mutableListOf(1999, 2000)
    var listaPlataformas = mutableListOf("Noentiendo Switch", "Mojón")
    fun devolverVideojuegoListas(lista:MutableList<Videojuegos>, lista2:MutableList<Any>){
        var listaJuegosEncontrados : MutableList<Videojuegos> = mutableListOf()
        for (juego in lista){
            for (elemento in lista2){
                if (juego.anho == elemento || juego.plataforma == elemento){
                    listaJuegosEncontrados.add(juego)
                }
            }
        }
    }

    /*
    Ejercicio 22.
    Crea una función que reciba una lista de juegos y devuelva un mapa
    donde las claves sean las plataformas y el valor el número de juegos para dicha plataforma.
     */
    println("\nEJERCICIO 22")
    fun mapaVideojuegos(lista:MutableList<Videojuegos>):Map<String, Int>{
        val mapaJuegos : HashMap<String, Int> = HashMap()

        for (juegos in lista){
            //Si no está la plataforma en el mapa, lo introduzco
            if(!(mapaJuegos.containsKey(juegos.plataforma))){
                mapaJuegos[juegos.plataforma] = 1
            }else{
                mapaJuegos[juegos.plataforma] =  mapaJuegos[juegos.plataforma]!! + 1
            }
        }
        return mapaJuegos
    }

}

