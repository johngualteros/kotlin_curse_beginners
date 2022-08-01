package com.example.kotlinbeginners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesAndConstants()
        //dataTypes()
        //ifStatements()
        //whenStatement()
        //arrays()
        //mapAndDictionaries()
        //loops()
        //nullSafety()
        classes()
    }

    private fun variablesAndConstants() {
        //this is a variable
        var numberOne = 13
        //this is a constant
        val Pi = 3.14516

        println(numberOne)
        println(Pi)

        var secondNumber = 13
        var copySecondNumber = secondNumber
    }

    private fun dataTypes() {
        var integer: Int = 2
        var string: String = "Hello world" //concat with +
        var boolean: Boolean = true
        var double: Double = 2.43
        var float: Float = 13.9f
    }

    private fun ifStatements() {
        val age: Int = 17

        if (age >= 18) { //&& and || and !
            println("$age is older of 18")
        }else{
            println("$age is minor of 18")
        }
    }
    private fun whenStatement(){
        val country:String = "Colombia"

        when (country){
            "Colombia","Spain","Mexico","Argentina","Chile"->{
                println("They speak spanish")
            }
            "United States"->{
                println("They speak English")
            }else -> {
            println("We don´t have supported this country")
        }
        }

        val age:Int = 10
        when(age){
            in 0..2->{
                println("you are a baby")
            }
            in 3..10 ->{
                println("You are a children")
            }
            in 11..17->{
                println("You are a teen")
            }
            in 18..65->{
                println("You are a adult")
            }
            in 66..99->{
                println("You are a old man")
            } else ->{
            println("This is imposible, you are god? 😱")
        }
        }
    }
    private fun arrays(){
        val name:String = "John"
        val lastName:String = "Gualteros"
        val age:String = "17"
        val company:String = "none"

        val myArray = arrayListOf<String>()

        myArray.add(name)
        myArray.add(lastName)
        myArray.add(age)
        myArray.add(company)

        println(myArray)

        myArray.addAll(listOf(name,lastName,age,company))

        println(myArray[0])

        myArray[2] = "18"

        myArray.removeAt(3)

        myArray.forEach{
            println(it)
        }

        myArray.count() //count of data
        myArray.clear() //clear all array
        myArray.first() //get the first index of array
        myArray.last() //get the last index of array
        myArray.sort() //sort the array alphabetic or numeric
    }
    private fun mapAndDictionaries(){
        //all keys or values needed the same type of Data
        var myMap:Map<String ,Int> = mapOf()

        myMap = mutableMapOf("John" to 1,"Daniela" to 2,"Stive" to 3,"Andres" to 4)

        //add data one to one
        myMap["Johan"] = 5
        myMap.put("Carlos" ,6)

        println(myMap["John"])

        myMap.remove("Andres")
    }
    private fun loops(){
        val myArray:List<String> = listOf("Hi","This i a example","web developer")
        val myMap:Map<String,Int> = mapOf("John" to 1,"Daniela" to 4,"Johan" to 59)

        for (myString in myArray){
            println(myString)
        }
        for (myElement in myMap){
            println("${myElement.key} : ${myElement.value}")
        }
        for (i in 1..10){ // 0 until 10
            println("$i x 3 = %d".format(( i * 3 )))
        }
        for (i in 10 downTo 0) {
            println("$i")
        }
        var x = 0
        while(x < 10){
            println("$x")
            x+=2
        }
    }
    private fun nullSafety(){
        var mySafetyString:String? = "John null safety"
        if(mySafetyString != null){
            println(mySafetyString!!) //obligar que no sea nulo
        }
        //safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?:run{
            println(mySafetyString)
        }

        sum(13,9)
    }
    fun sum(firstNumber: Int,secondNumber: Int):Int{
        val sum = firstNumber + secondNumber
        return sum
    }
    private fun classes(){
        val john = Programmer("John",17, arrayOf(Programmer.Language.PYTHON,Programmer.Language.JAVA))
        john.code()
        john.dataProgrammer()
    }
}