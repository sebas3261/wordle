package com.example.wordle.ui.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class PlayViewModel: ViewModel(){
    private val _booleanList = mutableStateListOf(true, false, false, false, false, false, false)
    val booleanList: List<Boolean> = _booleanList
    var answer = "carro"

    fun verlong(text: String): Boolean{
        if(text.length == 5)
            return true
        return false
    }

    fun NextValue() {
        for (i in 0 until _booleanList.size) {
            if (_booleanList[i]) {
                if (i < _booleanList.size - 1) {
                    _booleanList[i] = false
                    _booleanList[i + 1] = true
                }
                break
            }
        }
    }

    fun verify(text: String): IntArray {
        val result = IntArray(5)
        val targetChars = answer.toCharArray()
        val guessChars = text.toCharArray()

        for (i in text.indices) {
            if (guessChars[i] == targetChars[i]) {
                result[i] = 1
            }
        }

        for (i in text.indices) {
            if (result[i] == 1) {
                continue
            }
            var isMatch = false
            for (j in targetChars.indices) {
                if (result[j] != 1 && guessChars[i] == targetChars[j]) {
                    result[i] = 2
                    isMatch = true
                    break
                }
            }
            if (!isMatch) {
                result[i] = 3
            }
        }

        return result
    }

    fun resetColors(): IntArray {
        val result: IntArray = intArrayOf(5, 5, 5, 5, 5)
        return result
    }

    fun won(colors: IntArray): Boolean {
        for(i in colors){
            if(i != 1)
                return false
        }
        return true
    }
}