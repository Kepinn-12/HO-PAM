// Hands-on 3: Closure â Counter Factory
// Tugas: Implementasikan `makeCounter()` yang mengembalikan sebuah fungsi
// closure. Setiap kali closure tersebut dipanggil, ia harus mengembalikan
// angka berikutnya (1, 2, 3, ...) dengan MENGINGAT state count-nya sendiri
// di luar scope fungsi `makeCounter`.
//
// CATATAN: File ini SENGAJA belum bisa di-compile sampai kamu melengkapi
// semua TODO di bawah â itu normal untuk latihan ini!

fun makeCounter(): () -> Int {
    var count : Int = 0
    return {
        count += 1
        count
    }
    
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

    println(counterA()) // 1
    println(counterA()) // 2
    println(counterA()) // 3

    println(counterB()) // 1 
    println(counterB()) // 2
}
