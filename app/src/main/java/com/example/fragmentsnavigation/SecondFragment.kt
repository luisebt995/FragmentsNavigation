package com.example.fragmentsnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_second, container, false)
        val btnSecondThird = root.findViewById<Button>(R.id.btnSecondThird)
        val editProvincia = root.findViewById<EditText>(R.id.editProvincia)

        btnSecondThird.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(editProvincia.text.toString())
            findNavController().navigate(action)
        }
        Log.i("SecondFragment",args.name.toString())

        return root
    }

}