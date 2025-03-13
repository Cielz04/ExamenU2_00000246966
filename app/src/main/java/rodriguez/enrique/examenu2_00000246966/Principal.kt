package rodriguez.enrique.examenu2_00000246966

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupButtons()
    }

    private fun setupButtons() {
        val btnDetalles: Button = findViewById(R.id.btn_detalles)
        btnDetalles.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Detalles")
            startActivity(intent)
        }

        val btnGlobos: Button = findViewById(R.id.btn_globos)
        btnGlobos.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Globos")
            startActivity(intent)
        }

        val btnPeluches: Button = findViewById(R.id.btn_peluches)
        btnPeluches.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Peluches")
            startActivity(intent)
        }

        val btnRegalos: Button = findViewById(R.id.btn_regalos)
        btnRegalos.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Regalos")
            startActivity(intent)
        }

        val btnTazas: Button = findViewById(R.id.btn_tazas)
        btnTazas.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            intent.putExtra("type", "Tazas")
            startActivity(intent)
        }
    }
}