package Modelo

open class Persona {
    protected var nombre : String =""
    protected var sexo : Char = '\u0000'
    protected var edad : Int = 0
    protected var peso : Int = 0
    protected var altura : Float = 0F

    constructor(nombre : String,sexo : Char, edad : Int, peso : Int, altura : Float ){
        this.nombre = nombre
        this.sexo = sexo
        this.edad = edad
        this.altura = altura
        this.peso = peso
    }

    constructor(nombre: String, sexo: Char, edad: Int) {
        this.nombre = nombre
        this.sexo = sexo
        this.edad = edad
    }

    constructor()

}