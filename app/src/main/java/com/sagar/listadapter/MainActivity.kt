package com.sagar.listadapter

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(
            R.id.recyclerView
        )

        val adapter = ListAdapter()

        val La = ListItem(1, "K", "Kotlin")
        val Lb = ListItem(2, "H", "HTML")
        val Lc = ListItem(3, "J", "JavaScript")

        adapter.submitList(listOf(La, Lb, Lc))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            val Lc = ListItem(3, "J", "JavaScript")
            val Ld = ListItem(4, "W", "Website")
            val Le = ListItem(5, "R", "Ruby")
            val Lf = ListItem(6, "C", "C++")
            val Lg = ListItem(7, "S", "Swift")
            val Lh = ListItem(8, "F", "Flutter")
            adapter.submitList(listOf(Lc, Ld, Le, Lf, Lg, Lh))
        }, 3000)

    }
}