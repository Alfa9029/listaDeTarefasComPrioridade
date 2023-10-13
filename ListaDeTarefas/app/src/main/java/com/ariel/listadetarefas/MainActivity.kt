package com.ariel.listadetarefas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ariel.listadetarefas.ui.theme.ListaDeTarefasTheme
import com.ariel.listadetarefas.view.listaTarefas
import com.ariel.listadetarefas.view.salvarTarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefasTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listaTarefas"){


                    composable(
                        route = "listaTarfeas"
                    ){
                        listaTarefas(navController)
                    }


                    composable(
                        route = "salvarTarefa"
                    ){
                        salvarTarefa(navController)
                    }
                }
            }
        }
    }
}
