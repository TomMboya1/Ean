package com.ean.app.modules.splash.ui

import androidx.activity.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseActivity
import com.ean.app.databinding.ActivitySplashBinding
import com.ean.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_ACTIVITY"

  }
}
