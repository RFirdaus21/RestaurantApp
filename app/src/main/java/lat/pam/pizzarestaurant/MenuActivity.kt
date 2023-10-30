package lat.pam.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val extras = intent.extras
        val name = extras!!.getString("EXTRA_NAME")
        val textView = findViewById<TextView>(R.id.header_txt)
        val pizzaMenu = findViewById<LinearLayout>(R.id.pizza_menu)
        val spaghettiMenu = findViewById<LinearLayout>(R.id.spaghetti_menu)
        val burgerMenu = findViewById<LinearLayout>(R.id.burger_menu)
        val steakMenu = findViewById<LinearLayout>(R.id.steak_menu)

        textView.text = "Hello, " + name

        pizzaMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PizzaActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

        spaghettiMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SpaghettiActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

        burgerMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, BurgerActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

        steakMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SteakActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

    }

}