package org.insbaixcamp.frasesdemrajoy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Lista de frases que puede mostrar la aplicación.
    // Puedes añadir todas las que quieras.
    private val frases = listOf(
        "Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.",
        "Una cosa es ser solidario y otra es serlo a cambio de nada.",
        "Cuanto peor, mejor para todos y cuanto peor para todos, mejor.",
        "Tenemos que fabricar máquinas que nos permitan seguir fabricando máquinas.",
        "Los españoles son muy españoles y mucho españoles.",
        "Todo lo que se ha publicado es falso, salvo alguna cosa.",
        "Lo más importante que se puede hacer por vosotros es lo que vosotros podáis hacer por vosotros.",
        "España es una gran nación y los españoles muy españoles.",
        "¿Ustedes piensan antes de hablar o hablan tras pensar?",
        "Haré todo lo que pueda y un poco más de lo que pueda si es que eso es posible, y haré todo lo posible e incluso lo imposible si también lo imposible es posible.",
        "Los chuches, no suben hasta el IVA de los chuches",
        "Hay que fabricar máquinas que nos permitan seguir fabricando máquinas, porque lo que no va a hacer nunca la máquina es fabricar máquinas.",
        "Fin de la cita.",
        "It's very difficult todo esto.",
        "Somos sentimientos y tenemos seres humanos.",
        "Exportar es positivo porque vendes lo que produces.",
        "¡Viva el vino!"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenemos los componentes del XML para poder utilizarlos desde Kotlin.
        val tvFrase = findViewById<TextView>(R.id.tvFrase)
        val btnGenerar = findViewById<Button>(R.id.btnGenerar)

        // Cada vez que se pulsa el botón seleccionamos una frase aleatoria.
        btnGenerar.setOnClickListener {

            val fraseAleatoria = frases.random()

            tvFrase.text = fraseAleatoria
        }
    }
}