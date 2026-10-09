# IF25-22017 — Pengembangan Aplikasi Mobile

Mata kuliah ini mempelajari pengembangan aplikasi mobile multiplatform menggunakan **Kotlin Multiplatform (KMP)** dan **Compose Multiplatform**. Mahasiswa belajar membuat aplikasi yang berjalan di Android dan iOS dengan satu codebase, termasuk integrasi dengan sistem cerdas (AI).

Kelas ini **tanpa UTS**. Pertemuan 1 sampai 10 adalah materi dengan latihan yang diobservasi setiap pertemuan. Pertemuan 11 sampai 16 adalah proyek kelompok yang dinilai lewat tes lisan, ditutup Demo Day di jadwal UAS.

## Identitas Mata Kuliah

| DATA | DESKRIPSI |
|---|---|
| Nama | Pengembangan Aplikasi Mobile |
| Kode | IF25-22017 |
| Rumpun | Rekayasa Perangkat Lunak dan Sistem Informasi |
| Bobot (Teori - Praktikum) SKS | 3 (3-0) SKS |
| Semester | Ganjil/Genap |
| Matakuliah Syarat | IF25-21012, IF25-21009 |
| Team Teaching | Muhammad Habib Algifari, S.Kom., M.T.I. |

## Capaian Pembelajaran

**CPL05** — Mampu menganalisis dan menerapkan konsep rekayasa perangkat lunak untuk pengembangan sistem cerdas secara profesional.

| CPMK | Deskripsi | CPL didukung |
|---|---|---|
| CPMK0501 | Mahasiswa mampu menerapkan konsep pemrograman untuk pengembangan perangkat lunak | CPL05 |
| CPMK0502 | Mahasiswa mampu menjelaskan konsep pemrograman untuk pengembangan perangkat lunak | CPL05 |
| CPMK0503 | Mahasiswa mampu menerapkan teknologi sistem cerdas dalam pengembangan perangkat lunak | CPL05 |

## Materi Pembelajaran / Pokok Bahasan

Intro KMP, Setup Environment, Hello World; Advanced Kotlin (Coroutines, Flow); Compose Multiplatform Basics; State Management (MVVM, ViewModel); Navigasi Antar Layar, Passing Data; Networking (Ktor Client, JSON); Local Data Persistence; Platform Specific Code; Sensor; Integrasi Sistem Cerdas (AI API); Testing dan Dependency Injection.

## Jadwal Pertemuan

Kolom **Minggu RPS** menunjukkan minggu RPS yang menjadi sumber setiap pertemuan. Karena tidak ada UTS, minggu RPS 9 sampai 11 dimajukan menjadi pertemuan 8 sampai 10.

### Bagian 1: Materi (Pertemuan 1–10)

| Pertemuan | Minggu RPS | CPMK | Topik | Asesmen | Bobot |
|---|---|---|---|---|---|
| 1 | 1 | CPMK0502 | Kontrak kuliah, kenalan dengan KMP, dan setup environment | Observasi: environment dan Hello World KMP | 4% |
| 2 | 2 | CPMK0501, CPMK0502 | Model data, Coroutines, dan Flow | Observasi: Coroutines dan Flow | 4% |
| 3 | 3 | CPMK0501 | Dasar Compose Multiplatform | Observasi: UI terstruktur dengan Compose | 4% |
| 4 | 4 | CPMK0501 | State dan MVVM | Observasi: MVVM pada aplikasi catatan | 4% |
| 5 | 5 | CPMK0501 | Navigasi antar layar dan passing data | Observasi: navigasi dengan passing data | 4% |
| 6 | 6 | CPMK0501 | Networking REST API dengan Ktor | Observasi: data REST API beserta keadaan memuat dan error | 4% |
| 7 | 7 | CPMK0501 | Penyimpanan lokal dan offline-first | Observasi: data lokal yang bertahan offline | 4% |
| 8 | 9 | CPMK0501 | Fitur khusus platform (expect/actual, permissions, Koin) | Observasi: fitur platform di Android dan iOS | 4% |
| 9 | 10 | CPMK0503 | Integrasi AI dengan Gemini | Observasi: fitur AI di aplikasi; tugas laporan proyek dibagikan | 4% |
| 10 | 11 | CPMK0502 | Testing, Dependency Injection, dan Debugging | Observasi: test dan DI | 4% |

### Bagian 2: Proyek Kelompok (Pertemuan 11–16)

