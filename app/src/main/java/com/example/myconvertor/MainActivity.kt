package com.example.myconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myconvertor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationViewActivity.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.button_size -> {
                    navigateTo(SizesFragment())
                    true
                }
                R.id.button_weight -> {

                    true
                }
                R.id.button_velocity -> {

                    true
                }
                R.id.button_volume -> {

                    true
                }
                R.id.button_force -> {

                    true
                }

                else -> true
            }
        }
        binding.bottomNavigationViewActivity.selectedItemId = R.id.button_size
    }

    fun navigateTo(fragment: Fragment) {
          supportFragmentManager.beginTransaction().replace(R.id.containerActivity, fragment).commit()

    }
}