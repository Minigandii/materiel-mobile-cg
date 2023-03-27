package fr.epf.mm.gestionclientmin2_cg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

private const val TAG = "AddClientActivity"

class AddClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_client)

        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")

        val lastNameEditText = findViewById<EditText>(R.id.add_client_last_name_edittext)
        val addButton = findViewById<Button>(R.id.add_client_button)

        val genderRadioGroup = findViewById<RadioGroup>(R.id.add_client_gender_radiogroupe)
        genderRadioGroup.check(R.id.add_client_gender_man_radiobutton)

        val ageTextView = findViewById<TextView>(R.id.add_client_age_textview)
        val ageSeekbar = findViewById<SeekBar>(R.id.add_client_age_seekbar)

        ageSeekbar.max = 65-18

        ageSeekbar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                ageTextView.text = (progress+18).toString()
            }
            override fun onStartTrackingTouch(p0: SeekBar?) = Unit
            override fun onStopTrackingTouch(p0: SeekBar?) = Unit
        })


        val levelSpinner = findViewById<Spinner>(R.id.add_client_level_spinner)



        /*ageSeekbar .setOnSeekBarChangeListener()(object : OnSeekBarChangeListener {
            override fun onProgressChanged(pB: SeekBar?, p1: Int, p2: Boolean){

            }

            override
        })*/


        addButton.setOnClickListener{ v ->
            val message = getString(R.string.add_client_message_succes, lastNameEditText.text)
            Toast.makeText(this,message, Toast.LENGTH_LONG).show()
            Log.d("EPF","Nom : ${(lastNameEditText.text)}")
            /*val gender : Int
            if(genderRadioGroup.checkedRadioButtonId == R.id.add_client_gender_man_radiobutton){
                gender = 1
            }else{
                gender = 2
            }*/
            val gender :Int =
                if(genderRadioGroup.checkedRadioButtonId == R.id.add_client_gender_man_radiobutton) 1 else 2

            Log.d(TAG, "genre: ${gender}")
            Log.d(TAG, "Niveau : ${levelSpinner.selectedItem}")
        }
    }
}