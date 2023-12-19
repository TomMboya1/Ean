package com.ean.app.modules.invitefriends.ui

import android.view.View
import androidx.activity.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseActivity
import com.ean.app.databinding.ActivityInviteFriendsBinding
import com.ean.app.modules.invitefriends.`data`.model.InvitefriendsRowModel
import com.ean.app.modules.invitefriends.`data`.viewmodel.InviteFriendsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InviteFriendsActivity :
    BaseActivity<ActivityInviteFriendsBinding>(R.layout.activity_invite_friends) {
  private val viewModel: InviteFriendsVM by viewModels<InviteFriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val inviteFriendsAdapter =
    InviteFriendsAdapter(viewModel.inviteFriendsList.value?:mutableListOf())
    binding.recyclerInviteFriends.adapter = inviteFriendsAdapter
    inviteFriendsAdapter.setOnItemClickListener(
    object : InviteFriendsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InvitefriendsRowModel) {
        onClickRecyclerInviteFriends(view, position, item)
      }
    }
    )
    viewModel.inviteFriendsList.observe(this) {
      inviteFriendsAdapter.updateData(it)
    }
    binding.inviteFriendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerInviteFriends(
    view: View,
    position: Int,
    item: InvitefriendsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INVITE_FRIENDS_ACTIVITY"

  }
}
