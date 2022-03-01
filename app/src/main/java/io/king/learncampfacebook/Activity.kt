package io.king.learncampfacebook

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Active(data: Data) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White).padding(vertical = 5.dp)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp).padding(horizontal = 5.dp)) {
            Image(
                painter = painterResource(id = data.profPic),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 0.dp)
                    .size(50.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillBounds
            )
            Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.Start, modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 5.dp)
                .padding(horizontal = 10.dp)) {
                Text(text = data.name, fontFamily = FontFamily.Default, fontWeight = FontWeight.ExtraBold, fontSize = 22.sp)
                Row(horizontalArrangement = Arrangement.Start) {
                    Text(text = data.times, color = Color.DarkGray)
                    Icon(painter = painterResource(id = R.drawable.globe), tint = Color.DarkGray, contentDescription = null, modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .size(15.dp))
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth(), verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.End) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.more), contentDescription = null, modifier = Modifier.size(30.dp), tint = Color.DarkGray)
                }
            }
        }
        Text(text = data.message, fontSize = 18.sp, maxLines = 5, modifier = Modifier.padding(vertical = 10.dp).padding(horizontal = 5.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(modifier = Modifier
                .fillMaxWidth(),painter = painterResource(id = data.pictures), contentDescription = null, contentScale = ContentScale.FillWidth)
        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 5.dp)) {

        }
    }
}

@Preview
@Composable
fun DefaultPreviewer() {
    Active(
        Data(
            name = "Your Name Goes here",
            profPic = R.drawable.race,
            message = stringResource(R.string.message),
            pictures = R.drawable.glove,
            times = "45ins",
            comments = 30,
            views = "4K"
        )
    )
}