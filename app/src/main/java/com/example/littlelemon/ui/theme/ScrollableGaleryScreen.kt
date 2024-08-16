package com.example.littlelemon.ui.theme

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

/*

Call the repeat function with the number
of your choice to create the rows.

Inside the trailing lambda of the repeat
function, add the Row.

Set the row modifier to fill the maximum width.

Also, set the horizontal alignment to space evenly.
 Repeat the GalleryCell two times
 to have two Cells in each Grid row.

Call the ScrollableGalleryScreen()
 in the AppScreen composable.

Run the app. The app will have a
vertical scrollable gallery of Dishes.*/
@Composable
fun ScrollableGalleryScreen(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState()) ) {
        repeat(10){
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())) {
                repeat(7){
                    GalleryCell()
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryCell(){
    Card(elevation = 16.dp,
        modifier = Modifier.padding(8.dp)){
        Box(modifier = Modifier
            .padding(8.dp)
            .requiredSize(180.dp, 180.dp)){
            Image(painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = "Greek Salad")

            Text(text = "Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp)
                    .background(color = Color.White),
            textAlign =  TextAlign.Start
            )


            Text(text = "$12.99",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .background(color = Color.White)
                    .align(Alignment.BottomEnd)
            )
        }
    }
}