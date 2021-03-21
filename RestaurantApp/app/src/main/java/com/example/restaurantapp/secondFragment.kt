package com.example.restaurantapp

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [secondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class secondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_second, container, false)
        val recycler_view = root.findViewById<View>(R.id.recycler_view) as RecyclerView

        val exampleList = generateDummyList(10)

        //recycler_view is the container of the List
        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return root
        //return inflater.inflate(R.layout.fragment_second, container, false)
    }

    private fun generateDummyList(size: Int): List<ExampleItem> {
        //empty array list
        val list = ArrayList<ExampleItem>()

        list.add(ExampleItem(R.drawable.classic1, "Classic Pizza (V)", "Mozzarella Cheese, Tomato Sauce"))
        list.add(ExampleItem(R.drawable.classic3, "Chicken Pizza", "Chicken, Onion, Sweetcorn"))
        list.add(ExampleItem(R.drawable.classic4, "Veggie Dream Pizza (V)", "Courgette, Peppers, Artichoke, Aubergine"))
        list.add(ExampleItem(R.drawable.classic2, "Filthy Steak Pizza", "Steak, Egg, Spinach, Pine nuts"))
        list.add(ExampleItem(R.drawable.meat1, "Farmhouse Pizza", "Chicken, Ham, Olives, Mushrooms"))
        list.add(ExampleItem(R.drawable.chilli, "Spicy Meat Pizza", "Steak, Ham, Chicken, Chili"))
        list.add(ExampleItem(R.drawable.veg1, "Spicy Veg Pizza (V)", "Tomatoes, Peppers, Mushrooms, Sweetcorn, Chilli"))
        list.add(ExampleItem(R.drawable.spicymeat, "Meat Feast Pizza", "Fajita Steak, Chicken, Peppers, Chilli"))

        /* for (i in 0 until size) {
                val drawable = when (i % 3) {
                    0 -> R.drawable.classic1
                    1 -> R.drawable.classic2
                    2 -> R.drawable.classic3
                    3 -> R.drawable.classic4
                    else -> R.drawable.veg1
                }
                val item = ExampleItem(drawable, "Item $i", "Line 2")
                list += item*/

        return list
    }


companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment secondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            secondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}



