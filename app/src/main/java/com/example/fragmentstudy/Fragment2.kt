package com.example.fragmentstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fragmentstudy.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private lateinit var binding : Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_2,container,false)

        binding.two.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment22_to_fragment1)
        }

        return binding.root
    }
}