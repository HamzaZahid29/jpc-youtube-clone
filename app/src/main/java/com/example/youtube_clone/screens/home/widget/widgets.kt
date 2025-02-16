package com.example.youtube_clone.screens.home.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.youtube_clone.R
import com.example.youtube_clone.ui.theme.DarkBackground
import com.example.youtube_clone.ui.theme.LightGray2
import com.example.youtube_clone.utils.AppAssetPaths


@Composable
fun VideoTile() {
    Image(
        painterResource(R.drawable.horizontaltest),
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp),
        contentDescription = "Thumbnail",
        contentScale = ContentScale.FillBounds

    )
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(Modifier.padding(all = 8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.testportrait),
                contentDescription = "Circular Avatar",
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape),
                contentScale = ContentScale.FillBounds

            )
            Spacer(Modifier.width(10.dp))
            Column(verticalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Revealing the all new BMW m5",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(Modifier.height(4.dp))
                Text("BMW  1.8M views  1 day ago", style = MaterialTheme.typography.labelSmall)
            }

        }
        IconButton(
            content = {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Search Icon"
                )
            },
            onClick = {},
        )
    }
    Spacer(Modifier.height(6.dp))
}

@Composable
fun CustomFilterChip(title: String, isActive: Boolean = false) {
    Box(
        Modifier
            .padding(horizontal = 4.dp)
            .background(if (isActive) White else LightGray2, shape = RoundedCornerShape(22))
            .padding(8.dp)
    ) {
        Text(
            title,
            style = if (isActive) MaterialTheme.typography.bodyMedium.copy(color = DarkBackground) else MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun CustomFilterChipIcon(isActive: Boolean = false) {
    Box(
        Modifier
            .padding(horizontal = 8.dp)
            .background(if (isActive) White else LightGray2, shape = RoundedCornerShape(22))
            .padding(8.dp)
    ) {
        Icon(
            painterResource(AppAssetPaths.ExploreLogo),
            contentDescription = "Youtube Short Icon",
            modifier = Modifier.size(18.dp),
            tint = DarkBackground
        )
    }
}

@Composable
fun ImageWithText(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .padding(4.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.testportrait),
            contentDescription = "Image",
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(14.dp)),
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = text,
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.BottomStart),
            color = White // Ensure visibility over the image
        )
    }
}