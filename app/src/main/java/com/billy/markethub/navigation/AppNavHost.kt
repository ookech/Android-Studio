package com.billy.markethub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.billy.markethub.ui.screens.auth.LoginScreen
import com.billy.markethub.ui.screens.auth.RegisterScreen
import com.billy.markethub.ui.screens.home.HomeScreen
import com.billy.markethub.ui.screens.i.Intentscreen
import com.billy.markethub.ui.screens.onboarding.onboardingscreen
import com.billy.markethub.ui.screens.payment.PaymentScreen
import com.billy.markethub.ui.screens.scarffold.ScarffoldScreen
import com.billy.markethub.ui.screens.services.ServiceScreen
import com.billy.markethub.ui.screens.splash.SplashScreen
import com.udeh.markethub.ui.screens.about.AboutScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentScreen(navController)
        }
        composable(ROUT_ONBOARDING) {
            onboardingscreen(navController)
        }
        composable(ROUT_SERVICES) {
            ServiceScreen(navController)
        }
        composable(ROUT_INTENT) {
            Intentscreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCARFFOLD) {
            ScarffoldScreen(navController)
        }













    }
}