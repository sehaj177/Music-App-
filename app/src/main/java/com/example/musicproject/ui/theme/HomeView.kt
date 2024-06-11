package com.example.musicproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicproject.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeView(){
    val categories = listOf( "Happy", "Gym" ,"Sad","Romantic","Wedding")
    val grouped = listOf<String>("New Release","Favorites","Top Rated").groupBy { it[0] }

    LazyColumn{
        grouped.forEach{
            stickyHeader {
                Text(text = it.value[0], modifier = Modifier.padding(16.dp))
                LazyRow{
                    items(categories){
                        cat->
                        BrowseItem(cat = cat, drawable = R.drawable.ic_music_browse)
                    }
                }
            }
        }
    }

}
@Composable
fun BrowseItem(cat: String, drawable:Int){
    Card(modifier = Modifier
        .padding(16.dp)
        .size(200.dp), border = BorderStroke(3.dp, Color.DarkGray)) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription =null )
        }
    }
}