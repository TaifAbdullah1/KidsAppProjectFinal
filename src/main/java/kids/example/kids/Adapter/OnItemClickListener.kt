package kids.example.kids.Adapter

import kids.example.kids.Data.Kids

interface OnItemClickListener {

    fun onIteClick(kids: Kids, position: Int)

}
