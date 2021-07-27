package com.basicrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.basicrecyclerview.adapter.DummyAdapter
import com.basicrecyclerview.model.Dummy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<Dummy>().apply {
        add(Dummy(R.drawable.profile,"John Doe"))
        add(Dummy(R.drawable.profile,"Mary Kom"))
        add(Dummy(R.drawable.profile,"Jim Carter"))
        add(Dummy(R.drawable.profile,"Sohan Khan"))
        add(Dummy(R.drawable.profile,"Star Lord"))
        add(Dummy(R.drawable.profile,"Robert Jr"))
        add(Dummy(R.drawable.profile,"Thor Thunder"))
        add(Dummy(R.drawable.profile,"Jim Jr"))
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