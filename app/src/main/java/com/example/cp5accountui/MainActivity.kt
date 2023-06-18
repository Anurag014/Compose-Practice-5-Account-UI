package com.example.cp5accountui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cp5accountui.ui.theme.CP5AccountUITheme
import javax.crypto.ShortBufferException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(content = {
                items(getCategoryList()) { item ->
                    ShowAccount(painter = item.img, title = item.title, subtitle = item.subtitle)
            }
        })
    }
}

@Composable
fun ShowAccount(
    painter: Int,
    title: String,
    subtitle: String
) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(painter = painterResource(id = painter),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(40.dp)
                    .weight(0.2f)
            )
            ItemDescription(title = title, subtitle = subtitle, modifier = Modifier.weight(0.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column (modifier = modifier){
        Text(text = title,
            style = MaterialTheme.typography.h6
        )
        Text(text = subtitle,
            style = TextStyle(letterSpacing = 2.sp),
            fontSize = 12.sp,
            fontWeight = FontWeight.W200
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.icons8_person_24, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.icons8_person_24, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.icons8_person_24, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.icons8_person_24, "DevOps", "Development CI, CD, etc"))
    list.add(Category(R.drawable.icons8_person_24, "AI & ML", "Basics Artificial Intelligence"))
    list.add(Category(R.drawable.icons8_person_24, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.icons8_person_24, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.icons8_person_24, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.icons8_person_24, "DevOps", "Development CI, CD, etc"))
    list.add(Category(R.drawable.icons8_person_24, "AI & ML", "Basics Artificial Intelligence"))
    list.add(Category(R.drawable.icons8_person_24, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.icons8_person_24, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.icons8_person_24, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.icons8_person_24, "DevOps", "Development CI, CD, etc"))
    list.add(Category(R.drawable.icons8_person_24, "AI & ML", "Basics Artificial Intelligence"))
    return list
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CP5AccountUITheme {

    }
}}