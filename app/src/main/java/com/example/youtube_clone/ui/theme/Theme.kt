
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.example.youtube_clone.ui.theme.DarkBackground
import com.example.youtube_clone.ui.theme.WhiteText
import com.example.youtube_clone.ui.theme.LightGray
import com.example.youtube_clone.ui.theme.PrimaryRed

private val YouTubeColorPalette =  darkColorScheme(
    primary = PrimaryRed,
    background = DarkBackground,
    surface = DarkBackground,
    onPrimary = WhiteText,
    onBackground = WhiteText,
    onSurface = LightGray
)

@Composable
fun YouTubeCloneTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = YouTubeColorPalette,
        typography = YouTubeTypography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}
