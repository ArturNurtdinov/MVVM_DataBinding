package com.topaz.mvvm.models

import android.os.Handler

class RepoModel {
    fun refreshData(onDataReadyCallback: OnDataReadyCallback) {
        Handler().postDelayed({ onDataReadyCallback.onStringLoaded("new data") }, 2000)
    }

    interface OnDataReadyCallback {
        fun onStringLoaded(data: String)
    }
}