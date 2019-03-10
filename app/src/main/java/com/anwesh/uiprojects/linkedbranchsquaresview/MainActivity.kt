package com.anwesh.uiprojects.linkedbranchsquaresview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.branchsquaresview.BranchSquaresView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BranchSquaresView.create(this)
    }
}
