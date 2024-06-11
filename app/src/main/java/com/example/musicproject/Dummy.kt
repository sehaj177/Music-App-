package com.example.musicproject

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_subscribe,"Playlist"),
    Lib(R.drawable.baseline_mic_24,"Artists"),
    Lib(R.drawable.album_ic,"Album"),
    Lib(R.drawable.ic_music_note,"Songs"),
    Lib(R.drawable.ic_genre,"Genre")
)