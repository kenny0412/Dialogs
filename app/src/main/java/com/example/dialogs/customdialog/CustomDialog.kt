package com.example.dialogs.customdialog

import android.app.AlertDialog
import com.example.dialogs.MainActivity
import com.example.dialogs.R

class CustomDialog {
    internal fun customAlertDialog(activity: MainActivity) {
        val alertDialog: AlertDialog = activity.let {
            val builder = AlertDialog.Builder(it)
            builder.apply {
                setView(R.layout.custom_layout)
                setPositiveButton(activity.getString(R.string.ok)) { dialog, _ -> dialog.dismiss() }
            }
            builder.create()
        }
        alertDialog.show()
    }
}