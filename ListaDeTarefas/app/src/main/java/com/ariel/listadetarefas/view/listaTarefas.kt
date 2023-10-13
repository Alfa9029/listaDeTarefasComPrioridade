package com.ariel.listadetarefas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ariel.listadetarefas.R
import com.ariel.listadetarefas.ui.theme.BLACK
import com.ariel.listadetarefas.ui.theme.GREEN
import com.ariel.listadetarefas.ui.theme.WHITE
import com.ariel.listadetarefas.ui.theme.YELLOW


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun listaTarefas(navController: NavController) {

    Scaffold(
        topBar = {
           TopAppBar(
               backgroundColor = YELLOW,
               title = {
                   Text(
                       text = "lista de tarefas",
                       fontSize = 18.sp,
                       fontWeight = FontWeight.Bold,
                       color = WHITE
                   )
               }
           )
        },
        backgroundColor = BLACK,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("salvarTarefa")
                },
                backgroundColor = GREEN
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(
                        id = R.drawable.ic_add),
                        contentDescription = "Ícone criar"
                )
            }
        }
    ) {

    }

}

