package teka.android.jetpackcomposecustomdialog.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import teka.android.jetpackcomposecustomdialog.R

// Set of Material typography styles to start with
val ReemKufi = FontFamily(Font(R.font.reemkufi))
val ReemKufiMedium = FontFamily(Font(R.font.reem_kufi_medium))
val ReemKufiSemiBold = FontFamily(Font(R.font.reem_kufi_semi_bold))
val ReemKufiBold = FontFamily(Font(R.font.reem_kufi_bold))
val Poppins = FontFamily(Font(R.font.poppins))
val PoppinsLight = FontFamily(Font(R.font.poppins_light))
val PoppinsExtraLight = FontFamily(Font(R.font.poppins_extra_light))


val Typography = Typography(
    displayMedium = TextStyle(
        fontFamily = ReemKufi,
        fontWeight = FontWeight.Light,
        fontSize = 13.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)