package com.furkancolak.navigationkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.furkancolak.navigationkotlin.databinding.FragmentFirsBinding

class FirsFragment : Fragment() {
    private var _binding: FragmentFirsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val action = FirsFragmentDirections.actionFirsFragmentToSecondFragment("Ahmet")
            Navigation.findNavController(it).navigate(action)
            //Diğer sayfaya gitme islemi yapar Navigation ile
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}