package com.topaz.mvvm.vms


import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.topaz.mvvm.models.RepoModel

class MainViewModel : ViewModel() {
    var repoModel = RepoModel()
    val text = ObservableField<String>("initialized data")
    val isLoading = ObservableField<Boolean>(false)

    fun refresh() {
        isLoading.set(true)
        repoModel.refreshData(object : RepoModel.OnDataReadyCallback {
            override fun onStringLoaded(data: String) {
                text.set(data)
                isLoading.set(false)
            }
        })
    }
}