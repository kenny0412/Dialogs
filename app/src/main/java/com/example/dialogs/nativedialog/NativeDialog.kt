package com.example.dialogs.nativedialog

import android.app.AlertDialog
import com.example.dialogs.MainActivity

class NativeDialog {

    internal fun nativeAlertDialog(activity: MainActivity) {
        val builder: AlertDialog.Builder = activity.let {
            AlertDialog.Builder(it)
        }
        builder.setTitle("Test native").setMessage("Hi I'm a native dialog.")

        builder.create().show()
    }
}