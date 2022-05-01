package com.example.myconvertor

import android.os.Bundle
import android.view.View
import com.example.myconvertor.databinding.FragmentSizesBinding

class SizesFragment :BindingFragment<FragmentSizesBinding>(FragmentSizesBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override val viewModel: Any
        get() = TODO("Not yet implemented")

}