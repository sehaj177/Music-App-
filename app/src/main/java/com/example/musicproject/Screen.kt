package com.example.musicproject

import androidx.annotation.DrawableRes

sealed class Screen(
    val title : String,
    val route : String

) {
    sealed class BottomScreen(val bTitle: String, val bRoute:String , @DrawableRes val icon :Int): Screen(bTitle,bRoute){
        object Home: BottomScreen(
            "Home",
            "home",
            R.drawable.ic_music_note
        )
        object Library: BottomScreen(
            "Library",
            "library",
            R.drawable.ic_music_library
        )
        object Browse: BottomScreen(
            "Browse",
            "browse",
            R.drawable.ic_music_browse
        )
    }


    sealed class DrawerScreen(val dTitle: String, val dRoute:String , @DrawableRes val icon :Int) : Screen(dTitle,dRoute){
        object Account : DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )
        object Subscription : DrawerScreen(
            "Subscription",
            "Subscribe",
            R.drawable.ic_subscribe
        )
        object AddAccount : DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.baseline_person
        )
    }

}
val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)
val screensInBottom = listOf(
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Library
)