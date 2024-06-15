package com.cguevararo1.barriomarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnInventario = findViewById<Button>(R.id.btn_inventario)
        btnInventario.setOnClickListener {
            val intent = Intent(this, Inventario::class.java)
            startActivity(intent)
        }

        val btnClientes = findViewById<Button>(R.id.btn_clientes)
        btnClientes.setOnClickListener {
            val intent = Intent(this, Clientes::class.java)
            startActivity(intent)
        }

        val btnFacturacion = findViewById<Button>(R.id.btn_facturacion)
        btnFacturacion.setOnClickListener {
            val intent = Intent(this, Facturacion::class.java)
            startActivity(intent)
        }

        val btnSalir = findViewById<Button>(R.id.btn_salir)
        btnSalir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
