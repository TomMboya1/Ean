package com.ean.app.modules.pageview.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class PageViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHalifordLuxury: String? =
      MyApp.getInstance().resources.getString(R.string.msg_haliford_luxury_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_halford_hotel_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCommentValue: String? = null
)
