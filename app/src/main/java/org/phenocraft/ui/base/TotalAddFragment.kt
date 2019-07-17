package org.phenocraft.ui.base

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.phenocraft.R


class TotalAddFragment : Fragment() {

    companion object {
        fun newInstance() = TotalAddFragment()
    }

    private lateinit var viewModel: TotalAddViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_total_add, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TotalAddViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
