package org.phenocraft.ui.clone

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.phenocraft.R


class CloneNewFragment : Fragment() {

    companion object {
        fun newInstance() = CloneNewFragment()
    }

    private lateinit var viewModel: CloneNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_clone_new, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CloneNewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
