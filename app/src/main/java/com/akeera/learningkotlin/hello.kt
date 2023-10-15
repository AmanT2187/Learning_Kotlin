package com.akeera.learningkotlin

import java.util.Scanner

fun main(){
   var s1 =  Scanner(System.`in`)

    println("Enter 1 number")
     var n1 = s1.nextInt()

    println("Enter 2 number")
    var n2 = s1.nextInt()

    var div = n1 / n2
    var rem = n1 %n2
     println("div = $div and rem = $rem")


}