package Controller

import Modelo.Persona

 class PersonaController {

    val PesoIdeal = 0
    val Sobrepeso = 1
    val Pesobajo = -1
    var persona = Persona()

     constructor(persona: Persona){
         this.persona = persona
     }

     fun calcularIMC(): Int{
          if((persona.peso/100) / (persona.altura * persona.altura) < 18.5)
              return PesoIdeal
          if ((persona.peso/100) / (persona.altura * persona.altura) < 25.0)
              return Sobrepeso
         else return Pesobajo

     }

     fun esMayorDeEdad(): Boolean{
         if (persona.edad > 17){return true}
         else return false
     }

     fun comprobarSexo(){
         if (persona.sexo != 'M' || persona.sexo != 'H')
             persona.sexo = 'H'
     }


     override fun toString(): String {
         return "PersonaController(persona=$persona)"
     }


 }