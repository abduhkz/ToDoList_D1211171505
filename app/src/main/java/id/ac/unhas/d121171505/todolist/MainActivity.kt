package id.ac.unhas.d121171505.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private RecyclerView recyclerView
    private FloatingActionButton fab

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        linearLayoutManager = LinearLayoutManager(context)
        this.recyclerView.layoutManager = linearLayoutManager

        fab = findViewById(R.id.fab)
        fab.setOnClickListener{
           startActivities(MainActivity.this, BuatActivity.class)
        }
    }
}
