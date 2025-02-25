package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ){
        Card (
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .align(alignment = Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 15.dp,
            ),
            colors = CardDefaults.cardColors(Color(color = 0xFFFF0000))


        ) { }

        Card(
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .align(alignment = Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 15.dp,
            ),
            colors = CardDefaults.cardColors(Color(color = 0xFFFF0000))
        ) { }

        Column (
            modifier = Modifier
                .padding(32.dp),
            verticalArrangement = Arrangement.SpaceAround
        ){
            Column (
                modifier = Modifier
                    .padding(bottom = 50.dp)
            ){
                Text(
                    text = stringResource(br.senai.sp.jandira.mytrips.R.string.login),
                    fontSize = 45.sp,
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    text = stringResource(br.senai.sp.jandira.mytrips.R.string.obrigatorio),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column (
                horizontalAlignment = Alignment.End
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = {
                        Icon(
                            imageVector =Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFF008FFF)
                        )
                    },
                    label = {
                        Text(text = stringResource(br.senai.sp.jandira.mytrips.R.string.seu_Email))
                    }

                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .padding(bottom = 50.dp),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFF09487E)
                        )
                    },
                    label = {
                        Text(text = stringResource(br.senai.sp.jandira.mytrips.R.string.Senha))
                    }
                )

                Button(
                    modifier = Modifier
                        .padding(bottom = 50.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color(color = 0xFF09487E)
                    ),
                    onClick = {}
                ) {
                    Text(
                        text = stringResource((br.senai.sp.jandira.mytrips.R.string.sign))

                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }

                Row (){
                    Text(
                        text = stringResource(br.senai.sp.jandira.mytrips.R.string.signup),
                        fontSize = 13.sp,
                        color = Color(0xFFB5B9B9),
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = stringResource(br.senai.sp.jandira.mytrips.R.string.sign),
                        fontSize = 13.sp,
                        color = Color(0xFF09487E),
                        fontWeight = FontWeight.Bold


                    )
                }

            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
