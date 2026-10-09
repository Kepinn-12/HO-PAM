# Kotlin Dasar — Syarat Mengikuti Proyek

Folder ini berisi 13 topik Kotlin dasar (Kotlin/JVM biasa, bukan KMP) untuk memperkuat fondasi Kotlin sebelum dan selama materi inti Kotlin Multiplatform. Setiap topik terdiri dari slide PDF dan satu proyek hands-on berisi 3 latihan.

## Wajib Dikerjakan

> **Seluruh hands-on di folder ini wajib diselesaikan oleh setiap mahasiswa yang ingin mengikuti proyek kelompok pengembangan aplikasi mobile di akhir kuliah (pertemuan 11–16).**

Ketentuannya:

- **Semua latihan wajib selesai.** Ada 13 hands-on × 3 latihan = **39 latihan**. Tidak ada latihan yang boleh dilewati.
- **Dikerjakan secara individu.** Setiap mahasiswa mengerjakan dan memahami kodenya sendiri, walaupun proyek nantinya dikerjakan berkelompok.
- **Latihan dianggap selesai** jika semua `TODO` di `Latihan.kt` sudah dilengkapi, modul bisa di-compile, dan program berjalan dengan keluaran yang benar (untuk P9, semua test lulus).
- **Syarat, bukan komponen nilai.** Hands-on Kotlin Dasar tidak masuk perhitungan nilai akhir, tetapi mahasiswa yang belum menyelesaikannya **tidak dapat mengikuti proyek kelompok**. Proyek kelompok dan tes lisannya bernilai 60% dari nilai akhir (tes lisan 55% dan laporan proyek 5%).
- **Batas waktu dan cara pemeriksaan** diumumkan oleh pengajar.

Materi ini dikerjakan mandiri di luar jam kuliah. Fondasinya dipakai langsung di materi inti: coroutines (P7) di pertemuan 2, sealed class dan data class (P2) untuk state di pertemuan 4, testing (P9) di pertemuan 10, dan seterusnya.

## Daftar Hands-on

| Topik | Slide | Latihan 1 | Latihan 2 | Latihan 3 |
|---|---|---|---|---|
| P1 — Introduction to Kotlin | `P1 - Introduction to Kotlin.pdf` | Variabel, Fungsi & String Template | Control Flow dengan `when` Expression | Loops, Ranges & Null Safety |
| P2 — Object-Oriented Programming | `P2 - Object-Oriented Programming.pdf` | Class & Inheritance | Interface & Data Class | Sealed Class untuk State |
| P3 — Generics | `P3 - Generics.pdf` | Generic Class `Box<T>` | Bounded Type Parameter | Variance (`out`) |
| P4 — Collections and co. | `P4 - Collections and co..pdf` | Transformasi Collection | Grouping & Aggregation | Sequence vs List (Lazy Evaluation) |
| P5 — Functional Programming | `P5 - Functional Programming.pdf` | Higher-Order Function | Lambda & Function Reference | Closure (Counter Factory) |
| P6 — Parallel and Concurrent Programming | `P6 - Parallel and Concurrent Programming.pdf` | Race Condition | ExecutorService & Future | Producer-Consumer dengan BlockingQueue |
| P7 — Asynchronous Programming in Kotlin | `P7 - Asynchronous Programming in Kotlin.pdf` | Suspend Function Dasar | `launch` vs `async` | Structured Concurrency & Cancellation |
| P8 — Exceptions | `P8 - Exceptions.pdf` | Try-Catch-Finally Dasar | Custom Exception & Exception Hierarchy | try-expression, `require()`, `error()`, multi-catch |
| P9 — Testing | `P9 - Testing.pdf` | Unit Test Dasar (Pola AAA) | Testing Exception | Test Lifecycle & Setup |
| P10 — Build Systems | `P10 - Build Systems.pdf` | Resource & Packaging | Custom Gradle Task | Dependency Declaration |
| P11 — The JVM and the Kotlin Compiler | `P11 - The Java Virtual Machine and the Kotlin Compiler.pdf` | Inline Function & Reified Generics | Tailrec Optimization | `companion object` & `@JvmStatic` |
| P12 — Reflection (JVM) | `P12 - Reflection (JVM).pdf` | Inspeksi Kelas dengan KClass | Baca Nilai Property Dinamis | Custom Annotation + Reflection Validator |
| P13 — Backend Development Basics | `P13 - Backend Development Basics.pdf` | HTTP Server Sederhana | Routing & JSON Sederhana | Request Handling & Status Code |

Folder hands-on tiap topik bernama `P{n} - {Topik} - Hands-on/`. Detail soal, capaian pembelajaran, dan troubleshooting ada di README masing-masing folder.

## Cara Mengerjakan

1. Baca slide topiknya terlebih dahulu.
2. Buka folder `P{n} - {Topik} - Hands-on/` di Android Studio atau IntelliJ IDEA (`File > Open`) sebagai proyek Gradle terpisah, lalu tunggu Gradle sync selesai.
3. Kerjakan `Latihan.kt` di modul `handson1-latihan`, `handson2-latihan`, dan `handson3-latihan`. Lengkapi setiap bagian `TODO`.
4. Jalankan `fun main()` (atau test, untuk P9) dan pastikan keluarannya sesuai instruksi.

Setiap latihan adalah modul Gradle terpisah, jadi latihan yang belum selesai tidak mengganggu latihan lain. Beberapa latihan memang **sengaja tidak bisa di-compile** sebelum `TODO`-nya dilengkapi. Itu bagian dari latihan.

**Solusi tidak ikut di-commit.** Modul `handson{n}-solusi/` di-`.gitignore` di setiap proyek, jadi repo yang kamu clone hanya berisi soal latihan.
