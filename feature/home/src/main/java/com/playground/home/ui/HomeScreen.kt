package com.playground.home.ui

// import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.playground.ui.components.VImageViewClick
import com.playground.ui.components.VImageViewPhotoUrl
import com.playground.ui.components.VTextRegular

@Composable
fun HomeScreen() {
    Scaffold(
            containerColor = Color.White,
            modifier = Modifier.fillMaxSize(),
            floatingActionButtonPosition = FabPosition.Center,
            floatingActionButton = {
                FloatingActionButton(
                        onClick = {},
                        containerColor = Color.Gray,
                        contentColor = Color.White,
                        shape = CircleShape,
                        modifier = Modifier.size(60.dp)
                ) {
                    Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add",
                                modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                                "Scan QR",
                                style = TextStyle(fontSize = 10.sp),
                                textAlign = TextAlign.Center
                        )
                    }
                }
            }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp).fillMaxSize()) {
            SearchField()
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                    "Scan History",
                    style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
            )
            Spacer(Modifier.height(18.dp))

            val temp =
                    listOf(
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                            "https://storage.googleapis.com/sequre-web-staging/lpg-3kg_681829c7da5c0.jpg",
                    )

            SubItemList(temp)
        }
    }
}

@Composable
fun SearchField() {

    Card(modifier = Modifier.fillMaxWidth().clickable {}, colors = CardDefaults.cardColors()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            VImageViewClick(color = Color.Black, imageVector = Icons.Outlined.Search, onClick = {})
            VTextRegular(text = "Search by product")
        }
    }
}

@Composable
fun CardProduct(
        merchant: String,
        product: String,
        date: String,
        url: String,
) {
    Box(modifier = Modifier.padding(bottom = 16.dp)) {
        Row(
                modifier =
                        Modifier.fillMaxWidth()
                                .background(
                                        color = Color(0xffEAEAEA),
                                        shape = RoundedCornerShape(6.dp)
                                )
                                .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                    modifier =
                            Modifier.width(70.dp)
                                    .height(50.dp)
                                    .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(6.dp)
                                    )
                                    .padding(8.dp),
                    contentAlignment = Alignment.Center
            ) {
                VImageViewPhotoUrl(
                    url = url,
                    description = "Photo",
                    modifier = Modifier.width(100.dp).height(100.dp)
                )
            }

            Spacer(Modifier.width(10.dp))

            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                            merchant,
                            style = TextStyle(color = Color.Green, fontWeight = FontWeight.SemiBold)
                    )
                    Spacer(Modifier.width(5.dp))
                    Icon(
                            Icons.Default.Check,
                            contentDescription = "Localized description",
                            modifier =
                                    Modifier.background(
                                                    color = Color.Green,
                                                    shape = RoundedCornerShape(30.dp)
                                            )
                                            .width(15.dp)
                    )
                }
                Spacer(Modifier.height(3.dp))
                Text(product, style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 14.sp))
                Spacer(Modifier.height(3.dp))
                Text(
                        date,
                        style =
                                TextStyle(
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 10.sp,
                                        color = Color.Gray
                                )
                )
            }
        }
    }
}

@Composable
fun SubItemList(subItems: List<String>) {
    LazyColumn() {
        items(subItems) {
            item ->
                CardProduct(
                    merchant = "Pertamina",
                    product = "Gas LPG 3 KG",
                    date = "20 Agustus 2025 | 10:00",
                    url = item
                )

        }
    }
}

