package com.example.greenkenya.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.greenkenya.R
import com.example.greenkenya.ui.theme.screens.home.HomeScreen

@Composable

fun AboutScreen(navController: NavController){


    Image(
        painter = painterResource(id = R.drawable.recycleicon),
        contentDescription ="home",
        modifier = Modifier
            .size(50.dp),
        contentScale = ContentScale.Crop

    )
    Spacer(modifier = Modifier.height(5.dp))
    Text(
        text = "Tudumishe Mazingira Safi",
        fontSize = 18.sp,
        fontFamily = FontFamily.Serif,
        color = Color.Black

    )
    Spacer(modifier = Modifier.height(20.dp))

}




@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())


}