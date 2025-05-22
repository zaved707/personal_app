package com.zavedahmad.frontPage

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zavedahmad.frontPage.ui.theme.ZavedAhmadTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ZavedAhmadTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val fontSize = 30
    Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            onClick = {}, modifier = Modifier.fillMaxWidth(
                0.8f
            )
        ) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)) {
                Text(
                    text = "Hello im zaved ahmad!",
                    modifier = Modifier.padding(10.dp),
                    fontSize = fontSize.sp,
                    lineHeight = fontSize.sp
                )

            }

        }
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(R.drawable.zavedahmad),
            contentDescription = "gawk gawk",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .clickable(onClick = {})
        )
        Spacer(modifier = Modifier.height(30.dp))
        Column(modifier = Modifier.fillMaxWidth(0.6f)) {
            Text(
                "We are what we repeatedly do. Excellence, then, is not an act, but a habit.",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light
            )
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
            ) {
                Text("-Aristotle")
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row (modifier = Modifier.fillMaxWidth(0.8f), horizontalArrangement = Arrangement.SpaceBetween){
            Image(
                modifier = Modifier.size(100.dp).clip(CircleShape).clickable(onClick = {}),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.github),
                contentDescription = "dragon"
            )
            Image(
                modifier = Modifier.size(100.dp).clip(CircleShape).clickable(onClick = {}),
                contentScale = ContentScale.Fit,
                painter = painterResource(R.drawable.icons8_instagram),
                contentDescription = "dragon"
            )
        }



    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ZavedAhmadTheme {
        Greeting()
    }
}