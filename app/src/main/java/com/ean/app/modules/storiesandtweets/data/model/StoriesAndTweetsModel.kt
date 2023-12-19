package com.ean.app.modules.storiesandtweets.`data`.model

import com.ean.app.R
import com.ean.app.appcomponents.di.MyApp
import kotlin.String

data class StoriesAndTweetsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStories: String? = MyApp.getInstance().resources.getString(R.string.lbl_stories)

)
