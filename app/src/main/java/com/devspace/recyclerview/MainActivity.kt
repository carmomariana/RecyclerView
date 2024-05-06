package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Create data class
        // Create list from data class type
        //  Create Adapter
        //  Set Adapter
        // Linear Layout Manager

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)

    }
}

val contacts = listOf(
    Contact(
        name = "Maria",
        phone= "+55 (085) 98737-3284",
        icon = R.drawable.sample1
    ),
    Contact(
        name ="José",
        phone="+55 (085) 98435-2282",
        icon = R.drawable.sample2
    ),
    Contact(
        name ="Ana",
        phone="+55 (085) 98337-3385",
        icon = R.drawable.sample3
    ),
    Contact(
        name ="Hannah",
        phone="+55 (085) 98231-3104",
        icon = R.drawable.sample4
    ),
    Contact(
        name ="Helena",
        phone="+55 (085) 98227-1558",
        icon = R.drawable.sample5
    ),
    Contact(
        name ="Ester",
        phone="+55 (085) 98234-2679",
        icon = R.drawable.sample6
    ),
    Contact(
        name ="Sofia",
        phone="+55 (085) 98790-2231",
        icon = R.drawable.sample7
    ),
    Contact(
        name ="Theo",
        phone="+55 (085) 98337-3385",
        icon = R.drawable.sample8
    ),
    Contact(
        name ="João",
        phone="+55 (085) 9817-2101",
        icon = R.drawable.sample9
    ),
    Contact(
        name ="Bento",
        phone="+55 (085) 98273-1708",
        icon = R.drawable.sample10
    ),
    Contact(
        name ="Teresa",
        phone="+55 (085) 9856-2234",
        icon = R.drawable.sample11
    ),
    Contact(
        name ="Pedro",
        phone="+55 (085) 9822-1231",
        icon = R.drawable.sample12
    ),
    Contact(
        name ="Clara",
        phone="+55 (085) 98111-0104",
        icon = R.drawable.sample13
    ),
    Contact(
        name ="Daniel",
        phone="+55 (085) 98271-1304",
        R.drawable.sample14
    ),
    Contact(
        name ="Elisa",
        phone="+55 (085) 9877-2191",
        icon = R.drawable.sample15
    ),
    Contact(
        name ="Rebeca",
        phone="+55 (085) 9877-2191",
        icon = R.drawable.sample16

    ),
)
