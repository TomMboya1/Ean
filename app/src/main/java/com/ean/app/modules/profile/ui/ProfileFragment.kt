package com.ean.app.modules.profile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseFragment
import com.ean.app.databinding.FragmentProfileBinding
import com.ean.app.modules.detailedprofile.ui.DetailedProfileActivity
import com.ean.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearProfileDetails.setOnClickListener {
      val destIntent = DetailedProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
