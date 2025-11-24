package com.example.futuremob_admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card1 = findViewById<MaterialCardView>(R.id.card1)
        val icon1 = card1.findViewById<ImageView>(R.id.iconCard)
        val text1 = card1.findViewById<TextView>(R.id.textCard)
        icon1.setImageResource(R.drawable.ic_baseline_inbox_24)
        text1.text = "Produtos"

        val card2 = findViewById<MaterialCardView>(R.id.card2)
        val icon2 = card2.findViewById<ImageView>(R.id.iconCard)
        val text2 = card2.findViewById<TextView>(R.id.textCard)
        icon2.setImageResource(R.drawable.ic_baseline_category_24)
        text2.text = "Categorias"

        val card3 = findViewById<MaterialCardView>(R.id.card3)
        val icon3 = card3.findViewById<ImageView>(R.id.iconCard)
        val text3 = card3.findViewById<TextView>(R.id.textCard)
        icon3.setImageResource(R.drawable.ic_baseline_shopping_cart_24)
        text3.text = "Pedidos"

        val card4 = findViewById<MaterialCardView>(R.id.card4)
        val icon4 = card4.findViewById<ImageView>(R.id.iconCard)
        val text4 = card4.findViewById<TextView>(R.id.textCard)
        icon4.setImageResource(R.drawable.ic_baseline_supervisor_account_24)
        text4.text = "Usuários"

        val txtDataHora = findViewById<TextView>(R.id.txtDataHora)
        val dataHoraAtual = SimpleDateFormat("dd 'de' MMMM 'de' yyyy - HH:mm", Locale("pt", "BR"))
        txtDataHora.text = dataHoraAtual.format(Date())

    }
}

