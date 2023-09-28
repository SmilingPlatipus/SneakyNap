package com.platypusprod.sneakynap.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.platypusprod.sneakynap.R
import com.platypusprod.sneakynap.ui.theme.Background
import com.platypusprod.sneakynap.ui.theme.Blue
import com.platypusprod.sneakynap.ui.theme.Gold
import com.platypusprod.sneakynap.ui.theme.SneakyNapTheme


@Composable
fun SplashScreen() {
    Column(modifier = Modifier
        .background(Background)
        .requiredSize(
            LocalConfiguration.current.screenWidthDp.dp,
            LocalConfiguration.current.screenHeightDp.dp
        )
    )
    {
        Column {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp)
                    .requiredSize(42.dp)
            )
            Text(
                buildAnnotatedString {
                    withStyle(style = ParagraphStyle(lineHeight = 15.sp)) {
                        withStyle(style = SpanStyle(color = Blue)) {
                            append("Sneaky\n")
                        }
                        withStyle(style = SpanStyle(color = Gold)) {
                            append("Nap")
                        }
                    }
                },
                fontFamily = FontFamily(Font(R.font.aclonica_regular)),
                modifier = Modifier.padding(start = 20.dp),
                fontSize = 26.sp
            )
        }
        Column (verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize(1f)){
            Image(
                painter = painterResource(id = R.drawable.splash_image),
                contentDescription = null,
                modifier = Modifier
                    .padding(20.dp)
                    .width(LocalConfiguration.current.screenWidthDp.dp)
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.FillWidth
            )
            Text(
                stringResource(R.string.splash_screen_sentence),
                fontFamily = FontFamily(Font(R.font.aclonica_regular)),
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 70.sp
            )
            CustomButton(text = stringResource(R.string.splash_screen_button_text))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SneakyNapTheme {
        SplashScreen()
    }
}