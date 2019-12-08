package com.plbear.imageandroid

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.plbear.imageandroid.base.BaseActivity
import com.plbear.imageandroid.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main) 
    }
}
