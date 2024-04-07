package com.android.standardhomework2

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ListView
import androidx.fragment.app.Fragment

class DonutDetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments.let {  }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_donut_detail, container, false)
        val id = arguments?.getInt("id")
        val button = view.findViewById<ImageButton>(R.id.detailbtn1)
        val detailimg = view.findViewById<ImageView>(R.id.detailimg1)
        val items = listOf("Item1", "Item2", "Item3", "Item4")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        val listView = view?.findViewById<ListView>(R.id.detaillistview)
        listView?.adapter = adapter
        when(id) {
            1 -> detailimg.setImageResource(R.drawable.donut1)
            2 -> detailimg.setImageResource(R.drawable.donut2)
            3 -> detailimg.setImageResource(R.drawable.donut3)
            4 -> detailimg.setImageResource(R.drawable.donut4)
            5 -> detailimg.setImageResource(R.drawable.donut5)
            6 -> detailimg.setImageResource(R.drawable.donut6)
        }
        button.setOnClickListener {
            val fragmenttrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragmentdetail)
            val newfragment = DonutListFragment()
            if(currentfragment != null) fragmenttrans.remove(currentfragment)
            fragmenttrans.add(R.id.fragment1, newfragment)
            fragmenttrans.commit()
        }


        return view
    }
}