package com.example.gmail

import Gmail
import GmailAdapter
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = ArrayList<Gmail>()
        emails.add(Gmail(R.drawable.ic_email, "Ba", "Hello World", "00:00 AM", "Hello, are you ready"))
        emails.add(Gmail(R.drawable.ic_email, "Bom", "Good morning", "10:00 AM", "Have a night day! Good luck!!!"))
        emails.add(Gmail(R.drawable.ic_email, "Bon", "Can you help me", "9:20 PM", "Can you have me to fix my homework tomorrow"))
        emails.add(Gmail(R.drawable.ic_email, "Baby", "Assignment 01", "10:20 PM", "This is my assignment for androi app"))
        emails.add(Gmail(R.drawable.ic_email, "Baby Shark", "Group member", "12:00 AM", "This is my group member's information"))
        emails.add(Gmail(R.drawable.ic_email, "Bob", "Assignment 02", "6:21 PM", "Thank you for checking my homework"))

        val listView: ListView = findViewById(R.id.listView)
        val gmailAdapter = GmailAdapter(this, emails)
        listView.adapter = gmailAdapter
    }
}
