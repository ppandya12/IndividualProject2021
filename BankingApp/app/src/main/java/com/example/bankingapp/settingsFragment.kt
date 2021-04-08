package com.example.bankingapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [settingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class settingsFragment : Fragment() {
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

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_settings, container, false)

        val switch1 = root.findViewById<View>(R.id.switch1) as Switch
        val switch2 = root.findViewById<View>(R.id.switch2) as Switch
        val switch3 = root.findViewById<View>(R.id.switch3) as Switch
        val switch4 = root.findViewById<View>(R.id.switch4) as Switch

        //toast messages for switch buttons
        switch1.setOnClickListener {
            Toast.makeText(activity, "Changes Applied", Toast.LENGTH_LONG).show()
        }

        switch2.setOnClickListener {
            Toast.makeText(activity, "Changes Applied", Toast.LENGTH_LONG).show()
        }

        switch2.setOnClickListener {
            Toast.makeText(activity, "Changes Applied", Toast.LENGTH_LONG).show()
        }

        switch3.setOnClickListener {
            Toast.makeText(activity, "Changes Applied", Toast.LENGTH_LONG).show()
        }

        switch4.setOnClickListener {
            Toast.makeText(activity, "Changes Applied", Toast.LENGTH_LONG).show()
        }

        return root
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment settingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            settingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}