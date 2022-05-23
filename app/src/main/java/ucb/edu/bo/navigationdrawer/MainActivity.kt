package ucb.edu.bo.navigationdrawer

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar: androidx.appcompat.widget.Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        setConfigDrawer()
    }
    fun setConfigDrawer() {
        var main_drawer_layout : DrawerLayout =findViewById(R.id.main_drawer_layout)
        var toolbar: androidx.appcompat.widget.Toolbar =findViewById(R.id.toolbar)
        var drawerToggle = ActionBarDrawerToggle(
            this,
            main_drawer_layout,
            toolbar,
            0,0)
        main_drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()



    }

}