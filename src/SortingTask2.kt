fun main() {
    val A1 = listOf(5, 10, 17, 23, 26, 26)
    val A2 = listOf(7, 13, 16)

    sortKotlinWay(A1, A2)
    quickSortWay(A1, A2)

}

private fun sortKotlinWay(list1: List<Int>, list2: List<Int>) {
    val list = mutableListOf<Int>()
    list.addAll(list1)
    list.addAll(list2)

    list.sort()
    println("(kotlin way) $list")
}

private fun quickSortWay(list1: List<Int>, list2: List<Int>) {
    val list = mutableListOf<Int>()
    list.addAll(list1)
    list.addAll(list2)

    println("before sorting (quick sort) $list")
    QuickSort.quickSort(list)
    println("after sorting (quick sort) $list")
}