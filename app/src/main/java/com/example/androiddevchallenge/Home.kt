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

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage
import dev.chrisbanes.accompanist.insets.navigationBarsPadding

@Composable
fun Home() {
    Scaffold(
        bottomBar = { BottomNavBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(24.dp)
                        .background(color = Color.Transparent),
                    tint = MaterialTheme.colors.onPrimary
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        modifier = Modifier.fillMaxWidth(),
        isFloatingActionButtonDocked = true,
    ) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxSize()
                    .verticalScroll(state = rememberScrollState()),

            ) {
                Spacer(modifier = Modifier.height(56.dp))
                Search()
                Spacer(modifier = Modifier.height(24.dp))
                FavoriteCollections()
                Spacer(modifier = Modifier.height(32.dp))
                Yoga()
                Spacer(modifier = Modifier.height(32.dp))
                YogaMind()
            }
        }
    }
}

@Composable
fun Fab() {
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .clip(CircleShape)
            .size(56.dp)
            .background(color = MaterialTheme.colors.primary)
    ) {
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .size(24.dp)
                .background(color = Color.Transparent),
            tint = MaterialTheme.colors.onPrimary
        )
    }
}

@Composable
fun BottomNavBar() {
    BottomNavigation(
        modifier = Modifier.navigationBarsPadding(left = false, right = false),
        elevation = 8.dp,
        backgroundColor = MaterialTheme.colors.background
    ) {
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Spa,
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(18.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.home),
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onBackground
                )
            }
        )

        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Profile Icon",
                    modifier = Modifier.size(18.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.profile),
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onBackground
                )
            }
        )
    }
}

@Composable
fun YogaMind() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = stringResource(id = R.string.align_your_mind),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.height(16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {

            alignMind.forEach { item ->
                YogaCardItem(imageUrl = item.imageUrl, text = item.title)
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

@Composable
fun Yoga() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = stringResource(id = R.string.align_your_body),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.height(16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {

            alignBody.forEach { item ->
                YogaCardItem(imageUrl = item.imageUrl, text = item.title)
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

@Composable
fun YogaCardItem(imageUrl: String, text: String) {
    Column(
        modifier = Modifier
            .width(88.dp)
            .height(112.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CoilImage(
            data = imageUrl,
            contentDescription = null,
            fadeIn = true,
            contentScale = ContentScale.Crop,
            loading = { },
            modifier = Modifier
                .clip(CircleShape)
                .size(88.dp)

        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onSurface, textAlign = TextAlign.Center,
            modifier = Modifier.paddingFromBaseline(top = 24.dp)
        )
    }
}

@Composable
fun FavoriteCollections() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Text(
            text = stringResource(id = R.string.favorite_collection),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.height(16.dp),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .horizontalScroll(state = rememberScrollState())
        ) {

            listOf(0, 2, 4).forEach { index ->
                val data1 = favItems[index]
                val data2 = favItems[index + 1]

                Column {
                    FavoriteCard(imageUrl = data1.imageUrl, text = data1.title)
                    Spacer(modifier = Modifier.height(8.dp))
                    FavoriteCard(imageUrl = data2.imageUrl, text = data2.title)
                }
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

@Composable
fun FavoriteCard(imageUrl: String, text: String) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(0.dp)
            .width(192.dp)
            .height(56.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
            CoilImage(
                data = imageUrl,
                contentDescription = null,
                fadeIn = true,
                contentScale = ContentScale.Crop,
                loading = { },
                modifier = Modifier
                    .size(56.dp)

            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onSurface
            )
        }
    }
}

@Composable
fun Search() {
    TextField(
        value = "",
        onValueChange = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.textFieldColors(textColor = MaterialTheme.colors.onSurface),
        placeholder = { PlaceHolder() }
    )
}

@Composable
fun PlaceHolder() {
    Row(modifier = Modifier.wrapContentWidth()) {
        Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = stringResource(id = R.string.search))
    }
}
