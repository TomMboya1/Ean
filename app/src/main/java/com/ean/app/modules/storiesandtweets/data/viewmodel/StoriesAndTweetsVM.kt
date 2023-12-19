package com.ean.app.modules.storiesandtweets.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ean.app.modules.storiesandtweets.`data`.model.Frame1RowModel
import com.ean.app.modules.storiesandtweets.`data`.model.LiveRowModel
import com.ean.app.modules.storiesandtweets.`data`.model.StoriesAndTweetsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesAndTweetsVM : ViewModel(), KoinComponent {
  val storiesAndTweetsModel: MutableLiveData<StoriesAndTweetsModel> =
      MutableLiveData(StoriesAndTweetsModel())

  var navArguments: Bundle? = null

  val lIVEList: MutableLiveData<MutableList<LiveRowModel>> = MutableLiveData(mutableListOf())

  val frameList: MutableLiveData<MutableList<Frame1RowModel>> = MutableLiveData(mutableListOf())
}
