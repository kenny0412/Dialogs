package com.example.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialogs.customdialog.CustomDialog
import com.example.dialogs.databinding.ActivityMainBinding
import com.example.dialogs.nativedialog.NativeDialog

class MainActivity : AppCompatActivity() {
    private val nativeDialog: NativeDialog by lazy {
        NativeDialog()
    }
    private val customDialog: CustomDialog by lazy {
        CustomDialog()
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setButtons()
    }

    private fun setButtons() {
        with(binding) {
            nativeBtn.setOnClickListener {
                nativeDialog.nativeAlertDialog(this@MainActivity)
            }
            customBtn.setOnClickListener {
                customDialog.customAlertDialog(this@MainActivity)
            }
            fragmentBtn.setOnClickListener {

            }
        }
    }
}