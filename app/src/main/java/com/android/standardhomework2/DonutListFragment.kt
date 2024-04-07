package com.android.standardhomework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class DonutListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {  }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_donut_list, container, false)
        val button = view.findViewById<ImageButton>(R.id.cardlistimg1)
        val button2 = view.findViewById<ImageButton>(R.id.cardlistimg2)
        val button3 = view.findViewById<ImageButton>(R.id.cardlistimg3)
        val button4 = view.findViewById<ImageButton>(R.id.cardlistimg4)
        val button5 = view.findViewById<ImageButton>(R.id.cardlistimg5)
        val button6 = view.findViewById<ImageButton>(R.id.cardlistimg6)

        button.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 1)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        button2.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 2)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        button3.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 3)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        button4.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 4)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        button5.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 5)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        button6.setOnClickListener {
            val fragmentTrans = parentFragmentManager.beginTransaction()
            val currentfragment = parentFragmentManager.findFragmentById(R.id.fragment1)
            val newfragment = DonutDetailFragment()
            val bundle = Bundle()
            bundle.putInt("id", 6)
            newfragment.arguments = bundle
            if(currentfragment != null) fragmentTrans.remove(currentfragment)
            fragmentTrans.add(R.id.fragment1, newfragment)
            fragmentTrans.commit()
        }

        return view
    }
}

