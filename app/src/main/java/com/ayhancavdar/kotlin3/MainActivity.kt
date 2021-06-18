package com.ayhancavdar.kotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.println
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate got executed")
        test()
        anotherFunc()
        mySum(15,36)

       var y= myMultiply(9,37)
        println(y)

        var homer = Simpson(50,"Homer Simpson", "Nuclear engineer");
        var bart = Simpson(10,"Bart Simpson", "Student")
        println(homer.age)
        homer.hairColor="yellow"
        println(homer.hairColor)
        bart.changeHairColorToBlack()
        println(bart.hairColor)

    }
    fun test(){
        println("test function got executed")
    }
    fun anotherFunc(){
        test()
    }
    fun mySum( a: Int, b:Int){
        println(a+b)

    }
    fun myMultiply(a:Int, b:Int) : Int{
        return a*b
    }
    fun newFunction(view: View){
        println("button is clicked")
    }

    //Nullability
    var myString = "Ayhan"
    lateinit var myOtherString : String

    











}