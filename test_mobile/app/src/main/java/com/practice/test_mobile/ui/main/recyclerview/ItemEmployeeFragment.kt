package com.practice.test_mobile.ui.main.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.practice.test_mobile.R
import com.practice.test_mobile.databinding.FragmentFormBinding
import com.practice.test_mobile.databinding.FragmentItemEmployeeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ItemEmployeeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemEmployeeFragment : Fragment() {

    private lateinit var binding: FragmentItemEmployeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemEmployeeBinding.inflate(inflater, container, false)
        return binding.root
    }

}