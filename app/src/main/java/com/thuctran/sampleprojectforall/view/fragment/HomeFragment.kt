package com.thuctran.sampleprojectforall.view.fragment

import androidx.fragment.app.viewModels
import com.thuctran.sampleprojectforall.databinding.FragmentHomeBinding
import com.thuctran.sampleprojectforall.viewmodel.CommonVM

class HomeFragment : BaseFragment<FragmentHomeBinding>(){
    val TAG: String = HomeFragment::class.java.name
    override val viewModel by viewModels<CommonVM>()

    override fun initViewBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        //do nothing
    }
}