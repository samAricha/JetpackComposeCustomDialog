package teka.android.jetpackcomposecustomdialog.ui.widgets

import android.R
import android.content.Context
import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.rounded.Logout
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import teka.android.jetpackcomposecustomdialog.ui.theme.ReemKufi
import teka.android.jetpackcomposecustomdialog.ui.theme.ReemKufiMedium

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDialog3(value: String, setShowDialog: (Boolean) -> Unit, setValue: (String) -> Unit) {

    val txtFieldError = remember { mutableStateOf("") }
    val txtField = remember { mutableStateOf(value) }
    val negativeButtonColor: Color = Color(0xFF35898F)
    val positiveButtonColor: Color = Color(0xFFFF0000)
    val spaceBetweenElements: Dp = 18.dp
    val context: Context = LocalContext.current.applicationContext

    Dialog(onDismissRequest = { setShowDialog(false) }) {
        Surface(
            modifier = Modifier.fillMaxWidth(0.92f),
            color = Color.Transparent // dialog background
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                // text and buttons
                Column(
                    modifier = Modifier
                        .padding(top = 30.dp) // this is the empty space at the top
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(percent = 10)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(height = 36.dp))

                    Text(
                        text = "LogOut?",
                        fontFamily = ReemKufiMedium,
                        fontSize = 24.sp
                    )

                    Spacer(modifier = Modifier.height(height = spaceBetweenElements))

                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Are you sure, you want to LogOut?",
                        fontFamily = ReemKufi,
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.height(height = spaceBetweenElements))

                    // buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        DialogButton(buttonColor = negativeButtonColor, buttonText = "No") {
                            Toast
                                .makeText(context, "No Click", Toast.LENGTH_SHORT)
                                .show()
                            setShowDialog(false)
                        }
                        DialogButton(buttonColor = positiveButtonColor, buttonText = "Yes") {
                            Toast
                                .makeText(context, "Yes Click", Toast.LENGTH_SHORT)
                                .show()
                            setShowDialog(false)
                        }
                    }

                    // If you decrease the Surface's width, increase this height
                    Spacer(modifier = Modifier.height(height = spaceBetweenElements * 2))
                }

                // delete icon
                Icon(
                    Icons.Rounded.Logout,
                    contentDescription = "Delete Icon",
                    tint = positiveButtonColor,
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
                        .border(width = 2.dp, shape = CircleShape, color = positiveButtonColor)
                        .padding(all = 16.dp)
                        .align(alignment = Alignment.TopCenter)
                )
            }
        }
    }
}