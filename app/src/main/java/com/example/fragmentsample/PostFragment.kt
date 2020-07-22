package com.example.fragmentsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.post_fragment.*

class PostFragment : Fragment(R.layout.post_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailBtnClick()
    }

    private fun detailBtnClick() {
        detail_btn.setOnClickListener {
            (activity as MainActivity).setDetailFragment()
        }
    }
}