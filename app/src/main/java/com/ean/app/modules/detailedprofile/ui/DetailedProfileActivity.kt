package com.ean.app.modules.detailedprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseActivity
import com.ean.app.databinding.ActivityDetailedProfileBinding
import com.ean.app.modules.detailedprofile.`data`.viewmodel.DetailedProfileVM
import kotlin.String
import kotlin.Unit

class DetailedProfileActivity :
    BaseActivity<ActivityDetailedProfileBinding>(R.layout.activity_detailed_profile) {
  private val viewModel: DetailedProfileVM by viewModels<DetailedProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailedProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAILED_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailedProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
