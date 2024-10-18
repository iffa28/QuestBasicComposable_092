package com.example.project2kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2kotlin.ui.theme.Project2KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Project2KotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BasicCompose(modifier = Modifier.padding(innerPadding))
                }
        }
    }
}

@Preview(showBackground = true)

@Composable
fun BasicCompose(modifier: Modifier = Modifier){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize())
    {
        Text(text = "Indonesia",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Magenta
            ),
        )

        Text(text = "0",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            ),
        )

        Image(painter = painterResource(id =R.drawable.fifa),
            contentDescription = null ) //atau ""

        Text(text = "Nama:",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF001F3F),
            ),
        )

        Text(text = "Iffatuz Zahra",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3A6D8C),
            ),
        )

        Text(text = "20220140092",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6A9AB0),
            ),
        )

        Image(painter = painterResource(id =R.drawable.iffa),
            contentDescription = null,
            modifier = Modifier
                .size(400.dp) // Mengatur ukuran gambar menjadi 150dp x 150dp)
        )

    }


}}

