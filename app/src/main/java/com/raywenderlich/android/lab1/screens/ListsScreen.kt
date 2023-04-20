package com.raywenderlich.android.lab1.screens

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import java.lang.reflect.Modifier

private val items=listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_coroutines,
            R.drawable.android_aprentice
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apprentice
        )
    ),
    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.core_data,
            R.drawable.ios_apprentice,
        )
    )
)

@Composable
fun ListScreen(){
    MyList()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyList(){

}

@Composable
fun ListItem(bookCategory:BookCategory,modifier: Modifier){

}

data class BookCategory(
    @StringRes
    val categoryResourceId:Int,
    val bookImageResources:List<Int>
    )





