package lat.pam.pizzarestaurant

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mNameEditText = findViewById<EditText>(R.id.editText_name)
        val mStoreSpinner = findViewById<Spinner>(R.id.store_spinner)
        val btnKirim = findViewById<Button>(R.id.button_submit)

        btnKirim?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, StoreDetailActivity::class.java)
            val name = mNameEditText?.text.toString()
            val store = mStoreSpinner?.getSelectedItem().toString()
            val extras = Bundle()
            extras.putString("EXTRA_NAME", name)
            extras.putString("EXTRA_STORE", store)
            intent.putExtras(extras)
            startActivity(intent)
        })
    }
}