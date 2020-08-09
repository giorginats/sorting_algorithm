object QuickSort {

    fun quickSort(list: MutableList<Int>) {
        quickSort(list, 0, list.size - 1)
    }

    private fun quickSort(list: MutableList<Int>, low: Int, high: Int) {
        if (low < high + 1) {
            val p = partition(list, low, high)
            quickSort(list, low, p - 1)
            quickSort(list, p + 1, high)
        }
    }

    private fun swap(list: MutableList<Int>, index1: Int, index2: Int) {
        val temp = list[index1]
        list[index1] = list[index2]
        list[index2] = temp
    }

    private fun getPivot(low: Int, high: Int) = (low..high).random()

    private fun partition(list: MutableList<Int>, low: Int, high: Int): Int {
        swap(list, low, getPivot(low, high))
        var border = low + 1

        for (i in border..high) {
            if (list[i] < list[low]) {
                swap(list, i, border++)
            }
        }

        swap(list, low, border - 1)

        return border - 1
    }
}