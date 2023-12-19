package com.ean.app.modules.loginscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ean.app.modules.loginscreen.`data`.model.LoginScreenModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.json.JSONObject
import org.koin.core.KoinComponent

class LoginScreenVM : ViewModel(), KoinComponent {
  val loginScreenModel: MutableLiveData<LoginScreenModel> = MutableLiveData(LoginScreenModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
