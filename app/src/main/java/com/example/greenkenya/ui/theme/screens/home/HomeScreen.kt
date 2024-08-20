package com.example.greenkenya.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
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
import com.example.greenkenya.navigation.ROUT_ABOUT
import com.example.greenkenya.navigation.ROUT_DASHBOARD
import com.example.greenkenya.ui.theme.Blue
import com.example.greenkenya.ui.theme.DarkGreen
import com.example.greenkenya.ui.theme.Green
import com.example.greenkenya.ui.theme.Lavender
import com.example.greenkenya.ui.theme.DarkGreen


@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .paint(painterResource(id = R.drawable.greentriangle), contentScale = ContentScale.FillBounds),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

        Image(
            painter = painterResource(id = R.drawable.recycleicon),
            contentDescription ="home",
            modifier = Modifier
                .size(250.dp),
            contentScale = ContentScale.Crop

        )

        Text(
            text = "GreenKenya",
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif,
            color = DarkGreen

            )


        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text ="Tudumishe Mazingira Safi",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White

        )

        Spacer(modifier = Modifier.height(100.dp))

        Button(
            onClick = { navController.navigate(ROUT_DASHBOARD) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Green),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(text = "Get Started")
            
        }

    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

