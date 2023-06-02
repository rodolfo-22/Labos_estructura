package com.practice.test_mobile.ui.formEmployee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.practice.test_mobile.databinding.FragmentFormBinding
import com.practice.test_mobile.ui.viewmodel.EmployeeViewModel


/**
    Form to add new employee information
 */
class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
    private val employeeViewModel: EmployeeViewModel by activityViewModels<EmployeeViewModel> {
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
        binding = FragmentFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        sentStatus()
    }

    private fun setViewModel(){
        binding.viewmodel = employeeViewModel
    }
    private fun sentStatus(){
        employeeViewModel.status.observe(viewLifecycleOwner){
            when{
                it.equals(EmployeeViewModel.WRONG_INFORMATION)->{
                    val toast = Toast.makeText(requireContext(), EmployeeViewModel.WRONG_INFORMATION, Toast.LENGTH_SHORT)
                    toast.show()
                }
                it.equals(EmployeeViewModel.EMPLOYEE_ADDED)->{
                    val toast = Toast.makeText(requireContext(), EmployeeViewModel.EMPLOYEE_ADDED, Toast.LENGTH_SHORT)
                    toast.show()

                    employeeViewModel.clearStatus()
                    findNavController().popBackStack()
                }
            }
        }
    }

}