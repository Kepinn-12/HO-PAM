package com.itera.pam.p6.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

// Hands-on 2: Repository Pattern & Loading State
// Bungkus fetchUsers() (dari Handson1KtorClient.kt) di balik sebuah Repository,
// lalu buat state holder sederhana yang merepresentasikan status pengambilan
// data: Loading / Success / Error.
//
// Catatan desain: state holder ini sengaja berupa class biasa (bukan
// androidx.lifecycle.ViewModel) supaya hands-on ini tetap fokus ke konsep
// networking/repository — pola ViewModel yang lebih lengkap akan dipelajari
// di Pertemuan 4 (State Management MVVM).

class UserRepository {
    suspend fun getUsers(): List<RemoteUser> = fetchUsers()
}

sealed class UiState {
    data object Loading : UiState()
    data class Success(val users: List<RemoteUser>) : UiState()
    data class Error(val message: String) : UiState()
}

class UserListStateHolder(
    private val repository: UserRepository = UserRepository()
) {
    private val _state = MutableStateFlow<UiState>(UiState.Loading)
    val state: StateFlow<UiState> = _state.asStateFlow()

    suspend fun load() {

        _state.value = UiState.Loading
        try {
            _state.value = UiState.Success(repository.getUsers())
        } catch (e : Exception){
                _state.value = UiState.Error(e.message ?: "Terjadi Kesalahan")
        }

    }
}

@Composable
fun Handson2Screen() {
    val holder = remember { UserListStateHolder() }
    val state by holder.state.collectAsState()

    LaunchedEffect(Unit) {
        holder.load()
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 2: Repository Pattern & Loading State")

        when (val s = state) {
            is UiState.Loading -> Text("Memuat data...")
            is UiState.Error -> Text("Error: ${s.message}")
            is UiState.Success -> LazyColumn {
                items(s.users) { user ->
                    Text("${user.id}. ${user.name} (${user.email})")
                }
            }
        }
    }
}
