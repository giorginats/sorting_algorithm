fun main() {
    val numberList = listOf(4, 11, 10, 18, 27, 21)

    val index = findBiggestNumbersIndex(numberList)
    println("biggest numbers index is $index")
}

fun findBiggestNumbersIndex(list : List<Int>): Int{
    var number = 0
    var index = 0

    for(i in list.indices){
        val number2 = list[i]

        if(number < number2){
            number = list[i]
            index = i
        }
    }

    return index
}
