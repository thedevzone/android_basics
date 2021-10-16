package com.basicrecyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.basicrecyclerview.R
import com.basicrecyclerview.adapter.DemoViewBindingAdapter
import com.basicrecyclerview.model.User
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : Fragment() {

    private val list = ArrayList<User>().apply {
        add(User(R.drawable.profile, "John Doe"))
        add(User(R.drawable.profile, "Mary Kom"))
        add(User(R.drawable.profile, "Jim Carter"))
        add(User(R.drawable.profile, "Sohan Khan"))
        add(User(R.drawable.profile, "Star Lord"))
        add(User(R.drawable.profile, "Robert Jr"))
        add(User(R.drawable.profile, "Thor Thunder"))
        add(User(R.drawable.profile, "Jim Jr"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewBinding.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = DemoViewBindingAdapter(list)
        }
    }
}