package com.ean.app.modules.loginscreen.ui

import android.content.Intent
import androidx.activity.viewModels
import com.ean.app.R
import com.ean.app.appcomponents.base.BaseActivity
import com.ean.app.appcomponents.facebookauth.FacebookHelper
import com.ean.app.appcomponents.googleauth.GoogleHelper
import com.ean.app.databinding.ActivityLoginScreenBinding
import com.ean.app.modules.login.ui.LogInActivity
import com.ean.app.modules.loginscreen.`data`.viewmodel.LoginScreenVM
import com.ean.app.modules.signup.ui.SignUpActivity
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginScreenActivity : BaseActivity<ActivityLoginScreenBinding>(R.layout.activity_login_screen)
    {
  private val viewModel: LoginScreenVM by viewModels<LoginScreenVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginScreenVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnLogIn.setOnClickListener {
        val destIntent = LogInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.imageGoogle.setOnClickListener {
          googleLogin.login()
        }
        binding.btnSignUp.setOnClickListener {
          val destIntent = SignUpActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      companion object {
        const val TAG: String = "LOGIN_SCREEN_ACTIVITY"

      }
    }
