package com.example.mvvm_application.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mvvm_application.R
import java.lang.Math.random

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       var view = inflater.inflate(R.layout.fragment_main, container, false)
        var message = view.findViewById<TextView>(R.id.message)
        if (message!= null){
            message.text = viewModel.result.value.toString()
        }

        var editText1 = view.findViewById<TextView>(R.id.EditText1)
        var editText2 = view.findViewById<TextView>(R.id.EditText2)

        viewModel.result.observe(viewLifecycleOwner) {
            message.text = it.toString()
        }

        var addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener{
            //viewModel.add(4.0,6.0)
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            viewModel.add(num1, num2)
            //    message.text = viewModel.addAntiFunction(Math.random(),12.0).toString()

        }

        var minButton = view.findViewById<Button>(R.id.minButton)
        minButton.setOnClickListener{
            //viewModel.sub(4.0,6.0)
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            viewModel.sub(num1, num2)
        }

        var multifyButton = view.findViewById<Button>(R.id.multifyButton)
        multifyButton.setOnClickListener{
            //viewModel.multify(4.0,6.0)
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            viewModel.multify(num1, num2)
        }

        var divideButton = view.findViewById<Button>(R.id.divideButton)
        divideButton.setOnClickListener{
            //viewModel.devide(4.0,6.0)
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            viewModel.devide(num1, num2)
        }

        return view
    }

}