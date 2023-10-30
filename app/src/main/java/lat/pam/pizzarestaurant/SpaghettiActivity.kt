package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SpaghettiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti)

        val menu = findViewById<TextView>(R.id.spaghetti_name)
        val btnBack = findViewById<Button>(R.id.button_back)
        val btnOrder = findViewById<Button>(R.id.button_order)

        btnOrder?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                bundle.putString("EXTRA_MENU", menu?.text.toString())
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

        btnBack?.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
    }
}