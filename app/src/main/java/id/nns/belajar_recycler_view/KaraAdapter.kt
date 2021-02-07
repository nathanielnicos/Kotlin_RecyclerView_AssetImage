package id.nns.belajar_recycler_view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ListKaraAdapter(private val listKara: ArrayList<Kara>) : RecyclerView.Adapter<ListKaraAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        // Menghubungkan ViewHolder dengan View
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.kara_members, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListKaraAdapter.ListViewHolder, position: Int) {
        // Mengubah nilai Kara sesuai dengan posisinya
        holder.bind(listKara[position])
    }

    override fun getItemCount() = listKara.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView = itemView.findViewById(R.id.name)
        var txtDetail: TextView = itemView.findViewById(R.id.detail)
        var imgPhoto: CircleImageView = itemView.findViewById(R.id.img_photo)

        fun bind(kara: Kara) {
            txtName.text = kara.name
            txtDetail.text = kara.detail
            imgPhoto.setImageResource(kara.photo)
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.KEY_KARA, kara)
                itemView.context.startActivity(intent)
            }
        }
    }
}