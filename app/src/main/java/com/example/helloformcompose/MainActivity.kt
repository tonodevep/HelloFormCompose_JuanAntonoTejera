package com.example.helloformcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.helloformcompose.ui.theme.HelloFormComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloFormComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HelloForm()
                }
            }
        }
    }
}

@Composable
fun HelloForm() {
    var name by rememberSaveable { mutableStateOf("") }
    var greeting by rememberSaveable { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TextField(
            value = name,
            onValueChange = {
                if (it.length <= 20) name = it
            },
            label = { Text("Nombre") },
            supportingText = { Text("${name.length}/20") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                keyboardController?.hide()
                greeting = if (name.isBlank()) {
                    "Introduce tu nombre"
                } else {
                    "👋 Hola, $name"
                }
            },
            enabled = name.isNotBlank(),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Saludar")
        }

        Text(
            text = greeting,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
