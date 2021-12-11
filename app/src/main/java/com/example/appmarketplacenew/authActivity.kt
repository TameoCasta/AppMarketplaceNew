package com.example.appmarketplacenew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.DialogInterface
import android.content.Intent
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.util.regex.Pattern


class authActivity : AppCompatActivity() {
    private var signUpButton: EditText? = null
    private var emailEditText: EditText? = null
    private var passwordEditText: EditText? = null

    var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        signUpButton= findViewById(R.id.signUpButton);
        emailEditText= findViewById(R.id.emailEditText);
        passwordEditText= findViewById(R.id.passwordEditText);


        //setup
        setup()


    }
    private fun setup() {
        title = "Autenticacion"

        signUpButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty()&& passwordEditText.text.isNotEmpty()){
        }







    }
}
