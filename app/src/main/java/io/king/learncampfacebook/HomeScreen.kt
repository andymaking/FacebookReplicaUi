package io.king.learncampfacebook

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(navigateToProfile: (Data) -> Unit){
    val datas = remember {
        DataProvider.dataList
    }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp)
    ){
        items(
            datas,
            itemContent = {
                Active(data = it, navigateToProfile)
            }
        )
    }
}