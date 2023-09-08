fun main(args: Array<String>) {
    // 1 номер
    val age1 = 42
    val age2 = 21
//////
//2 номер
    val age1 = 42
    val age2 = 21
    val avg1: Double = (42+21)/2
// Должен быть тип Double
//////
// 3 номер
    val age1 = 42
    val age2 = 21
    val avg1: Double = (42+21)/2.toDouble()
// Явно указан тип Double
///////
//4 номер
    val firstName: String = "Дана"
    val lastName: String = "Киздермишова"
//////
//5 номер
    val firstName: String = "Дана"
    val lastName: String = "Киздермишова"
    val fullName: String = firstName + " " + lastName
/////
//6 номер
    val firstName: String = "Дана"
    val lastName: String = "Киздермишова"
    val fullName: String = firstName + " " + lastName
    val myDetails = "Привет, меня зовут $fullName"
/////
// 7 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
/////
// 8 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
    val month = data.first
    val day = data.second
    val year = data.third
/////
// 9 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
    val month = data.first
    val day = data.second
    val year = data.third
    println(month)
    println()
    println(year)
/////
//10 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
    val month = data.first + 5
    val day = data.second
    val year = data.third
    val dataTwo = Pair(month, year)
/////
}