package com.ean.app.modules.friends.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class FollowRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKevinAllsrub: String? = MyApp.getInstance().resources.getString(R.string.lbl_kevin_allsrub)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourEFriendsOn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_e_friends_on)

)
