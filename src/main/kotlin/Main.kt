import View.PersonaView

fun main(args: Array<String>) {
    var persona = PersonaView("Jose", 'h', 23, 55, 1.75F)
    print(persona.comprobarSexo())
    print(persona.tostring())
    print(persona.LlamaMetodos())
    print(persona.comprobarSexo())
    print(persona.esMayorDeEdad())

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}