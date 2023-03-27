package fr.epf.mm.gestionclientmin2_cg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val addButton = findViewById<Button>(R.id.home_add_button)

        addButton.setOnClickListener{
            val intent = Intent(this, AddClientActivity:: class.java)
            startActivity(intent)
        }
    }
}