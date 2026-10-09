// Hands-on 2: Bounded Type Parameter
// Tugas: Buat fungsi generik findMax yang mencari nilai terbesar dari sebuah
// List<T>, dengan syarat T harus bisa dibandingkan (Comparable<T>).
// Ini mirip alasan quickSort butuh constraint T : Comparable<T> di slide.

fun <T : Comparable<T>> findMax(items: List<T>): T {
    if (items.isEmpty()){
        throw IllegalArgumentException("List tidak boleh kosong")
    }
    var max = items[0]
    for (item in items){
        if(item.compareTo(max) > 0){
            max = item
        }
    }
    
    return max
}

fun main() {
    println(findMax(listOf(3, 7, 2, 9, 4)))          // 9
    println(findMax(listOf(1.5, 2.8, 0.3)))        // 2.8
    println(findMax(listOf("apel", "jeruk", "duku"))) // "jeruk" (alfabetis)
    println(findMax(listOf("", "Kevin", "Budi", "Narzo")))
}
