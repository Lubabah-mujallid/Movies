/*
Create an array of five empty strings
Ask the user to enter their top 5 movies
The user has to enter exactly 5 movies
Add each movie to the array by updating all strings in the array
Print each movie with a for loop*/

fun main(){
    var myArray = arrayOf("","","","","")
    println("Hello There, can I ask you about your top 5 movies? " +
            "I want to watch a movie but I don't know what.")
    for(i in myArray.indices){
        var movieNum = i+1
        println("what is movie #$movieNum")
        myArray[i] = readLine()!!
    }
    for(i in myArray.indices){
        val num = i+1
        println("Movie No.$num is: ${myArray[i]}")
    }

}
