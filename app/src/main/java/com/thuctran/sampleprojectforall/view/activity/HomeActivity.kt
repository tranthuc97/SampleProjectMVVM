package com.thuctran.sampleprojectforall.view.activity

import com.thuctran.sampleprojectforall.viewmodel.CommonVM
import com.thuctran.sampleprojectforall.databinding.ActivityHomeBinding
import com.thuctran.sampleprojectforall.view.fragment.SplashFragment

class HomeActivity : BaseAct<ActivityHomeBinding,CommonVM>() {
    override fun getClassVM(): CommonVM {
        return CommonVM()
    }

    override fun initViewBinding(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        showFragment(SplashFragment().TAG,null,false)       //show splash lên trước


    }

    override fun callBack(key: String, data: Any?) {
        //do something
    }

    override fun closeApp() {
        //do something
    }
}