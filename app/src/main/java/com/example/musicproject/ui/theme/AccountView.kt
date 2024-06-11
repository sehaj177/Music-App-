package com.example.musicproject.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicproject.R

@Composable
fun AccountView(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {


        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Row() {
                Icon(imageVector = Icons.Default.AccountCircle , contentDescription = null , modifier = Modifier.padding(end = 8.dp) )
                Column {
                    Text(text = "Sehaj Singh")
                    Text(text = "@SehajSingh14")
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }

        Row(modifier = Modifier.padding(top = 16.dp)) {

            Icon(painter = painterResource(id = R.drawable.ic_music_note), contentDescription =null , modifier = Modifier.padding(end=8.dp))
            Text(text = "My Music")
        }
        Divider()
    }
}