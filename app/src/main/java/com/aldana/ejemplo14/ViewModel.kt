package com.aldana.ejemplo14

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    val Team1 = MutableLiveData<String>()
    val Team2 = MutableLiveData<String>()

    init {
        scoreTeamA.value = "0"
        scoreTeamB.value = "0"
    }

}