package com.playground.navigator

import android.content.Context

interface Navigator {

    fun navigateToAuth(context: Context)
    fun navigateToHome(context: Context)

}