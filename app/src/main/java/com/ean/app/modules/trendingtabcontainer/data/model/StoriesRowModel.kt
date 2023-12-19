package com.ean.app.modules.trendingtabcontainer.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class StoriesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoy: String? = MyApp.getInstance().resources.getString(R.string.lbl_roy)

)
