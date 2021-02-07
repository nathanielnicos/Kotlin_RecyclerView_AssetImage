package id.nns.belajar_recycler_view

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_KARA = "key_kara"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataKara = intent.getParcelableExtra(KEY_KARA) as Kara
        findViewById<TextView>(R.id.tv_name).text = dataKara.name
        findViewById<TextView>(R.id.tv_detail).text = dataKara.detail
        findViewById<ImageView>(R.id.iv_pic).setImageResource(dataKara.photo)
    }
}
