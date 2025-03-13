package com.example.soiffi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soiffi.ui.theme.SoiffiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoiffiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Soiffi",
                        version = "v0.3",
                        quote = "“Philosophy is an integral part of social and political life: not as the isolated speculations of remarkable individuals, but as both an effect and a cause of the character of the various communities in which different systems flourished.”",
                        reference = "Bertrand Russell",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, version: String, quote: String, reference: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$name",
            fontFamily = FontFamily.Serif,
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(500.dp)
        )
        Text(
            text = "$version",
            fontSize = 10.sp,
            textAlign = TextAlign.Right,
            modifier = Modifier.width(80.dp)
        )
        Text(
            text = "$quote",
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
            fontSize = 12.sp,
            modifier = modifier
        )
        Text(
            text = "$reference",
            fontSize = 10.sp,
            textAlign = TextAlign.Right,
            modifier = Modifier.width(350.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoiffiTheme {
        Greeting(
            name = "Soiffi",
            version = "v0.3",
            quote = "“Philosophy is an integral part of social and political life: not as the isolated speculations of remarkable individuals, but as both an effect and a cause of the character of the various communities in which different systems flourished.”",
            reference = "Bertrand Russell"
        )
    }
}