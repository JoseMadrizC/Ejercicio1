package View

import Controller.PersonaController
import Modelo.Persona

class PersonaView {
    var persona = Persona()
    var personaController = PersonaController(persona)


        fun inicializa(){
            persona.altura = 180F
            persona.peso = 80
            personaController.persona = persona

            println(personaController.calcularIMC())
            println(personaController.esMayorDeEdad())


        }
}