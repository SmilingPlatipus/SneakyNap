package com.platypusprod.sneakynap.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.platypusprod.sneakynap.R
import com.platypusprod.sneakynap.ui.theme.Blue

@Composable
fun CustomButton(text: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(20.dp),
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = Blue))
    {
        Text(text = text)
    }

}

@Preview(showBackground = true)
@Composable
fun CustomButtonPreview(){
    CustomButton(text = "test")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UndercoverItem(text: String) {
    Card(
        modifier = Modifier
            .size(120.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 30.dp
                )
            ),
        elevation = CardDefaults.cardElevation(
        defaultElevation = 6.dp
    ),
        colors = CardDefaults.cardColors(containerColor = Blue),
        onClick = { /*TODO*/ }) {
        Text(
            text,
            fontFamily = FontFamily(Font(R.font.aclonica_regular)),
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, end = 20.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = Color.Black,
            fontSize = 15.sp,
            lineHeight = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun UndercoverItemPreview(){
    UndercoverItem(text = stringResource(R.string.employee_of_the_day))
}



