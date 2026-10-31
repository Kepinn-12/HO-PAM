package com.itera.pam.p4.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// Latihan 3: Todo App dengan ViewModel — implementasi MVVM pattern (slide P4 hal. 31)
//
// Checklist:
// [ ] Data class Todo
// [ ] TodoUiState dengan list
// [ ] TodoViewModel dengan StateFlow
// [ ] Add todo function
// [ ] Toggle done function
// [ ] TextField untuk input
// [ ] LazyColumn untuk list
// [ ] Checkbox untuk done

// 1. Data class
data class Todo(val id: Int, val text: String, val done: Boolean)

data class TodoUiState(
    val todos: List<Todo> = emptyList(),
    val input: String = ""
)

// 2. ViewModel
class TodoViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(TodoUiState())
    val uiState: StateFlow<TodoUiState> = _uiState.asStateFlow()

    fun onInputChange(text: String) {
        // TODO: update _uiState.input dengan `text`, gunakan _uiState.update { it.copy(input = text) }
        _uiState.update { it.copy(input = text) }
    }

    fun addTodo() {
        _uiState.update{ state ->
            if (state.input.isBlank()){
                state
            }else{
                state.copy(
                    todos = state.todos + Todo(
                        id = state.todos.size,
                        text = state.todos.size,
                        text = state.input.trim(),
                        done = false
                    ),
                    input = ""
                )
            }
        }
    }

    fun toggleTodo(id: Int) {
        _uiState.update{state ->
            state.copy(
                todos = state.todos.map{todo ->
                    if(todo.id == id) todo.copy(done = !todo.done) else todo
                }
            )
        }

    }
}

// 3. Compose UI
@Composable
fun Handson3Screen(viewModel: TodoViewModel = viewModel { TodoViewModel() }) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Latihan 3: Todo App dengan ViewModel")
        Text("Belum diimplementasikan — lengkapi TODO di TodoViewModel dan UI di bawah ini")

        OutlinedTextField(
            value = uiState.input,
            onValueChange = viewModel :: onInputChange,
            label = {Text("Todo baru")},
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = viewModel :: addTodo{
                Text("Tambah")
            }
        )

        LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)){
            items(uiState.todos, key = {it.id }) {todo ->
                row(verticalAlignment = Alignment.CenterVertically){
                    Checkbox(
                        checked = todo.done,
                        onCheckedChange = { viewModel.toggleTodo(todo.id)}
                    )
                    Spacer(modifier = Modifier.witdh(8.dp))
                    Text(
                        text = todo.text,
                        textDecoration = if(todo.done) TextDecoration.lineThrough
                    )
                }
            }
        }
    }
}
