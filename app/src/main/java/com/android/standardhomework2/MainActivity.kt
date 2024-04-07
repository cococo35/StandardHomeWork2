package com.android.standardhomework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            fragment()
            button.visibility = View.GONE
        }
    }

    private fun fragment() {
        val transFragment = supportFragmentManager.beginTransaction()
        val fragment = DonutListFragment()
        transFragment.add(R.id.fragment1, fragment)
        transFragment.commit()
    }

}