package id.ac.unhas.d121171505.todolist.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class ToDoList(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int? = null,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "note")
    var note: String? = null,

    @ColumnInfo(name = "date_created")
    var dateCreated: String,

    @ColumnInfo(name = "date_updated")
    var dateUpdated: String,

    @ColumnInfo(name = "due_date")
    var dueDate: String,

    @ColumnInfo(name = "due_time")
    var dueTime: String,

    @ColumnInfo(name = "remind_me")
    var remindMe: Boolean = true,

    @ColumnInfo(name = "remind_time")
    var remindTime: Int = 0
)