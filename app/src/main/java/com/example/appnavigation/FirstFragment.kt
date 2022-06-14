package com.example.appnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.appnavigation.R

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view2 = inflater.inflate(R.layout.firstfragment, container, false)
        view2.setOnClickListener { Navigation.findNavController(view2).navigate(R.id.action_firstFragment_to_secondFragment) }
        return view2
    }
}