package com.example.omsairam.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent( this,LeagueActivity::class.java)
            startActivity(leagueIntent)
            /* intent are used to tell what action to be performed
            it can be implicit and explicit implicit is when u ask for permission
            for camera browser etc.. implicit asks the android system to do that task
            if there are two apps that can do so like for browser there can be chrome
            mozilla etc so it asks which browser to use
            in explicit actions are performed by that particular app
            and is denoted through class the above is an eg of explicit intent*/
            /*
            Inteface to global info about an app environment. This is an abstract class
            whose implementation is provided by the Android system. It allows access to
            app-specific resources and classes, as well as up-class for app-level
            operations such as launching activities,broadcasting and receiving intents etc
            */
        }

    }
}
