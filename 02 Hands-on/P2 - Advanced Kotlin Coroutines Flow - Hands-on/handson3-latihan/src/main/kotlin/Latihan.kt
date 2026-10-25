import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Hands-on 3: StateFlow untuk Counter
// Tugas: Implementasikan counter sederhana menggunakan StateFlow.
// Counter harus bisa increment, decrement, dan reset.
//
// CATATAN: File ini belum bisa dijalankan sampai kamu melengkapi
// semua TODO di bawah — itu normal untuk latihan ini!

class CounterManager {
    // TODO: Buat MutableStateFlow dengan nilai awal 0
     private val _count = MutableStateFlow(0)
    // TODO: Expose sebagai StateFlow (read-only)
     val count: StateFlow<Int> = _count.asStateFlow()

    fun increment() {
        // TODO: Tambah nilai count
        _count.value++
    }

    fun decrement() {
        // TODO: Kurangi nilai count (minimum 0)
        if (_count.value > 0){
            _count.value--
        }
    }

    fun reset() {
        // TODO: Reset ke 0
        _count.value = 0
    }
}

fun main() = runBlocking {
    val counter = CounterManager()

    // Collect di background
    val job = launch {
        counter.count.collect { println("Count: $it") }
    }

    delay(100)
    counter.increment() // Count: 1
    delay(100)
    counter.increment() // Count: 2
    delay(100)
    counter.decrement() // Count: 1
    delay(100)
    counter.reset()     // Count: 0
    delay(100)

    job.cancel()
}
