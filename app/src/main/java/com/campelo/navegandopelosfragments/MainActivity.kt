package com.campelo.navegandopelosfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnStatus: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btnConversas)
        btnStatus = findViewById(R.id.btnStatus)
        btnChamadas = findViewById(R.id.btnChamadas)

        btnConversas.setOnClickListener {
            onFragment(ConversasFragment())
        }

        btnStatus.setOnClickListener {
            onFragment(StatusFragment())
        }

        btnChamadas.setOnClickListener {
            onFragment(ChamadasFragment())
        }
    }

    private fun onFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentConteudo, fragment)
            .commit()
    }
}