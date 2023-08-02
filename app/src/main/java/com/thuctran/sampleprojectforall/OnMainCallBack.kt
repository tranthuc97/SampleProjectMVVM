package com.thuctran.sampleprojectforall

interface OnMainCallBack {
    fun callBack(key:String,data:Any?) {}       //để dấu {}. PT là PT default chỉ ghi đè khi cần
    fun showFragment(tag:String,data: Any?,isBacked:Boolean)
    fun closeApp() {}
}