package com.example.aspectquiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aspectquiz.databinding.FragmentQ1Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q1Fragment : Fragment() {

    private var _binding: FragmentQ1Binding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSpringtail1.setOnClickListener{
            findNavController().navigate(R.id.action_q1Fragment_to_q2Fragment)
            MainActivity.Companion.springtailValue++
        }
        binding.buttonShrimp1.setOnClickListener {
            findNavController().navigate(R.id.action_q1Fragment_to_q2Fragment)
            MainActivity.Companion.shrimpValue++
        }
        binding.buttonSnail1.setOnClickListener{
            findNavController().navigate(R.id.action_q1Fragment_to_q2Fragment)
            MainActivity.Companion.snailValue++
        }
        binding.buttonLoachOrPleco1.setOnClickListener{
            findNavController().navigate(R.id.action_q1Fragment_to_q2Fragment)
            MainActivity.Companion.loachValue++
            MainActivity.Companion.plecoValue++
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}