package com.loskon.githubapi.base.extension.activity

import android.app.Activity
import android.app.ActivityManager
import android.os.Build

@Suppress("DEPRECATION")
fun Activity.installColorTaskDescription(color: Int) {
    setTaskDescription(
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            ActivityManager.TaskDescription(null, 0, color)
        } else {
            ActivityManager.TaskDescription(null, null, color)
        }
    )
}