package com.itera.pam.p5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itera.pam.p5.latihan.Handson1Screen
import com.itera.pam.p5.latihan.Handson2Screen
import com.itera.pam.p5.latihan.Handson3Screen

// Menu luar sederhana berbasis state (sama seperti hands-on pertemuan lain)
// hanya untuk berpindah antar LATIHAN. Di DALAM tiap latihan, kita pakai
// Navigation Component sungguhan (NavHost/NavController) — itulah topik
// pertemuan ini.
private enum class Screen(val label: String) {
    Menu("Menu"),
    Latihan1("Latihan 1 - NavHost Dasar"),
    Latihan2("Latihan 2 - Passing Data"),
    Latihan3("Latihan 3 - Bottom Navigation"),
}

@Composable
fun App() {
    MaterialTheme {
        var screen by remember { mutableStateOf(Screen.Menu) }

        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .safeDrawingPadding()
                    .padding(16.dp)
            ) {
                if (screen != Screen.Menu) {
                    Button(onClick = { screen = Screen.Menu }) { Text("< Kembali ke Menu") }
                }
                when (screen) {
                    Screen.Menu -> {
                        Text("Hands-on Pertemuan 5")
                        Text("Navigasi Antar Layar, Passing Data")
                        Screen.entries.filter { it != Screen.Menu }.forEach { s ->
                            Button(onClick = { screen = s }) { Text(s.label) }
                        }
                    }

                    Screen.Latihan1 -> Handson1Screen()
                    Screen.Latihan2 -> Handson2Screen()
                    Screen.Latihan3 -> Handson3Screen()
                }
            }
        }
    }
}
