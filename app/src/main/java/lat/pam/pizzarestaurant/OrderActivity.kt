package lat.pam.pizzarestaurant

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val extras = intent.extras
        val name = extras!!.getString("EXTRA_NAME")
        val store = extras!!.getString("EXTRA_STORE")
        val menu = extras!!.getString("EXTRA_MENU")

        val nameView = findViewById<TextView>(R.id.customer_name)
        val storeView = findViewById<TextView>(R.id.store_name)
        val menuView = findViewById<TextView>(R.id.menu_confirmation)
        val btnDone = findViewById<Button>(R.id.button_done)
        val doneView = findViewById<TextView>(R.id.order_done)
        val deliveryPickup = findViewById<CheckBox>(R.id.checkbox_pickup)
        val deliveryFastDelivery = findViewById<CheckBox>(R.id.checkbox_delivery)

        nameView.text = name
        storeView.text = "Store: " + store
        menuView.text = menu + " sudah dipesan"

        btnDone?.setOnClickListener(View.OnClickListener {
            val deliveryMessage = if (deliveryPickup.isChecked) {
                "Terima kasih kak $name sudah memesan di toko kami, pesanan $menu Anda sedang dipersiapkan, silahkan datang ke toko untuk mengambil pesanan"
            } else "\"Terima kasih kak $name sudah memesan di toko kami, pesanan $menu anda dikirim menggunakan Fast Delivery"
            doneView.setBackgroundColor(Color.parseColor("#02915C"))
            doneView.text =  deliveryMessage
        })

    }
}