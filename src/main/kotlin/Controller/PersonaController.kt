package Controller

import Modelo.Persona

open class PersonaController(nombre: String, sexo : Char, edad: Int, peso: Int, altura: Float) : Persona(nombre, sexo, edad, peso, altura) {

    fun calcularIMC(): Float{
     var pesoIdeal = peso/(altura*altura)
        return pesoIdeal
    }

    fun esMayorDeEdad(): Boolean{
        if (edad > 17){return true}
        else return false
    }

    fun comprobarSexo() : Char{
        return sexo
    }

    fun tostring() {
        println("Nombre: " + nombre)
        println("Sexo: " + sexo)
        println("Edad: " + edad)
        println("Peso: " + peso)
        println("Altura: " + altura)

    }
}