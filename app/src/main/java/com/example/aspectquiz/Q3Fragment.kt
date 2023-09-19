package com.example.aspectquiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aspectquiz.databinding.FragmentQ3Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q3Fragment : Fragment() {

    private var _binding: FragmentQ3Binding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ3Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSpringtail3.setOnClickListener {
            findNavController().navigate(R.id.action_q3Fragment_to_q4Fragment)
            MainActivity.Companion.springtailValue++
        }
        binding.buttonShrimp3.setOnClickListener{
            findNavController().navigate(R.id.action_q3Fragment_to_q4Fragment)
            MainActivity.Companion.shrimpValue++
        }
        binding.buttonSnail3.setOnClickListener{
            findNavController().navigate(R.id.action_q3Fragment_to_q4Fragment)
            MainActivity.Companion.snailValue++
        }
        binding.buttonLoach3.setOnClickListener{
            findNavController().navigate(R.id.action_q3Fragment_to_q4Fragment)
            MainActivity.Companion.loachValue++
        }
        binding.buttonPleco3.setOnClickListener{
            findNavController().navigate(R.id.action_q3Fragment_to_q4Fragment)
            MainActivity.Companion.plecoValue++
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}