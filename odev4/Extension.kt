import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

inline fun Fragment.navigateToNextFragment(@IdRes id: Int, block: Bundle.() -> Unit = {}) {
    findNavController().navigate(id, Bundle().apply(block))
}