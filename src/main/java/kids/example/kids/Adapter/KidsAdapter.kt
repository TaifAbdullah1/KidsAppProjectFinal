package kids.example.kids.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kids.example.kids.Data.Kids
import com.example.kids.R

class KidsAdapter(private val kidsList: List<Kids>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var onItemClickListener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return KidsVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_kids, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as KidsVH).bind(kids = kidsList[position],onItemClickListener)

    }

    override fun getItemCount(): Int = kidsList.size

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        this.onItemClickListener = onItemClickListener
    }
}