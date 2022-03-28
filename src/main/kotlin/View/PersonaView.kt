package View

import Controller.PersonaController

class PersonaView(nombre: String, sexo: Char, edad: Int, peso: Int, altura: Float) :
    PersonaController(nombre, sexo, edad, peso, altura) {

        fun LlamaMetodos(){
            print(calcularIMC())
            print(comprobarSexo())
            print(esMayorDeEdad())

        }
}