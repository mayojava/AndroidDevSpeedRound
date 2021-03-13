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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val DarkColorPalette = darkColors(
    primary = Color.White,
    background = Color(0xff333333),
    onPrimary = Color(0xff333333),
    onBackground = Color(0xffF0EAE2),
    secondary = Color(0xffE1AFAF),
    surface = Color(0xffFFFFFF).copy(alpha = 0.15f),
    onSecondary = Color(0xff333333),
    onSurface = Color(0xffFFFFFF).copy(alpha = 0.8f)
)

val LightColorPalette = lightColors(
    primary = Color(0xff333333),
    background = Color(0xffF0EAF2),
    onPrimary = Color.White,
    onBackground = Color(0xff655454),
    secondary = Color(0xff886363),
    surface = Color(0xffFFFFFF).copy(alpha = 0.85f),
    onSecondary = Color(0xffFFFFFF),
    onSurface = Color(0xff333333).copy(alpha = 0.80f),
)
