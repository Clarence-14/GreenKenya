package com.example.greenkenya.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.greenkenya.R
import com.example.greenkenya.data.AuthViewModel
import com.example.greenkenya.navigation.ROUT_SIGNUP
import com.example.greenkenya.ui.theme.Blue
import com.example.greenkenya.ui.theme.Green

@Composable

fun LoginScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.black), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.recycleicon),
            contentDescription ="home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome to GreenKenya!",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            color = Green

        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text ="Please enter your credentials.",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White

        )
        Spacer(modifier = Modifier.height(20.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        // Function to determine visual transformation based on visibility
        val visualTransformation: VisualTransformation =
            if (passwordVisible) VisualTransformation.None
            else PasswordVisualTransformation()
        // Function to switch the password visibility
        fun togglePasswordVisibility() {
            passwordVisible = !passwordVisible
        }


        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = {Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Color.Green) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = {Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Green) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                val icon = if (passwordVisible) {
                    //Download a password show icon
                    painterResource(id = R.drawable.passwordshow)
                } else {
                    //Download a password hide icon
                    painterResource(id = R.drawable.passwordhide)
                }
                IconButton(onClick = { togglePasswordVisibility() }) {
                    Icon(painter = icon, contentDescription = null)
                }
            }


        )
        Spacer(modifier = Modifier.height(20.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {authViewModel.login(email, password)},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Green),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(text = ("Login"))

        }
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text ="Do not have an account? Create an Account.",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate(ROUT_SIGNUP) },
            textAlign = TextAlign.Center,
            color = Color.White

        )


    }

}




@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}
