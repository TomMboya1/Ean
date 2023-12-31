package com.ean.app.modules.messages.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class RichardalvesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRichardAlves: String? = MyApp.getInstance().resources.getString(R.string.lbl_richard_alves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyBroWhereAre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_bro_where_are)

)