| Pertemuan | Minggu RPS | CPMK | Topik | Asesmen | Bobot |
|---|---|---|---|---|---|
| 11 | 12 | CPMK0501, CPMK0502 | Sprint 1: perencanaan, arsitektur, dan CI | Formatif, menyiapkan tes lisan 1 | — |
| 12 | 12 | CPMK0501, CPMK0502 | Sprint 2: fitur utama dan code review | Tes lisan 1: perencanaan dan fitur utama | 10% |
| 13 | 13 | CPMK0501 | Fitur lanjutan dan performa | Tes lisan 2: fitur lanjutan | 5% |
| 14 | 14 | CPMK0501 | UI/UX, aksesibilitas, dan testing | Tes lisan 3: stabil dan terdokumentasi | 5% |
| 15 | 15 | CPMK0501, CPMK0502, CPMK0503 | Rilis, dokumentasi, dan persiapan demo | Formatif, gladi Demo Day | — |
| 16 | 15 (jadwal UAS) | CPMK0501, CPMK0502, CPMK0503 | **Demo Day** | Tes lisan final: demo, live code review, dan tanya jawab | 35% |

Setiap pertemuan 1–10 punya tiga bahan yang saling melengkapi: slide di `01 Slide/` untuk kelas, hands-on di `02 Hands-on/` untuk latihan yang diobservasi, dan modul di `03 Modul/` untuk belajar mandiri sebelum atau sesudah kelas.

Laporan hasil proyek (5%) dibagikan di pertemuan 9 dan dikumpulkan sebelum pertemuan 16.

