package com.thuctran.sampleprojectforall.view.fragment

import androidx.fragment.app.viewModels
import com.thuctran.sampleprojectforall.databinding.FragmentSplashBinding
import com.thuctran.sampleprojectforall.viewmodel.CommonVM

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    var TAG: String = SplashFragment::class.java.name
    override val viewModel by viewModels<CommonVM>()    //phải khai báo như thế này thì mới sd được viewmodel trong Flagment


    override fun initViewBinding(): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        //2s sau chạy sang MainFragment
        android.os.Handler().postDelayed({
            callBack1?.showFragment(HomeFragment().TAG,null,false)
        },2000)

    }
}