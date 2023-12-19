package com.ean.app.modules.splash.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSocial: String? = MyApp.getInstance().resources.getString(R.string.lbl_social)

)
