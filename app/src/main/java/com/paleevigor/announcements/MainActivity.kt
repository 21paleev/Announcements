package com.paleevigor.announcements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.paleevigor.announcements.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var rootElement: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootElement = ActivityMainBinding.inflate(layoutInflater)
        val view = rootElement.root
        setContentView(view)
        init()
    }

    // функция инициализации кнопки в тулбаре
    // и установка слушателя нажатия злементов меню
    private fun init() {
        val toggle =
            ActionBarDrawerToggle(
                this,
                rootElement.drawerLayout,
                rootElement.mainContent.toolbar,
                R.string.open,
                R.string.close
            )
        rootElement.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        rootElement.navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.id_my_ads -> {
                Toast.makeText(this, "Presed id_my_ads", Toast.LENGTH_LONG).show()
            }
            R.id.id_car -> {
                Toast.makeText(this, "Presed id_id_car", Toast.LENGTH_LONG).show()
            }
            R.id.id_pc -> {
                Toast.makeText(this, "Presed id_pc", Toast.LENGTH_LONG).show()
            }
            R.id.id_smartphone -> {
                Toast.makeText(this, "Presed id_smartphone", Toast.LENGTH_LONG).show()
            }
            R.id.id_dm -> {
                Toast.makeText(this, "Presed id_dm", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_up -> {
                Toast.makeText(this, "Presed id_sign_up", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_in -> {
                Toast.makeText(this, "Presed id_sign_in", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_out -> {
                Toast.makeText(this, "Presed id_sign_out", Toast.LENGTH_LONG).show()
            }
        }
        rootElement.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}