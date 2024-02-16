package com.example.fragmentsnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_first, container, false)
        val btnCLick = root.findViewById<Button>(R.id.btnClick)
        val btnAnimation = root.findViewById<LottieAnimationView>(R.id.btnAnimation)

        btnCLick.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Prueba 1")
            findNavController().navigate(action)
        }

        btnAnimation.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Prueba 1 Animation")
            findNavController().navigate(action)
        }

        return root
    }



}