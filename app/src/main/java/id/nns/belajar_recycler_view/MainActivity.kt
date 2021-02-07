package id.nns.belajar_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKara: RecyclerView
    private var list: ArrayList<Kara> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting RecyclerView
        rvKara = findViewById(R.id.rv_list)
        rvKara.setHasFixedSize(true)

        // Memasukkan data ke data class
        list.addAll(KaraData.listData)

        // Memasang adapter
        rvKara.layoutManager = LinearLayoutManager(this)
        val adapter = ListKaraAdapter(list)
        rvKara.adapter = adapter
    }
}