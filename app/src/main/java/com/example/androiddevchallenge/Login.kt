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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun Login(onLoginClicked: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        Box(modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colors.background)) {
            Image(
                painter = painterResource(id = R.drawable.ic_login),
                contentDescription = "Login Icon",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(176.dp))

                Text(
                    text = stringResource(id = R.string.log_in),
                    style = MaterialTheme.typography.h1,
                    color = MaterialTheme.colors.onBackground
                )

                Spacer(modifier = Modifier.height(32.dp))

                TextField(
                    value = "",
                    onValueChange = { /*TODO*/ },
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .height(56.dp)
                        .fillMaxWidth(),
                    textStyle = MaterialTheme.typography.body1,
                    placeholder = { Text(text = "Email address") },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = MaterialTheme.colors.onSurface,
                        backgroundColor = MaterialTheme.colors.surface
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = "",
                    onValueChange = { /*TODO*/ },
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .height(56.dp)
                        .fillMaxWidth(),
                    textStyle = MaterialTheme.typography.body1,
                    placeholder = { Text(text = "Password") },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.surface,
                        textColor = MaterialTheme.colors.onSurface
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = { onLoginClicked() },
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(72.dp)
                ) {
                    Text(text = stringResource(id = R.string.log_in))
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        append("Don't have an account? Sign up")
                        addStyle(style = SpanStyle(textDecoration = TextDecoration.Underline), 23, 30)
                    },
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onBackground
                )
            }
        }
    }
}
