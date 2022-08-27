package kids.example.kids.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kids.*
import kids.example.kids.Adapter.KidsAdapter
import kids.example.kids.Adapter.OnItemClickListener
import kids.example.kids.Data.KidsDataSource
import kids.example.kids.Data.Kids
import kotlinx.android.synthetic.main.fragment_kids.*



class KidsFragment : Fragment(), OnItemClickListener {

    private val adapter = KidsAdapter(KidsDataSource.createCountriesList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_kids, container, false)
    }






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        kids_rc.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = this@KidsFragment.adapter
        }
        adapter.setOnItemClickListener(this)
    }

    override fun onIteClick(kids: Kids, position: Int) {
        val bundle = bundleOf("kids" to kids)
        findNavController().navigate(
            R.id.action_kidsFragment_to_kidsDetailsFragment,bundle)
    }
}