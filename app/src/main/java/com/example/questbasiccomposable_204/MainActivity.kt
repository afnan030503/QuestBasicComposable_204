package com.example.questbasiccomposable_204

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_204.ui.theme.QuestBasicComposable_204Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_204Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(
       horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Transparent)
    )
    {

        Text(
            "Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Ini adalah halaman login",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic,
            color = Color.Black
        )

        Spacer(modifier = Modifier.padding(1.dp))
        Image(

            painter = painterResource(id = R.drawable.logo_universitas),
            contentDescription = "Logo Universitas",
            modifier = Modifier
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.padding(1.dp))
        Text(
            text = "Nama",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = "Muhammad Afnan Maulidi",
            fontSize = 20.sp,
            color = Color.DarkGray,
        )

        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "20220140204",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.padding(4.dp))
        Image(
            painter = painterResource(id = R.drawable.gas),
            contentDescription = "Foto Mahasiswa",
            modifier = Modifier
                .fillMaxWidth()
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_204Theme {
        BasicColumn()
    }
}