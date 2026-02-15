package com.example.listadetarefas

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var btnAdicionar: Button
    private val lista = ArrayList<String>()
    private var contador = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        btnAdicionar = findViewById(R.id.btnAdicionar)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, lista)

        listView.adapter = adapter

        btnAdicionar.setOnClickListener {
            lista.add("Item $contador")
            contador++
            adapter.notifyDataSetChanged()
        }
    }
}
