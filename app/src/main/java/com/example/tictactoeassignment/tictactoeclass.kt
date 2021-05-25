package com.example.tictactoeassignment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class tictactoeclass : AppCompatActivity() {

    var user: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tictactoe)
    }



    fun ClickGameButton(view: View) {
        //The main method (ClickGameButton( which makes a type btn, that is called each  time one of the button's is pressed.
        //colour type = int as android has specified it's type
        // crossXcircle type = string to store the X or O value
        //isClickable here is to make the buttons clicked once so it doesn't become X then O then X each time it gets clicked
        // user here is the user currently on the his/her turn , value is default 0, user%2==1 is put there to make sure O is an odd number aka 1 and X is an even number aka 0
        //colour is used for the line 34 to set a colour for the btn it self when clicked
        //btn.text is input the value X or O from the if statement according to user type and view it
        //user= user+1 here is to just keep adding as a counter

        val btn: Button = view as Button
        val colour: Int
        //
        val crossXcircle: String
        btn.isClickable = false

        if (user % 2 == 1) {
            crossXcircle = "o"
            colour = R.color.black
            btn.setBackgroundColor(resources.getColor(colour))

        } else {
            crossXcircle = "x"
            colour = R.color.orange
            btn.setBackgroundColor(resources.getColor(colour))
        }

        btn.text = crossXcircle
        user += 1

    }
    //here we have btnResetGame,  is to reset the game by means all of the X or O you have pressed to a new page

    fun btnResetGame(v: View?) {
        val intent = intent
        finish()
        startActivity(intent)
    }
    //here we have a button to go back to the main page
    fun btnGoBack(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}

