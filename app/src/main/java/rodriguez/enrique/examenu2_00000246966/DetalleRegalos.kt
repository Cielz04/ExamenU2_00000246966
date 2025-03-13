package rodriguez.enrique.examenu2_00000246966

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)

        val iv_image: ImageView = findViewById(R.id.iv_regalo_imagen)
        val tv_precio: TextView = findViewById(R.id.tv_regalo_precio)

        val imagen = intent.getIntExtra("imagen", 0)
        val precio = intent.getStringExtra("precio")

        if (imagen != 0) {
            iv_image.setImageResource(imagen)
        } else {
            Log.e("DetalleRegalos", "Error: No se recibió una imagen válida")
        }
        tv_precio.text = precio
    }
}