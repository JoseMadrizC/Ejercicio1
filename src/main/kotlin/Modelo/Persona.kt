package Modelo

 class Persona {
     var nombre : String =""
     var sexo : Char = '\u0000'
     var edad : Int = 0
     var peso : Int = 0
     var altura : Float = 0F

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

     override fun toString(): String {
         return "Persona(nombre='$nombre', sexo=$sexo, edad=$edad, peso=$peso, altura=$altura)"
     }

 }