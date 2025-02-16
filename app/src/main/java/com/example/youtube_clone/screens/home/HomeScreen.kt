package com.example.youtube_clone.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.youtube_clone.CustomFilterChip
import com.example.youtube_clone.CustomFilterChipIcon
import com.example.youtube_clone.ImageWithText
import com.example.youtube_clone.VideoTile
import com.example.youtube_clone.utils.AppAssetPaths

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier
            .padding(horizontal = 12.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(Modifier.horizontalScroll(rememberScrollState())) {
            CustomFilterChipIcon()
            CustomFilterChip("All", true)
            CustomFilterChip("Technology")
            CustomFilterChip("Racing")
            CustomFilterChip("Gaming")
            CustomFilterChip("Anime")
            CustomFilterChip("Programming")
        }
        Spacer(Modifier.height(18.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(AppAssetPaths.YoutubeShortsLogo),
                contentDescription = "Youtube Short Icon",
                modifier = Modifier.size(28.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text("Shorts", style = MaterialTheme.typography.titleLarge)
        }
        Spacer(Modifier.height(8.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .height(280.dp)
        ) {
            ImageWithText("Fastest car in the world 480KMPH", modifier = Modifier.weight(1f))
            ImageWithText(
                "Tesla's new model roadster s403e breaks world record ",
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(Modifier.height(8.dp))
        VideoTile()
        VideoTile()
        VideoTile()
        VideoTile()
        VideoTile()
        VideoTile()
    }
}
