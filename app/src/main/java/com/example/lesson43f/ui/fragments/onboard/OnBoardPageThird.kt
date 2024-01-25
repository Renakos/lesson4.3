package com.example.lesson43f.ui.fragments.onboard


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lesson43f.R
import com.example.lesson43f.databinding.FragmentOnboardPageThirdBinding
import com.example.lesson43f.utils.PreferencesHelper

class OnBoardPageThird : Fragment(R.layout.fragment_onboard_page_third) {

    private var _binding: FragmentOnboardPageThirdBinding? = null
    private val binding get() = _binding!!
    private val preferencesHelper: PreferencesHelper by lazy {
        PreferencesHelper(context ?: requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboardPageThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onStartClick()
    }

    private fun onStartClick() {
        binding.start.setOnClickListener {
            preferencesHelper.isShownOnBoard = true
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}