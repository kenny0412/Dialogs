package com.example.dialogs.nativedialog

import android.app.AlertDialog
import com.example.dialogs.MainActivity
import com.example.dialogs.R

class NativeDialog {

    internal fun nativeAlertDialog(activity: MainActivity) {
        val alertDialog: AlertDialog? = activity.let {
            val builder = AlertDialog.Builder(it)
            builder.apply {
                setTitle(activity.getString(R.string.title_native_dialog)).setMessage(activity.getString(R.string.message_native_dialog))
                setPositiveButton(activity.getString(R.string.ok)) { dialog, _ -> dialog.dismiss() }
            }
            builder.create()
        }
        alertDialog?.show()
    }
}