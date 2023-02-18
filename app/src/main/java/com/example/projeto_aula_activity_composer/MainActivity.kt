package com.example.projeto_aula_activity_composer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.projeto_aula_activity_composer.ui.theme.Projeto_Aula_Activity_ComposerTheme
import java.util.jar.Attributes.Name

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_Aula_Activity_ComposerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {


                    AppNameESubName( "My first Composer app",  "Primeiro mesmo !!!");
                }
            }
        }
    }
}

@Composable
fun AppNameESubName(appName: String, appSubName: String) {
    Column{
        Text(text = "$appName!" , fontSize = 26.sp, textAlign = TextAlign.Center);
        Text(text = "$appSubName" , fontSize = 16.sp);
        
    }
}
//PascalCase
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Projeto_Aula_Activity_ComposerTheme {
        AppNameESubName("My first composer App","Primeiro mesmo !!!");
    }
}