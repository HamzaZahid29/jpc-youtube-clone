import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

val YouTubeTypography = Typography(
    displayLarge = TextStyle(
        fontSize = 57.sp,            // Largest display text
        fontWeight = FontWeight.Bold,
        color = Color.White
    ),
    displayMedium = TextStyle(
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    ),
    displaySmall = TextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.White
    ),
    headlineLarge = TextStyle(
        fontSize = 32.sp,            // Large headline for video titles
        fontWeight = FontWeight.SemiBold,
        color = Color.White
    ),
    headlineMedium = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Medium,
        color = Color.White
    ),
    headlineSmall = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        color = Color.White
    ),
    titleLarge = TextStyle(
        fontSize = 22.sp,            // Medium-emphasis subtitles
        fontWeight = FontWeight.Bold,
        color = Color.White
    ),
    titleMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        color = Color.LightGray      // Light gray for less emphasis
    ),
    titleSmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = Color.LightGray
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,            // Standard body text
        fontWeight = FontWeight.Normal,
        color = Color.White
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.LightGray
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Light,
        color = Color.LightGray
    ),
    labelLarge = TextStyle(
        fontSize = 14.sp,            // Button text and labels
        fontWeight = FontWeight.Medium,
        color = Color.White
    ),
    labelMedium = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        color = Color.LightGray
    ),
    labelSmall = TextStyle(
        fontSize = 11.sp,
        fontWeight = FontWeight.Light,
        color = Color.LightGray
    )
)
