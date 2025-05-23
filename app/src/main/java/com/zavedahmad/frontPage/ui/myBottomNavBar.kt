package com.zavedahmad.frontPage.ui

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


data class navBarItem(
    val icon: ImageVector,
    val selectedIcon: ImageVector,

    val label: String,
    val ScreenName: String
)

@Composable
fun MyBottomNavigationBar(navController: NavController) {

    var selected = remember { mutableStateOf(0) }
    val bottomBarItemsList = listOf(
        navBarItem(

            icon = Icons.Outlined.AccountCircle,
            selectedIcon = Icons.Default.AccountCircle,

            label = "Zaved",
            ScreenName = "Main"

        ),
        navBarItem(
            icon = Icons.Outlined.Info,
            selectedIcon = Icons.Default.Info,

            label = "About Me",
            ScreenName = "AboutMeScreen"

        )
    )
    NavigationBar() {
        for (x in 0..bottomBarItemsList.size - 1) {

            NavigationBarItem(
                label = { Text(bottomBarItemsList[x].label) },
                selected = x == selected.value,

                onClick = {
                    if(selected.value != x){
                    navController.navigate(bottomBarItemsList[x].ScreenName)
                    selected.value = x}
                },

                icon = {
                    if (x == selected.value) {
                        val icon = bottomBarItemsList[x].selectedIcon
                        Icon(icon, contentDescription = "home")
                    } else {
                        val icon = bottomBarItemsList[x].icon
                        Icon(icon, contentDescription = "home")
                    }
                })
        }

    }
}