package com.practice.test_mobile.Data.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practice.test_mobile.Data.Model.EmployeeModel
import com.practice.test_mobile.databinding.FragmentItemEmployeeBinding

class EmployeeRecyclerViewAdapter(
    private val clickListener: (EmployeeModel) -> Unit
): RecyclerView.Adapter<EmployeeRecyclerViewHolder>() {
    private val employees = ArrayList<EmployeeModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeRecyclerViewHolder {
        val binding = FragmentItemEmployeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmployeeRecyclerViewHolder(binding)
    }

    override fun getItemCount() = employees.size

    override fun onBindViewHolder(holder: EmployeeRecyclerViewHolder, position: Int) {
        val employee = employees[position]
        holder.bind(employee, clickListener)
    }

    fun setData(employeeList: List<EmployeeModel>){
        employees.clear()
        employees.addAll(employeeList)
    }

}