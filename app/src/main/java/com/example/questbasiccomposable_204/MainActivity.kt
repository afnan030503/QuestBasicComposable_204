package com.example.questbasiccomposable_204

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.questbasiccomposable_204.ui.theme.QuestBasicComposable_204Theme

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
    Column {  }(
       horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangment = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        //title login
        Text()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_204Theme {
        Greeting("Android")
    }
}