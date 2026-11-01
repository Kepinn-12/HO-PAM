package com.itera.pam.p6.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.call.body
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay


// Hands-on 1: Ktor Client Dasar & GET Request
// Endpoint yang dipakai di seluruh hands-on Pertemuan 6:
// https://jsonplaceholder.typicode.com/users (fake REST API gratis untuk belajar,
// mengembalikan array JSON berisi data user).

@Serializable
data class RemoteUser(
    val id: Int,
    val name: String,
    val email: String
)
         val client = HttpClient {
             install(ContentNegotiation) {
                 json(Json { ignoreUnknownKeys = true })
             }
         }

suspend fun fetchUsers(): List<RemoteUser> {
    delay(2000)
    return client.get("https://jsonplaceholder.typicode.com/users").body()
}

@Composable
fun Handson1Screen() {
    var users by remember { mutableStateOf<List<RemoteUser>>(emptyList()) }
    var error by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        try {
            users = fetchUsers()
        } catch (e: Exception) {
            error = e.message
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 1: Ktor Client Dasar & GET Request")
        when {
            error != null -> Text("Error: $error")
            users.isEmpty() -> Text("Memuat data...")
            else -> LazyColumn {
                items(users) { user ->
                    Text("${user.id}. ${user.name} (${user.email})")
                }
            }
        }
    }
}