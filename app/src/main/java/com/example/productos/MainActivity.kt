package com.example.productos

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.productos.ui.theme.ProductosTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Instagram()

        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun InterfazProducto() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(8.dp))
                .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(8.dp))
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {

                Column(
                    modifier = Modifier
                        .size(32.dp)
                        .border(1.dp, Color.LightGray)
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.corazon), // Tu imagen corazon.png
                        contentDescription = "Favorito", modifier = Modifier.fillMaxSize()
                    )
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mockupshirt),
                    contentDescription = "camiseta simon",
                    modifier = Modifier.fillMaxHeight()
                )
            }


            Spacer(modifier = Modifier.height(16.dp))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFFEEEEEE))
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Text(
                    text = "Camiseta de Algodón - Ich Bin Horny (Marca Personal)",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )


                Text(
                    text = "$60.000",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF4CAF50)
                )

                Spacer(modifier = Modifier.height(8.dp))


                Text(
                    text = "Descripción.", fontSize = 14.sp, color = Color.Gray
                )
            }
        }


        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color(0xFF6750A4), RoundedCornerShape(24.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text("Editar", color = Color.White, fontWeight = FontWeight.Medium)
            }


            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color.Red, RoundedCornerShape(24.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Eliminar", color = Color.White, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Tutorial() {
    //se hizo una columna la cual tiene una imagen y tres textos
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image( //la imagen se seleccionó de una web de imagenes gratis
            painter = painterResource(id = R.drawable.oceanbanner),
            contentDescription = "playa",
            modifier = Modifier.fillMaxWidth(), //llenar todo el ancho
            contentScale = ContentScale.FillWidth //que la imagen pueda ajustarse bien en todo el ancho
        )

        Text(
            text = "Jetpack Compose tutorial", fontSize = 24.sp,//especificaciones
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Jetpack Compose is ...",
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify //asi se justifica el texto
        )


        Text(
            text = "In this tutorial...",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun Instagram() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.oceanbanner),
            contentDescription = "foto perfil", modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Pepito Mitocondria",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(all = 24.dp)
        )

        Text(
            text = "Desarrollador Android",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 24.dp, end = 24.dp)
        )


    }

}