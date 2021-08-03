package com.basicrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.basicrecyclerview.fragments.HomeFragment
import com.basicrecyclerview.fragments.ProfileFragment
import com.basicrecyclerview.fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setTitle("Multi-ViewHolder RecyclerView")
        replaceFragment(HomeFragment())
        bottomNavigationView.setOnItemSelectedListener {
            return@setOnItemSelectedListener when (it.itemId) {
                R.id.homeMenu -> {
                    setTitle("Multi-ViewHolder RecyclerView")
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.searchMenu -> {
                    setTitle("Search Fragment")
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.profileMenu -> {
                    setTitle("Profile Fragment")
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

   private fun setTitle(title:String){
        toolBar.title = if (title.isEmpty()) "Bottom NavigationView" else title
    }

    private fun replaceFragment(
        fragment: Fragment,
        isAddToBackStack: Boolean = false
    ) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        if (isAddToBackStack)
            transaction.addToBackStack(fragment::class.java.name)
        transaction.commit()
    }
}