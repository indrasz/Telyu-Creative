package org.brainless.telyucreative.views.mainscreen.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.brainless.telyucreative.R
import org.brainless.telyucreative.databinding.FragmentAccountBinding
import org.brainless.telyucreative.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding :FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}