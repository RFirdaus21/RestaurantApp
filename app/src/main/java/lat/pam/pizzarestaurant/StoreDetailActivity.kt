package lat.pam.pizzarestaurant

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_detail)

        val extras = intent.extras
        val name = extras!!.getString("EXTRA_NAME")
        val store = extras!!.getString("EXTRA_STORE")
        val textView = findViewById<TextView>(R.id.header_text)
        val storeView = findViewById<TextView>(R.id.store_name)
        val btnMenu = findViewById<Button>(R.id.button_menu)

        textView.text = "Hello, " + name
        storeView.text = store

        btnMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

//        val Intent = Intent(this@StoreDetailActivity, MenuActivity::class.java)

    }
}