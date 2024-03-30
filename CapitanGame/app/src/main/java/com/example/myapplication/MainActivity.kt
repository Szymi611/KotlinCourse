package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.lang.StrictMath.random
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CapitanGame()
                }
            }
        }
    }
    @Composable
    fun CapitanGame(){
        val treasuresFound = remember {mutableStateOf(0)}
        val direction = remember {mutableStateOf("North")}
        val stormOrTreasure = remember {mutableStateOf("")}

        Column{
            Text(text = "Treasures found: ${treasuresFound.value}")
            Text(text = "Treasures found: ${direction.value}")
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a treasure"
                }else{
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                }else{
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                }else{
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail South")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                }else{
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail North")
            }
            Text(text = "${stormOrTreasure.value}")
        }
    }
}
