package com.ean.app.modules.dailynewtabcontainer.ui

import androidx.activity.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseActivity
import com.ean.app.databinding.ActivityDailyNewTabContainerBinding
import com.ean.app.modules.dailynewtabcontainer.`data`.viewmodel.DailyNewTabContainerVM
import com.ean.app.modules.search.ui.SearchActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class DailyNewTabContainerActivity :
    BaseActivity<ActivityDailyNewTabContainerBinding>(R.layout.activity_daily_new_tab_container) {
  private val viewModel: DailyNewTabContainerVM by viewModels<DailyNewTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dailyNewTabContainerVM = viewModel
    val adapter = DailyNewTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabBarView.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabBarView) { tab, position ->
      tab.text = DailyNewTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.searchViewSearch.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "DAILY_NEW_TAB_CONTAINER_ACTIVITY"

    }
  }
