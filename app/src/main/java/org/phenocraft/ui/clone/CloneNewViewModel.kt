package org.phenocraft.ui.clone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import org.phenocraft.data.model.Clone

class CloneNewViewModel : ViewModel() {

    private val clones: MutableLiveData<List<Clone>> by lazy {
        MutableLiveData<List<Clone>>().also {
            loadClones()
        }
    }

    fun getClones(): LiveData<List<Clone>> {
        return clones;
    }

    private fun loadClones() {

        //Todo Callback end


    }



}
