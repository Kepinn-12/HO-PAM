import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// Hands-on 1: Unit Test Dasar (pola Arrange-Act-Assert)
// Tugas: Lengkapi ketiga test di bawah mengikuti pola AAA:
//   Arrange -> siapkan data/objek yang dibutuhkan
//   Act     -> panggil method yang diuji
//   Assert  -> verifikasi hasilnya dengan assertEquals(expected, actual)
//
// Setiap test masih memanggil fail(...) supaya kelihatan MERAH (gagal) sampai
// kamu selesaikan TODO-nya -- hapus baris fail(...) setelah assert kamu tulis.

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @DisplayName("Penjumlahan dua bilangan positif")
    fun testAdd() {
        // TODO 1 (Arrange): siapkan dua bilangan, misalnya a = 2 dan b = 3
        val a  : Int = 2 
        val b : Int = 3
    
        // TODO 2 (Act): panggil calculator.add(a, b) dan simpan hasilnya
        val hasil = calculator.add(a,b)

        // TODO 3 (Assert): assertEquals(5, hasil)
        assertEquals(5, hasil)

        // fail("TODO: lengkapi testAdd()")
    }

    @Test
    @DisplayName("Pengurangan yang menghasilkan angka negatif")
    fun testSubtractNegativeResult() {
        // TODO: lakukan Arrange-Act-Assert untuk memverifikasi 3 - 5 = -2
        val a : Int = 3
        val b : Int = 5

        val hasil = calculator.subtract(a, b)

        assertEquals(-2, hasil)
    }

    @Test
    @DisplayName("Pembagian dua bilangan bulat")
    fun testDivide() {
        // TODO: lakukan Arrange-Act-Assert untuk memverifikasi 10 / 2 = 5
        
        val a : Int  = 10
        val b : Int  = 2

        val hasil = calculator.divide(a,b)

        assertEquals(5, hasil)
    }
}
