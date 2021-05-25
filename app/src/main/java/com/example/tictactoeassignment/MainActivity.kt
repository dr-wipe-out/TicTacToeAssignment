package com.example.tictactoeassignment



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// an intent to go from homepage to gamepage when pressed
        startGame.setOnClickListener(){
            Toast.makeText(this, "Start!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, tictactoeclass::class.java)
            startActivity(intent)
        }

    }



//Using alert dialog the button btnQuit has the  onclick btnQuitGame method which gives a warning when pressed, if want to quit press yes to exit and no to not.

    fun btnQuitGame(v: View)
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Dialog Warning")
        builder.setMessage("Click yes if you want to quit or no to stay ")
        builder.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(applicationContext,
                "Yes", Toast.LENGTH_SHORT).show()
            finish()
            System.exit(0)
        }

        builder.setNegativeButton("No") { dialog, which ->
            Toast.makeText(applicationContext,
                "No", Toast.LENGTH_SHORT).show()
        }

        builder.show()
    }
}







