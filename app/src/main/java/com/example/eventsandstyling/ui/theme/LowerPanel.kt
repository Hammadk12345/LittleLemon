package com.example.eventsandstyling

//import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    var count by remember {
        mutableStateOf(0)
    }
    Column {
        WeeklySpecial()
        MenuDish(count, {count++}, {count--})
    }
}


@Composable
fun WeeklySpecial(){
    // to be defined
    Card(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
    }
}


@Composable
fun MenuDish(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {
    // to be defined


    Card(modifier = Modifier.fillMaxHeight()) {

//    var count by remember {
//        mutableStateOf(0)
//    }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Column(){
                Text(
                    text = "Greek Salad",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "he famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = "$12.99",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )

            }
            Image(painter = painterResource(id = R.drawable.greeksalad), contentDescription = "Greek Salad Image")
        }

        Row() {

            IconButton(onClick = { onIncrement() }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }

            Text(
                text = "$count",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            IconButton(
                onClick = {
                    if (count > 0 )
                        onDecrement()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Remove"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
