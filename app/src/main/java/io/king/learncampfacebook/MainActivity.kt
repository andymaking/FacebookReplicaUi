package io.king.learncampfacebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class,
        ExperimentalMaterialApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Ui{
                startActivity(ProfileUpdate.newIntent(this,it))
            }
        }
    }
}


@ExperimentalFoundationApi
@ExperimentalPagerApi
@ExperimentalMaterialApi
@Composable
fun Ui(navigateToProfile: (Data) -> Unit) {
    var scaffoldState = rememberScaffoldState()
    Scaffold (
        topBar = {
                 TopBar()
        },
        scaffoldState = scaffoldState
    ){
        ContentView(navigateToProfile = navigateToProfile)
    }
}



