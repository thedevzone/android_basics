package com.basicrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.basicrecyclerview.adapter.DummyAdapter
import com.basicrecyclerview.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<User>().apply {
        add(User(R.drawable.profile,"John Doe"))
        add(User(R.drawable.profile,"Mary Kom"))
        add(User(R.drawable.profile,"Jim Carter"))
        add(User(R.drawable.profile,"Sohan Khan"))
        add(User(R.drawable.profile,"Star Lord"))
        add(User(R.drawable.profile,"Robert Jr"))
        add(User(R.drawable.profile,"Thor Thunder"))
        add(User(R.drawable.profile,"Jim Jr"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = DummyAdapter(list)
        }
    }
}