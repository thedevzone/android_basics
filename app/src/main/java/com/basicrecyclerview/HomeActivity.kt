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

        replaceFragment(HomeFragment())
        bottomNavigationView.setOnItemSelectedListener {
            return@setOnItemSelectedListener when (it.itemId) {
                R.id.homeMenu -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.searchMenu -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.profileMenu -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
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