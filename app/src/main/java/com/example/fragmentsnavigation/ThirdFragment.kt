package com.example.fragmentsnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.navArgs
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment() {
    val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_third, container, false)
        val btnThirdSecond = root.findViewById<Button>(R.id.btnThirdSecond)
        val btnThirdFirst = root.findViewById<Button>(R.id.btnThirdFirst)

        btnThirdSecond.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToSecondFragment()
            findNavController().navigate(action)
        }

        btnThirdFirst.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragment()
            findNavController().navigate(action)
        }

        Log.i("ThirdFragment",args.province.toString())
        return root
    }

}