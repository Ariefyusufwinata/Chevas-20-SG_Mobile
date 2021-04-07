package chevalier.rief

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_gabut)
        val adapter = GabutAdapter(this)

        val gabut = listOf(
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player"),
                Gabut("Earth Defense Force","Sandlot", "19 July 2016", "Single-Player")
        )

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.setList(gabut)
    }
}
