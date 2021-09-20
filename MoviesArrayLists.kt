/*Create an ArrayList
Ask the user to enter their favorite movies
The user must enter at least 3 items
Add each item to the ArrayList
If the ArrayList has 3 or more items ask the user if they want to continue
If the user says yes, allow them to enter another movie
If the user says no, print all movies with a for loop*/
fun main() {
    val movieList = arrayListOf<String>()
    println("Hello There, can I ask you about your favorite movies? " +
                "I want to watch something, but I don't know what!!")
    var counter = 0
    while (true) {
        print("What is the movie's name? ")
            movieList.add(readLine()!!)
            counter++
        if (counter >= 3){
            print("Do you know any other amazing movies?")
            var answer = readLine()
            if(answer.equals("yes"))
                println("Great!! tel me, quick.")
            else
                break
        }
    }
    println("Thank you, now I know what to watch!")
    println("The movies are: $movieList")
}