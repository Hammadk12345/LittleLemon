@file:Suppress("DEPRECATION")

package com.example.eventsandstyling.ui.theme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eventsandstyling.R

@Composable
fun TopAppBar(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = "menu icon",
                modifier = Modifier.size(24.dp),
//                color = Color(Color.White)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemon_logo), 
            contentDescription = "Little lemon logo",
            modifier= Modifier.fillMaxWidth(0.5F)
                .padding(horizontal = 10.dp)
        )
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.cart),
                contentDescription = "cart icon",
                modifier = Modifier.size(24.dp)

            )
        }

    }
}

@Preview
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}