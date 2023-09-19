package com.example.aspectquiz
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aspectquiz.databinding.FragmentQ6Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q6Fragment : Fragment() {

    private var _binding: FragmentQ6Binding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ6Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSpringtail6.setOnClickListener {
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.springtailValue++
        }
        binding.buttonShrimp6.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.shrimpValue++
        }
        binding.buttonSnailOrPleco6.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.snailValue++
            MainActivity.Companion.plecoValue++
        }
        binding.buttonLoach6.setOnClickListener{
            findNavController().navigate(R.id.action_q4Fragment_to_q5Fragment)
            MainActivity.Companion.loachValue++
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}