Untuk mengikuti proyek kelompok, mahasiswa wajib menyelesaikan seluruh hands-on di `00 Kotlin Dasar/` (lihat [Struktur Repo](#00-kotlin-dasar-syarat-ikut-proyek)).

Proyek kelompok sudah dikerjakan sejak pertemuan 1 lewat checkpoint mingguan. Checkpoint tidak masuk nilai, tetapi menjadi bekal tes lisan.

## Penilaian

| Kriteria | CPMK0503 | CPMK0501 | CPMK0502 | Total Bobot |
|---|---|---|---|---|
| Observasi (Praktik), individu, pertemuan 1–10 | 4 | 26 | 10 | 40 |
| Laporan Hasil Proyek, kelompok | 5 | 0 | 0 | 5 |
| Tes Lisan (Tugas Kelompok), pertemuan 12–16 | 0 | 35 | 20 | 55 |
| **Total Bobot per CPMK** | **9** | **61** | **30** | **100** |

### Rincian tes lisan

| Asesmen | Pertemuan | Kriteria | CPMK | Bobot |
|---|---|---|---|---|
| Tes lisan 1 | 12 | Perencanaan dan repository (dinilai per anggota) | CPMK0502 | 5% |
| | | Fitur utama berfungsi | CPMK0501 | 5% |
| Tes lisan 2 | 13 | Fitur lanjutan terintegrasi | CPMK0501 | 5% |
| Tes lisan 3 | 14 | Aplikasi stabil dan terdokumentasi | CPMK0501 | 5% |
| Tes lisan final | 16 | Kelengkapan fitur | CPMK0501 | 8% |
| | | Kualitas kode | CPMK0501 | 6% |
| | | Kelancaran demo | CPMK0501 | 6% |
| | | Presentasi (dinilai per anggota) | CPMK0502 | 5% |
| | | Tanya jawab kode (dinilai per anggota) | CPMK0502 | 10% |
| Laporan hasil proyek | sebelum 16 | Desain prompt dan evaluasi keluaran AI | CPMK0503 | 5% |

Setiap kriteria dinilai dengan rubrik empat level: **Sangat baik** (85–100), **Baik** (70–84), **Cukup** (55–69), dan **Kurang** (di bawah 55). Anggota tanpa commit bermakna di bagian yang dinilai mendapat level Kurang pada kriteria kelompok. Rubrik lengkap ada di slide setiap pertemuan dan di dokumen RPS.

## Pustaka

**Utama:**

1. Dokumentasi KMP

**Pendukung:**

2. Panduan Proyek
3. Android Studio
4. Dokumentasi Kotlin
5. Dokumentasi API OpenAI/Gemini
6. Modul belajar Pertemuan 1–10 di `03 Modul/`

## Media Pembelajaran

- **Software:** Framework Kotlin Multiplatform, Android Studio, GitHub, YouTube, dan lain-lain
- **Hardware:** Mobile Device, Komputer Lab, dan Laptop

## Struktur Repo

```
.
├── 00 Kotlin Dasar/                        # Kotlin dasar (slide + hands-on), syarat ikut proyek
├── 01 Slide/                               # slide PDF pertemuan 1–16
├── 02 Hands-on/                            # proyek hands-on KMP pertemuan 1–10
├── 03 Modul/                               # modul belajar mandiri pertemuan 1–10
├── Kontrak Kuliah PAM IF25-22017.pdf
├── Rencana Pembelajaran Semester.pdf
└── README.md
```

### Dokumen di root

- `Kontrak Kuliah PAM IF25-22017.pdf` — kontrak kuliah, dibahas di bagian pembuka pertemuan 1.
- `Rencana Pembelajaran Semester.pdf` — RPS lengkap, sumber data capaian, bobot, dan indikator di atas.

### 00 Kotlin Dasar (syarat ikut proyek)

`00 Kotlin Dasar/` berisi 13 topik slide dan hands-on Kotlin dasar (Kotlin/JVM biasa, bukan KMP) untuk memperkuat fondasi Kotlin. Materi ini dikerjakan mandiri di luar jam kuliah. Slide di folder ini diambil dari materi kuliah Kotlin yang dikembangkan oleh JetBrains, sesuai keterangan *@kotlin | Developed by JetBrains* di setiap slide. Hands-on-nya disusun untuk mata kuliah ini.

**Seluruh hands-on Kotlin Dasar (13 topik × 3 latihan) wajib diselesaikan oleh mahasiswa yang ingin mengikuti proyek kelompok di pertemuan 11–16.** Hands-on ini tidak masuk perhitungan nilai, tetapi menjadi syarat ikut proyek. Ketentuan lengkapnya ada di [`00 Kotlin Dasar/README.md`](00%20Kotlin%20Dasar/README.md).

Topik yang dicakup:

`P1 - Introduction to Kotlin`, `P2 - Object-Oriented Programming`, `P3 - Generics`, `P4 - Collections and co.`, `P5 - Functional Programming`, `P6 - Parallel and Concurrent Programming`, `P7 - Asynchronous Programming in Kotlin`, `P8 - Exceptions`, `P9 - Testing`, `P10 - Build Systems`, `P11 - The Java Virtual Machine and the Kotlin Compiler`, `P12 - Reflection (JVM)`, `P13 - Backend Development Basics`.

Setiap topik punya slide `P{n} - {Topik}.pdf` dan folder `P{n} - {Topik} - Hands-on/` (modul `handson{n}-latihan` dan `handson{n}-solusi`). Solusinya juga di-gitignore.

### 01 Slide

Folder `01 Slide/` berisi slide PDF untuk ke-16 pertemuan:

| File | Pertemuan |
|---|---|
| `P1 Kenalan dengan KMP dan Siapkan Alat.pdf` | 1 |
| `P2 Model Data, Coroutines, dan Flow.pdf` | 2 |
| `P3 Dasar Compose Multiplatform.pdf` | 3 |
| `P4 State dan MVVM.pdf` | 4 |
| `P5 Navigasi Antar Layar.pdf` | 5 |
| `P6 Networking REST API dengan Ktor.pdf` | 6 |
| `P7 Penyimpanan Lokal dan Offline-first.pdf` | 7 |
| `P8 Fitur Khusus Platform.pdf` | 8 |
| `P9 Integrasi AI dengan Gemini.pdf` | 9 |
| `P10 Testing, Dependency Injection, dan Debugging.pdf` | 10 |
| `P11 Sprint 1 Perencanaan, Arsitektur, dan CI.pdf` | 11 |
| `P12 Sprint 2 Fitur Utama, Code Review, dan Tes Lisan 1.pdf` | 12 |
| `P13 Fitur Lanjutan, Performa, dan Tes Lisan 2.pdf` | 13 |
| `P14 UI-UX, Aksesibilitas, dan Tes Lisan 3.pdf` | 14 |
| `P15 Rilis dan dokumentasi.pdf` | 15 |
| `P16 Demo Day.pdf` | 16 |

Seluruh slide memakai aplikasi kelas yang sama, **LaporKampus**, sebagai contoh berjalan dari pertemuan ke pertemuan. Tampilan slide memakai template ciptaan [iwawiwi](https://github.com/iwawiwi).

### 02 Hands-on (Pertemuan 1–10)

Setiap folder `02 Hands-on/P{n} - {Topik} - Hands-on/` berisi proyek **Kotlin Multiplatform + Compose Multiplatform** nyata (modul `composeApp` dengan `commonMain`/`androidMain`/`iosMain`/`desktopMain`), dengan 3 latihan dan solusinya per pertemuan. Latihan inilah yang diobservasi untuk nilai observasi praktik.

| Folder | Pertemuan | Topik |
|---|---|---|
| `P1 - Pengenalan MK dan Setup Environment - Hands-on/` | 1 | Intro KMP, setup environment, expect/actual, Compose dasar |
| `P2 - Advanced Kotlin Coroutines Flow - Hands-on/` | 2 | Advanced Kotlin, Coroutines & Flow (proyek Kotlin/JVM biasa) |
| `P3 - Compose Multiplatform Basics - Hands-on/` | 3 | Layout, LazyColumn, custom component |
| `P4 - State Management MVVM - Hands-on/` | 4 | ViewModel, StateFlow, UDF |
| `P5 - Navigasi Antar Layar - Hands-on/` | 5 | NavHost, passing data, Bottom Navigation |
| `P6 - Networking REST API - Hands-on/` | 6 | Ktor Client, JSON, Repository Pattern |
| `P7 - Local Data Storage - Hands-on/` | 7 | SQLDelight, offline-first |
| `P8 - Platform Specific Features - Hands-on/` | 8 | expect/actual lanjutan, permissions, Koin DI |
| `P9 - Integrasi AI API - Hands-on/` | 9 | Integrasi Gemini, prompt, layar chat |
| `P10 - Testing dan DI - Hands-on/` | 10 | Unit test, test doubles, Koin DI |

Pertemuan 11 sampai 16 tidak punya hands-on materi baru, karena latihannya dikerjakan langsung di repository proyek kelompok.

Catatan:

- Proyek `P1, P3–P10` tidak menyertakan folder `iosApp/` (proyek Xcode). Lihat README masing-masing folder untuk cara menambahkannya via [kmp.jetbrains.com](https://kmp.jetbrains.com).
- Proyek belum di-build atau diverifikasi penuh, karena lingkungan pembuatannya tidak punya Android SDK atau Xcode. Lakukan Gradle sync di Android Studio sebelum dipakai di kelas.

**Solusi tidak ikut di-commit.** Setiap folder hands-on punya subfolder atau modul `solusi/` (atau `handson{n}-solusi/`) berisi jawaban lengkap. Folder ini di-`.gitignore` di tiap proyek, jadi mahasiswa yang clone repo hanya mendapat soal `latihan/`. Jawaban dipegang dan dibagikan terpisah oleh pengajar.

### 03 Modul (Pertemuan 1–10)

Folder `03 Modul/` berisi modul belajar mandiri untuk pertemuan 1 sampai 10. Isinya mengikuti slide, tetapi ditulis lebih pelan dan lebih lengkap supaya bisa dipelajari sendiri di rumah, termasuk oleh mahasiswa yang berhalangan hadir.

| File | Pertemuan | Hands-on yang dipakai |
|---|---|---|
| [`Modul 01 - Kenalan dengan KMP dan Siapkan Alat.pdf`](03%20Modul/Modul%2001%20-%20Kenalan%20dengan%20KMP%20dan%20Siapkan%20Alat.pdf) | 1 | `P1 - Pengenalan MK dan Setup Environment - Hands-on/` |
| [`Modul 02 - Model Data Coroutines dan Flow.pdf`](03%20Modul/Modul%2002%20-%20Model%20Data%20Coroutines%20dan%20Flow.pdf) | 2 | `P2 - Advanced Kotlin Coroutines Flow - Hands-on/` |
| [`Modul 03 - Dasar Compose Multiplatform.pdf`](03%20Modul/Modul%2003%20-%20Dasar%20Compose%20Multiplatform.pdf) | 3 | `P3 - Compose Multiplatform Basics - Hands-on/` |
| [`Modul 04 - State dan MVVM.pdf`](03%20Modul/Modul%2004%20-%20State%20dan%20MVVM.pdf) | 4 | `P4 - State Management MVVM - Hands-on/` |
| [`Modul 05 - Navigasi Antar Layar.pdf`](03%20Modul/Modul%2005%20-%20Navigasi%20Antar%20Layar.pdf) | 5 | `P5 - Navigasi Antar Layar - Hands-on/` |
| [`Modul 06 - Networking REST API dengan Ktor.pdf`](03%20Modul/Modul%2006%20-%20Networking%20REST%20API%20dengan%20Ktor.pdf) | 6 | `P6 - Networking REST API - Hands-on/` |
| [`Modul 07 - Penyimpanan Lokal dan Offline-first.pdf`](03%20Modul/Modul%2007%20-%20Penyimpanan%20Lokal%20dan%20Offline-first.pdf) | 7 | `P7 - Local Data Storage - Hands-on/` |
| [`Modul 08 - Fitur Khusus Platform.pdf`](03%20Modul/Modul%2008%20-%20Fitur%20Khusus%20Platform.pdf) | 8 | `P8 - Platform Specific Features - Hands-on/` |
| [`Modul 09 - Integrasi AI dengan Gemini.pdf`](03%20Modul/Modul%2009%20-%20Integrasi%20AI%20dengan%20Gemini.pdf) | 9 | `P9 - Integrasi AI API - Hands-on/` |
| [`Modul 10 - Testing Dependency Injection dan Debugging.pdf`](03%20Modul/Modul%2010%20-%20Testing%20Dependency%20Injection%20dan%20Debugging.pdf) | 10 | `P10 - Testing dan DI - Hands-on/` |

Setiap modul disusun dengan urutan yang sama, jadi cukup dibaca dari awal sampai akhir:

1. **Tentang modul ini**: capaian, CPMK, dan yang perlu disiapkan.
2. **Masalah pembuka**: masalah LaporKampus yang dijawab di pertemuan itu.
3. **Langkah 1 sampai 10**: konsep dibahas berurutan, masing-masing dengan contoh kode yang bisa dijalankan, perumpamaan sehari-hari, serta kotak **Tebak dulu** dan **Jawaban**.
4. **Latihan mandiri**: petunjuk untuk setiap latihan di `02 Hands-on/`, rubrik observasi, dan tabel error yang sering muncul.
5. **Bawa ke proyekmu**: penerapan di proyek kelompok dan checkpoint mingguan.
6. **Rangkuman, Cek pemahaman** dengan kunci jawaban, dan **Bacaan lanjut**.

Cara memakainya: baca langkah-langkahnya sebelum kelas, kerjakan latihan di `02 Hands-on/` dengan petunjuk dari bagian Latihan mandiri, lalu jawab Cek pemahaman tanpa melihat modul untuk menguji diri sendiri. Contoh kode di modul adalah bagian dari aplikasi LaporKampus, jadi untuk proyek kelompok sesuaikan nama kelas dan datanya dengan tema masing-masing.

## Kredit

- **Template slide**: template yang dipakai di `01 Slide/` dan tema modul di `03 Modul/` adalah ciptaan [iwawiwi](https://github.com/iwawiwi).
- **Slide Kotlin Dasar**: slide di `00 Kotlin Dasar/` diambil dari materi kuliah Kotlin yang dikembangkan oleh [JetBrains](https://kotlinlang.org), pembuat bahasa Kotlin. Hak atas materi tersebut tetap milik JetBrains.
- **Dokumentasi resmi**: contoh dan penjelasan di slide, modul, dan hands-on banyak merujuk dokumentasi Kotlin Multiplatform, Compose Multiplatform, Ktor, SQLDelight, Koin, Android Developers, dan Gemini API. Tautannya ada di bagian Bacaan lanjut setiap modul.

## Penyusunan materi dengan bantuan AI

Materi berbasis proyek di repo ini, yaitu slide pertemuan 1–16, modul belajar, hands-on, rubrik, dan contoh aplikasi LaporKampus, disusun dengan bantuan AI (Claude dari Anthropic). AI dipakai untuk menyusun draf penjelasan, contoh kode, perumpamaan, soal tebakan, dan rubrik berdasarkan RPS mata kuliah ini.

Seluruh hasilnya ditinjau, disesuaikan, dan menjadi tanggung jawab pengajar. Capaian, bobot, dan indikator penilaian tetap mengikuti RPS. Meski begitu, sebagian kode belum diuji di semua platform. Kalau menemukan kode yang tidak berjalan atau penjelasan yang keliru, laporkan lewat Issues di repo ini atau sampaikan di kelas.

Ketentuan yang sama berlaku untuk mahasiswa: bantuan AI boleh dipakai di latihan dan proyek, selama kalian memahami setiap baris yang dikumpulkan dan bisa menjelaskannya saat observasi maupun tes lisan.
