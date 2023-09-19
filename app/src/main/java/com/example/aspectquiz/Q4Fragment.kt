package com.example.aspectquiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aspectquiz.databinding.FragmentQ4Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q4Fragment : Fragment() {

    private var _binding: FragmentQ4Binding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSpringtail4.setOnClickListener {
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.springtailValue++
        }
        binding.buttonShrimp4.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.shrimpValue++
        }
        binding.buttonSnail4.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.snailValue++
        }
        binding.buttonLoach4.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.loachValue++
        }
        binding.buttonPleco4.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.plecoValue++
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}