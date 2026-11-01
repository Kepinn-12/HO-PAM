package com.itera.pam.p6.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.foundation.lazy.items
import kotlinx.coroutines.launch
import androidx.compose.material3.Button



// Hands-on 3: Tampilkan Data di Compose dengan Loading/Error UI
// Tugas: pakai UserListStateHolder (dari Handson2Repository.kt) untuk
// menampilkan:
// - CircularProgressIndicator() selagi UiState.Loading
// - LazyColumn berisi nama & email user selagi UiState.Success
// - Pesan error + tombol "Coba Lagi" (yang memanggil ulang load()) selagi
//   UiState.Error
//
// CATATAN: fungsi ini sengaja belum menampilkan apa-apa selain placeholder —
// lengkapi semua TODO di bawah supaya UI-nya berfungsi.

@Composable
fun Handson3Screen() {

    val holder = remember { UserListStateHolder() }
    val state by holder.state.collectAsState()
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit){
        holder.load()
    }


    when (val s = state){
        is UiState.Loading -> CircularProgressIndicator()
        is UiState.Success -> LazyColumn{
            items (s.users){ user ->
                Text("${user.id}. ${user.name} (${user.email})")}
        }
        is UiState.Error -> Column {
            Text(
                s.message,
            )
            Button(onClick = { scope.launch { holder.load() } }) {
                Text("Coba Lagi")
            }
        }
    }

}
