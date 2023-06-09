package com.radzhabov.aviatravel.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.R
import com.radzhabov.aviatravel.presentation.Screens
import com.radzhabov.aviatravel.presentation.theme.CalmBlue
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun ProfileCard(
    navController: NavController
) {

    Card(
        backgroundColor = CalmBlue,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(size = 20.dp),
    ) {
        Card(
            backgroundColor = Color.White,
            modifier = Modifier
                .padding(15.dp)
                .shadow(
                    elevation = 8.dp,
                    ambientColor = CalmBlue,
                    spotColor = DarkBlue
                ),
            shape = RoundedCornerShape(size = 15.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        colorFilter = ColorFilter.tint(Color.Red),
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_logout),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )

                    Spacer(modifier = Modifier.padding(12.dp))

                    Text(
                        text = "UserName",
                        fontSize = 24.sp,
                        color = DarkBlue,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 30.dp, bottom = 30.dp, start = 16.dp)
                    )

                }

                Button(
                    onClick = {

                    },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 16.dp)
                ) {
                    Text(
                        text = "Sign in",
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp),
                        fontSize = 18.sp
                    )
                }

                Spacer(modifier = Modifier.padding(16.dp))

                OutlinedButton(
                    onClick = {
                        navController.navigate(Screens.Settings.route)
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = Color.Red
                    ),
                    modifier = Modifier
                        .align(Alignment.End)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .alignBy(alignmentLine = FirstBaseline)
                    ) {

                        Text(
                            text = "Log out",
                            modifier = Modifier
                                .padding(top = 5.dp, bottom = 5.dp),
                            fontSize = 16.sp
                        )

                        Spacer(modifier = Modifier.padding(12.dp))

                        Image(
                            colorFilter = ColorFilter.tint(Color.Red),
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_logout),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }

            }

        }
    }
}
