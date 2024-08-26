package com.example.greenkenya.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greenkenya.ui.theme.screens.about.AboutScreen
import com.example.greenkenya.ui.theme.screens.admin.AdminScreen
import com.example.greenkenya.ui.theme.screens.contacts.ContactScreen
import com.example.greenkenya.ui.theme.screens.dashboard.DashboardScreen
import com.example.greenkenya.ui.theme.screens.home.HomeScreen
import com.example.greenkenya.ui.theme.screens.login.LoginScreen
import com.example.greenkenya.ui.theme.screens.register.RegisterScreen
import com.example.greenkenya.ui.theme.screens.report.ReportScreen
import com.example.greenkenya.ui.theme.screens.signup.SignupScreen
import com.example.greenkenya.ui.theme.screens.splash.SplashScreen
import com.example.greenkenya.ui.theme.screens.view.ViewSubscriptionScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ROUT_REGISTER) {
            RegisterScreen(navController = navController)
        }
        composable(ROUT_VIEW) {
            ViewSubscriptionScreen(navController = navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController = navController)
        }
        composable(ROUT_ADMIN) {
            AdminScreen(navController = navController)
        }
        composable(ROUT_REPORT) {
            ReportScreen(navController = navController)
        }




    }
}