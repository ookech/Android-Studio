package com.billy.markethub.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.billy.markethub.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController
){

    Column(
      modifier = Modifier.fillMaxSize()

    ) {
        TopAppBar(
            title = { Text(text= "Home") },
            navigationIcon = {
                IconButton(
                    onClick = {}  
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )

                }
            },
            actions = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications"
                    )}
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "ShoppingCart"
                    )}
                IconButton(
                    onClick = {
                        navController.navigate(ROUT_INTENT)
                    }) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Share"
                    )}

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Black,
                navigationIconContentColor = Color.Black,
                titleContentColor = Color.Black,
                actionIconContentColor = Color.Black,
            )
        ) //End Of Top App Bar








      

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}