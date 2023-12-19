package com.ean.app.modules.foryou.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class ForYouModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLucasAnna: String? = MyApp.getInstance().resources.getString(R.string.lbl_lucas_anna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeThousandFiveHundredSixtee: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_35_16)

)
