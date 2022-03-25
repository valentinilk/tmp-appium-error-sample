package com.valentinilk.bssample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.valentinilk.bssample.databinding.ContentBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContentBinding.inflate(layoutInflater).apply {
            textView.text = "Second Activity"
        }
        setContentView(binding.root)
    }
}
