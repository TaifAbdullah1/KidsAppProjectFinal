package kids.example.kids.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kids.example.kids.Data.Kids
import kotlinx.android.synthetic.main.item_kids.view.*

class KidsVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val rootView = itemView.item_kids_rootView
    private val name = itemView.item_kids_nameTV
    private val lesson = itemView.item_kids_lessonTV
    private val imageView = itemView.item_kids_imageView

    fun bind(kids: Kids, onItemClickListener: OnItemClickListener) {
        name.text = kids.name
        lesson.text = kids.lesson

        Glide.with(itemView).load(kids.image).into(imageView)

        rootView.setOnClickListener {
            onItemClickListener.onIteClick(kids, adapterPosition)

        }
    }

}