package com.example.myfirstkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emails = fakeEmails()


        recycler_view_main.adapter = EmailAdapter(emails);
        recycler_view_main.layoutManager = LinearLayoutManager(this)

    }

}
