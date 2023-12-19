package com.ean.app.modules.storiesandtweets.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class LiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_post)

)
