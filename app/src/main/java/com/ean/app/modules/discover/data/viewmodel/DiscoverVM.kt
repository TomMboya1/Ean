package com.ean.app.modules.discover.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ean.app.modules.discover.`data`.model.DiscoverModel
import com.ean.app.modules.discover.`data`.model.ProfilesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DiscoverVM : ViewModel(), KoinComponent {
  val discoverModel: MutableLiveData<DiscoverModel> = MutableLiveData(DiscoverModel())

  var navArguments: Bundle? = null

  val profilesList: MutableLiveData<MutableList<ProfilesRowModel>> =
      MutableLiveData(mutableListOf())
}
