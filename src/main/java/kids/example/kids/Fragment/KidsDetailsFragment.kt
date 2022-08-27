package kids.example.kids.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_kids_details.*
import android.content.Intent
import android.net.Uri
import kids.example.kids.Data.Kids
import com.example.kids.R

class KidsDetailsFragment : Fragment() {
    private lateinit var kids: Kids

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kids = arguments?.getParcelable("kids")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_kids_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this).load(kids.image).into(imageView2)
        textView2.text = kids.name



        youtube.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            val f = kids.name
            openURL.data = Uri.parse(kids.uri)
            startActivity(openURL)
        }
        pdf.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            val h = kids.name
            openURL.data = Uri.parse(kids.uripdf)
            startActivity(openURL)
        }


        iarrow_back.setOnClickListener {
            findNavController().popBackStack()
        }

    }

}