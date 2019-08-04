package happy.mjstudio.coordinatorlayoutsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import happy.mjstudio.coordinatorlayoutsample.adapter.MainPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initWindowVisibility()
        initViewPager2()
    }
    private fun initWindowVisibility() {
        window?.decorView?.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }

    private fun initViewPager2() {
        val viewPager2 = viewPager2
        viewPager2.adapter = MainPageAdapter(this)

    }
}
