//For Loop
fun main() {
    //printing out characters in a string
    var languages = arrayOf("Kishwahili", "Luganda", "Kinyarwanda", "Zulu")
    for (language in languages)
    //println(language)
        for (char in language)
            println(char)

    num()
    oddNums()
    multiples()
}

//Arrange
fun num() {
    for (num in 1..10) {
        println(num)
    }
}

//Write a function that prints out the squares
//of all the odd numbers between 1 and 20
fun oddNums() {
    for (num in 1..20) {
        if (num % 2 != 0) //means is not equal to 0{
            println(num * num)
    }
}

//Create a function that prints out multiples of 6 and 8
//between 1 and 1000. For multiples of both 6 and 8
//it should print out "Bingo!"
fun multiples() {
    for (num in 1..1000) {
        if (num % 6 == 0 || num % 8 == 0) {
            println(num)
            if (num % 6 == 0 && num % 8 == 0)
                println("Bingo")
        }
    }
}
