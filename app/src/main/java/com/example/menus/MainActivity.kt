package com.example.menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.googleId -> {
                startActivity(Intent(this, AndroidDevelopment::class.java))
                return super.onOptionsItemSelected(item)
            }
            R.id.youtubeId -> {
                startActivity(Intent(this, Youtube::class.java))
                return super.onOptionsItemSelected(item)
            }
            R.id.facebookId -> {
                startActivity(Intent(this, Facebook::class.java))
                return super.onOptionsItemSelected(item)
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}
