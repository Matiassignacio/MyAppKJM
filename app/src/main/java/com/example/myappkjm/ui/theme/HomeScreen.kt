package com.example.myappkjm.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.myappkjm.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border
import androidx.compose.material3.MaterialTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("KJM Sports") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(text = "!Bienvenido!")
            Button(onClick = { /* acción futura */ }) {
                Text("Presióname")
            }
            Image(
                painter = painterResource(id = R.drawable.natacion),
                contentDescription = "Logo App",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape),
                    contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.deporte),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.natacion),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}