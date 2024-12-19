package com.example.simplelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplelearning.ui.theme.SimplelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                   GreetingText(name = "Android")
           // GreetingButton()

                }
            }
        }
    

@Composable
fun GreetingText(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = Modifier.height(240.dp).
    width(240.dp)
        .clickable(onClick =  {  })
        .padding(all = 50.dp),
//        style = TextStyle(color = Color.Green,
//            fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, fontSize = 20.sp)
        style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.ExtraBold
    )
   // Text(text = "Hello $name!", modifier = Modifier.size(width = 80.dp, height = 240.dp))
    //Text(text = "Hello $name!", modifier = Modifier.fillMaxSize())
   // Text(text = "Hello $name!", modifier = Modifier.fillMaxWidth(1f))
   //Text(text = "Hello $name!", modifier = Modifier.fillMaxHeight(0.5f))
}
//@Composable
//fun GreetingButton()
//{
//    Button(onClick = { }) {
//GreetingText(name = "Button")
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        GreetingText("Android")
   // GreetingButton()
    }
