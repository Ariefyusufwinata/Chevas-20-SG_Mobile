package chevalier.rief

import android.content.Context;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GabutAdapter(private val context: Context) : RecyclerView.Adapter<GabutAdapter.ViewHolder>() {

    private var list = listOf<Gabut>()

    fun setList(list: List<Gabut>){
        this.list = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvGame = view.findViewById<TextView>(R.id.tv_game)
        val tvDev = view.findViewById<TextView>(R.id.tv_dev)
        val tvDate = view.findViewById<TextView>(R.id.tv_date)
        val tvMode = view.findViewById<TextView>(R.id.tv_mode)

        fun bind(gabut : Gabut) {
            tvGame.text = gabut.game
            tvDev.text = gabut.dev
            tvDate.text = gabut.date
            tvMode.text = gabut.mode
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_gabut, parent, false))
        return view
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}