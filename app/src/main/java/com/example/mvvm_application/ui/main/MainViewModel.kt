package com.example.mvvm_application.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var result = MutableLiveData<Double>(0.0)

    fun add(number1: Double,number2: Double){
        var _result = number1.plus(number2)
        result.value = _result
        // result.value = number1.plus(number2)
        Log.d("Add Result",result.value.toString())
        //println(result.value)
    }
    // fun addAntiFunction(number1: Double,number2: Double) :Double{
    //     return number1.plus(number2)
    // }

    fun sub(number1: Double,number2: Double){
        var _result = number1.minus(number2)
        result.value = _result

    }

    fun multify(number1: Double,number2: Double){
        var _result = number1.times(number2)
        result.value = _result

    }

    fun devide(number1: Double,number2: Double){
        var _result = number1.div(number2)
        result.value = _result

    }
}