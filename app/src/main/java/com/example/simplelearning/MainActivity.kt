package com.example.simplelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplelearning.ui.theme.SimplelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                 //   GreetingText(name = "Android")
            GreetingButton()

                }
            }
        }
    

@Composable
fun GreetingText(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!")
}
@Composable
fun GreetingButton()
{
    Button(onClick = { }) {
GreetingText(name = "Button")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        //GreetingText("Android")
    GreetingButton()
    }
