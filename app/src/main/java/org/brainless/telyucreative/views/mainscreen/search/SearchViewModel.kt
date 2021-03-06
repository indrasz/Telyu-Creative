package org.brainless.telyucreative.views.mainscreen.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.brainless.telyucreative.data.model.Creation
import org.brainless.telyucreative.data.remote.provider.FirestoreProvider

class SearchViewModel : ViewModel() {

    private val fireStore = FirestoreProvider()

    fun initData() : LiveData<ArrayList<Creation>> {
        val mutableData = MutableLiveData<ArrayList<Creation>>()

        fireStore.getCreationData().observeForever{ creationList ->
            mutableData.value = creationList
        }

        return mutableData
    }

    fun initDataSearch(search : String) : LiveData<ArrayList<Creation>> {
        val mutableData = MutableLiveData<ArrayList<Creation>>()

        fireStore.searchCreation(search).observeForever{ creationList ->
            mutableData.value = creationList
        }

        return mutableData
    }
}