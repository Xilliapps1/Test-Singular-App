package com.example.test.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.R
import com.singular.sdk.Singular
import com.singular.sdk.SingularConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initsingularsdk()
    }










        private fun initsingularsdk() {
            CoroutineScope(Dispatchers.IO).launch {
                // Create a configuration object
                val config = SingularConfig("terafort_new_94135a02", "").withLoggingEnabled().withLogLevel(1)
                // Set up a deep links handler
                config.withSingularLink(
                    intent
                ) { params ->
                    val deeplink = params.deeplink
                    val passthrough = params.passthrough
                    val isDeferred = params.isDeferred
                    // Add deep link handling code here
                }
                Singular.init(this@MainActivity, config)
                Singular.event("Main Activity called")
            }
    }










}