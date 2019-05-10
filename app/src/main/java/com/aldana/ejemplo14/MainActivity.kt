package com.aldana.ejemplo14

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aldana.ejemplo14.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView( )

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.setLifecycleOwner(this)
        binding.viewmodelx = scoreViewModel
    }

    fun addOneTeamA(v: View) { scoreViewModel.Team1.value = add(scoreViewModel.Team1.value,1) }

    fun addOneTeamB(v: View) { scoreViewModel.Team2.value = add(scoreViewModel.Team2.value,1) }

    fun addTwoTeamA(v: View) { scoreViewModel.Team1.value = add(scoreViewModel.Team1.value,2) }

    fun addTwoTeamB(v: View) { scoreViewModel.Team2.value = add(scoreViewModel.Team2.value,2) }

    fun addThreeTeamA(v: View) { scoreViewModel.Team1.value = add(scoreViewModel.scoreTeamA.value,3) }

    fun addThreeTeamB(v: View) {
        scoreViewModel.Team2.value = add(scoreViewModel.Team2.value,3)

    }
    fun resetScores(v: View) {
        scoreViewModel.Team1.value ="0"
        scoreViewModel.Team2.value = "0"
    }
    fun add(a: String?,num:Int):String{
        return (a?.toInt()?.plus(num)).toString()
    }


}
