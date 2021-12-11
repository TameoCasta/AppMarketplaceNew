package com.example.appmarketplacenew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlin.concurrent.thread


class authActivity : AppCompatActivity() {


    var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)




        //setup
        setup()


    }
    private fun setup() {
        title = "Autenticacion"








    }
}
