package happy.mjstudio.coordinatorlayoutsample.screen

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_collapsing_toolbar.*



class CollapsingToolbarFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(happy.mjstudio.coordinatorlayoutsample.R.layout.fragment_collapsing_toolbar,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initCollapsingToolbar()
        initFab()
    }

    //region Toolbar
    private fun initCollapsingToolbar() {
        setHasOptionsMenu(true)
        (this.activity as? AppCompatActivity)?.setSupportActionBar(toolBar)
        (this.activity as? AppCompatActivity)?.supportActionBar?.let {actionBar->
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(happy.mjstudio.coordinatorlayoutsample.R.drawable.ic_menu)

        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(happy.mjstudio.coordinatorlayoutsample.R.menu.collapsing_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home-> {
                Toast.makeText(context,"Home",Toast.LENGTH_SHORT).show()
            }
            happy.mjstudio.coordinatorlayoutsample.R.id.menu_snow-> {
                Toast.makeText(context,"It is snow",Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
    //endregion

    private fun initFab() {
        fab.setOnClickListener {
            Toast.makeText(context,"Fab Snow",Toast.LENGTH_SHORT).show()
        }
    }
}