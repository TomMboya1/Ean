package com.ean.app.modules.messages.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class MessagesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)

)
