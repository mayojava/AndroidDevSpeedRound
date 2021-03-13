/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object Destinations {
    const val Welcome = "welcome"
    const val Login = "login"
    const val Home = "home"
}

@Composable fun NavGraph(start: String = Destinations.Welcome) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = start
    ) {
        composable(Destinations.Welcome) {
            Welcome(navController)
        }
        composable(Destinations.Login) {
            Login(navController)
        }
        composable(Destinations.Home) {
            Home()
        }
    }
}
