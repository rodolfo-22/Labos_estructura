package com.practice.test_mobile.ui.viewEmployee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.practice.test_mobile.databinding.FragmentViewEmployeeBinding
import com.practice.test_mobile.ui.viewmodel.EmployeeViewModel

/**
    Fragment to see each employee information
 */
class ViewEmployeeFragment : Fragment() {

    private lateinit var binding: FragmentViewEmployeeBinding
    private val employeeViewModel: EmployeeViewModel by activityViewModels{
        EmployeeViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewEmployeeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
    }
    private fun setViewModel(){
        binding.viewmodel = employeeViewModel
    }

}