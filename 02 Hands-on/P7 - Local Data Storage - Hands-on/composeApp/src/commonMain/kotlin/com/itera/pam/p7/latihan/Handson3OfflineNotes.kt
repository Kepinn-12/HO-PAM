
package com.itera.pam.p7.latihan

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itera.pam.p7.db.AppDatabase

// Hands-on 3: Offline-First — Tampilkan & Hapus Catatan

@Composable
fun Handson3Screen(database: AppDatabase) {

    // Membuat Repository
    val repository = remember {
        CatatanRepository(database)
    }

    // Mengambil data dari Flow sebagai Compose State
    val catatanList by repository.getAll()
        .collectAsState(initial = emptyList())

    // State input
    var judul by remember { mutableStateOf("") }
    var isi by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text("Hands-on 3: Offline-First")

        Spacer(modifier = Modifier.height(12.dp))

        // Input judul
        OutlinedTextField(
            value = judul,
            onValueChange = { judul = it },
            label = { Text("Judul") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Input isi catatan
        OutlinedTextField(
            value = isi,
            onValueChange = { isi = it },
            label = { Text("Isi Catatan") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Tombol tambah
        Button(
            onClick = {
                if (judul.isNotBlank() && isi.isNotBlank()) {
                    repository.tambah(judul, isi)
                    judul = ""
                    isi = ""
                }
            }
        ) {
            Text("Tambah")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text("Daftar Catatan")

        Text("Jumlah catatan: ${catatanList.size}")

        Spacer(modifier = Modifier.height(8.dp))

        // Menampilkan daftar catatan
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(catatanList) { catatan ->

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {

                    Text("Judul: ${catatan.judul}")

                    Text("Isi: ${catatan.isi}")

                    Button(
                        onClick = {
                            repository.hapus(catatan.id)
                        }
                    ) {
                        Text("Hapus")
                    }

                    HorizontalDivider()
                }
            }
        }
    }
}
