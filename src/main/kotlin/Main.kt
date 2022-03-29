import Controller.PersonaController
import Modelo.Persona
import View.PersonaView

fun main(args: Array<String>) {

    print("Ingrese su Nombre: ")
    var nombre = readLine().toString()
    print("Ingrese su sexo: ")
    var sexo = readLine()!![0]
    print("Ingrese su edad: ")
    var edad = readLine()!!.toInt()
    print("Ingrese su altura: ")
    var altura = readLine()!!.toFloat()
    print("Ingrese su peso: ")
    var peso = readLine()!!.toInt()

    var persona1 = Persona (nombre,sexo,edad, peso,altura)
    var persona2 = Persona (nombre,sexo,edad, peso,altura)
    var persona3 = Persona ()

    var personaController1 = PersonaController(persona1)
    var personaController2 = PersonaController(persona2)
    var personaController3 = PersonaController(persona3)

    println("persona 1 : ")
    println(personaController1.calcularIMC())
    println(personaController1.esMayorDeEdad())
    println(personaController1.toString())

    println("persona 2 : ")
    println(personaController2.calcularIMC())
    println(personaController2.esMayorDeEdad())
    println(personaController2.toString())

    println("persona 3 : ")
    println(personaController3.calcularIMC())
    println(personaController3.esMayorDeEdad())
    println(personaController3.toString())




    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}