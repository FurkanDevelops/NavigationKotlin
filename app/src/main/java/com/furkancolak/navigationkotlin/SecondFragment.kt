package com.furkancolak.navigationkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.furkancolak.navigationkotlin.databinding.FragmentFirsBinding
import com.furkancolak.navigationkotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val kullaniciAdi = SecondFragmentArgs.fromBundle(it).userName
            println(kullaniciAdi)
            binding.textView2.text=kullaniciAdi
        }

        binding.button2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirsFragment()
            Navigation.findNavController(it).navigate(action)
            //Diğer sayfaya gitme islemi yapar Navigation ile
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}