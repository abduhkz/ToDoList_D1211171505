package id.ac.unhas.d121171505.todolist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.ac.unhas.d121171505.todolist.database.Repository
import id.ac.unhas.d121171505.todolist.database.Todo

class ViewModel(application: Application): AndroidViewModel(application) {
    private var todoRepository = Repository(application)
    private var todos: LiveData<List<Todo>>? = todoRepository.getTodos()


    fun getTodos(): LiveData<List<Todo>>? {
        return todos
    }

    fun insertTodo(todo: Todo) {
        todoRepository.insert(todo)
    }

    fun deleteTodo(todo: Todo) {
        todoRepository.delete(todo)
    }

    fun updateTodo(todo: Todo) {
        todoRepository.update(todo)
    }
}