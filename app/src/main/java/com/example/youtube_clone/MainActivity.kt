package com.example.youtube_clone

import YouTubeCloneTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.youtube_clone.utils.AppAssetPaths
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color.Companion.Transparent
import com.example.youtube_clone.screens.home.HomeContent


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YouTubeCloneTheme {
                var selectedItem by remember { mutableStateOf(0) }

                val items = listOf("Home", "Shorts", "Create", "Subscription", "You")

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painterResource(AppAssetPaths.YoutubeLogo),
                                        contentDescription = "Youtube Logo",
                                        modifier = Modifier.size(28.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Youtube")
                                }
                            },
                            actions = {
                                IconButton(
                                    content = {
                                        Icon(
                                            painterResource(AppAssetPaths.CastLogo),
                                            contentDescription = "Search Icon"
                                        )
                                    },
                                    onClick = {},
                                )
                                IconButton(
                                    content = {
                                        Icon(
                                            imageVector = Icons.Outlined.Notifications,
                                            contentDescription = "Search Icon"
                                        )
                                    },
                                    onClick = {},
                                )
                                IconButton(
                                    content = {
                                        Icon(
                                            imageVector = Icons.Default.Search,
                                            contentDescription = "Cast Icon"
                                        )
                                    },
                                    onClick = {},
                                )
                            }
                        )
                    },
                    bottomBar = {
                        NavigationBar(
                            tonalElevation = 0.dp,
                            containerColor = Transparent,
                            contentColor = Color.Black
                        ) {

                            items.forEachIndexed { index, item ->
                                NavigationBarItem(
//                                    icon =  {
//                                        // You can replace this with Icons or custom SVGs
//                                        Icon(
//                                            imageVector = when (item) {
//                                                "Home" -> Icons.Default.Home
//                                                "Search" -> Icons.Default.Search
//                                                "Create" -> Icons.Outlined.Add
//                                                else -> Icons.Default.Person
//                                            },
//                                            contentDescription = item
//                                        )
//                                    },
                                    icon = {
                                        when (item) {
                                            "Home" -> Icon(
                                                imageVector = Icons.Default.Home,
                                                contentDescription = item
                                            )
                                            "Shorts" -> Icon(
                                                painter = painterResource(AppAssetPaths.ShortOutlinedIcon),
                                                tint = White,
                                                contentDescription = item
                                            )
                                            "Create" -> Icon(
                                                painter = painterResource(AppAssetPaths.CreateOutlinedIcon),
                                                tint = White,
                                                contentDescription = item,
                                                modifier = Modifier.size(32.dp)
                                            )
                                            "Subscription" -> Icon(
                                                painter = painterResource(AppAssetPaths.ShortOutlinedIcon),
                                                tint = White,
                                                contentDescription = item,
                                            )
                                            "You" -> Icon(
                                                imageVector = Icons.Default.Person,
                                                contentDescription = item
                                            )
                                        }
                                    },
                                    label = {
                                        if (index != 2) Text(item) else null

                                    },
                                    selected = selectedItem == index,
                                    onClick = { selectedItem = index },
                                    colors = NavigationBarItemDefaults.colors(
                                        indicatorColor = Color.Transparent
                                    )
                                )
                            }
                        }
                    },
                    modifier = Modifier.fillMaxSize(),

                ) { innerPadding ->
                    HomeContent(Modifier.padding(innerPadding))
                }

            }
        }
    }
}
