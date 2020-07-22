package com.example.fragmentsample

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.replaceFragment(@IdRes containerId: Int, fragment: Fragment, isAddToBackStack: Boolean = false) {
    beginTransaction().apply {
        replace(containerId, fragment)
        if (isAddToBackStack) addToBackStack(fragment::class.java.simpleName)
    }.commitAllowingStateLoss()
}