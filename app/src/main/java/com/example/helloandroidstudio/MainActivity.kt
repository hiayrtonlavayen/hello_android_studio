package com.example.helloandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloandroidstudio.ui.theme.HelloAndroidStudioTheme
import java.nio.channels.FileChannel.MapMode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
            variablesYConstantes()
            tiposDeDatos()
            sentenciasIf()
            sentenciaWhen()
            myArray()
            maps()
            loops()
            nullSafety()
            println(functions(3,10))


        }
    }


    fun variablesYConstantes() {


        //Variables

        var myFirstVariable = "Hello Kotlin"

        println(myFirstVariable)


        myFirstVariable = "Hola Guapo"

        println(myFirstVariable)



        //Constantes

        val myFirstConstant = "Emergencia"

        println(myFirstConstant)

    }


    fun tiposDeDatos() {


        val myString:String = "Fuego"

        val myInt:Int = 20

        println(myString)
        println(myInt)

    }


    fun sentenciasIf(){

        val myNumber = 10

        if (myNumber <= 10 && myNumber != 5){
            println("$myNumber es menor que 10")
        }
    }


    fun sentenciaWhen(){

        //País
        val country = "UK"

        when(country) {

            "Ecuador" -> {
                println("Idioma Español")
            }
            "Colombia" -> {
                println("Idioma Español")
            }
            "UK" -> {
                println("Idioma Inglés")
            }

        }


    }


    fun myArray(){

        val name = "Ayrton"
        val surname = "Lavayen"
        val age = "22"

        val thisArray = arrayListOf<String>()

        //Add data

        thisArray.add(name)
        thisArray.add(surname)
        thisArray.add(age)

        println(thisArray)


        //Add conjunto

        thisArray.addAll(listOf("Hola", "Bienvenido"))

        println(thisArray)



        //Modificar

        thisArray[4] = "Love"

        println(thisArray)



        //Remove

        thisArray.removeAt(4)

        println(thisArray)


        //Recorrer

        thisArray.forEach {
            println(it)
        }

    }


    fun maps(){

        var myMap:Map<String, Int> = mapOf()

        //Add

        myMap = mutableMapOf("One" to 1, "Two" to 2)


        println(myMap)


        //Update

        myMap.put("One", 5)


        //Acceso

        println(myMap["One"])


        //Delete
        myMap.remove("Two")
        println(myMap)

    }


    fun loops(){


        //For

        val cars = arrayOf<String>("Mazda", "Susuki", "BMW", "Honda")

        for(x in cars)
            println(x)



        val cities = arrayOf<String>("GYE", "UIO", "CUE", "MAN")

        for(x in cities)
            println(x)



        //While

        //While

        var x = 0

        while (x < 10){

        println(x)
            x += 2

    }








}


    fun nullSafety(){

        var name = "Ayrton"


    }


    fun functions(x:Int, y:Int):Int{

        return (x + y)

    }







@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAndroidStudioTheme {
        Greeting("Android")
    }
}}