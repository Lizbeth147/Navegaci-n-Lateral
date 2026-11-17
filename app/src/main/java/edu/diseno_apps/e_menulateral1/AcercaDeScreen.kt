package edu.diseno_apps.e_menulateral1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AcercaDeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Acerca de",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "EMenuLateral1",
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Estudiante: Lizbeth Dayana Maria Martinez")

        Text(text = "Grupo: 4-A")

        Text(text = "Versión: 1.0")

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "EMenuLateral1 es una aplicación desarrollada con Jetpack Compose que permite explorar diferentes secciones mediante un menú de navegación lateral, facilitando la organización y el acceso a sus pantallas."
        )
    }
}
