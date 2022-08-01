package com.example.kotlinbeginners

class Programmer(val name:String, val age:Int, val languages:Array<Language>, val friends: Array<Programmer>? = null) {

    enum class Language{
        JAVA,
        KOTLIN,
        JAVASCRIPT,
        PYTHON
    }
    public fun code(){
        for (language in languages){
            println("im Programin in $language")
        }
    }
    public fun dataProgrammer() {
        return println("$name $age")
    }
}