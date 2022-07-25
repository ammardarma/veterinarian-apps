package com.ammar.veterinariansapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListVeterinarians : AppCompatActivity(), SearchView.OnQueryTextListener {

    private lateinit var rvVet : RecyclerView
    private var list : ArrayList<Vet> = arrayListOf()
    private lateinit var searchView : SearchView
    private lateinit var listVetAdapter: ListVetAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_veterinarians)
            rvVet = findViewById(R.id.recyclerview)
            rvVet.setHasFixedSize(true)
            list.addAll(VetData.listVet)
        showRecyclerList()

        searchView = findViewById(R.id.searchView)
        searchView.setOnQueryTextListener(this)

        var filter = findViewById<ImageButton>(R.id.filter)
        filter.setOnClickListener {
            Toast.makeText(this, "Fitur akan segera hadir!", Toast.LENGTH_SHORT).show()
        }




    }

    private fun showRecyclerList() {
        rvVet.layoutManager = LinearLayoutManager(this)
        listVetAdapter = ListVetAdapter(list)
        rvVet.adapter = listVetAdapter


    listVetAdapter.setOnItemClick(object : ListVetAdapter.OnItemClick{
        override fun onItemClicked(data: Vet) {
            intentData(data)
        }
    })
    }

    private fun intentData(vet : Vet){
        val intent = Intent(this, VetDetails::class.java)
        intent.putExtra("name", vet.vetName)
        intent.putExtra("photo", vet.vetPhoto)
        intent.putExtra("address", vet.vetAddress)
        intent.putExtra("city", vet.vetCity)
        intent.putExtra("openHours", vet.vetOpenHours)
        intent.putExtra("closeHours", vet.vetCloseHours)
        intent.putExtra("phone", vet.vetPhone)
        intent.putExtra("linkMaps", vet.vetLinkMaps)
        startActivity(intent)
    }

    private fun intentAbout(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
        R.id.about -> intentAbout()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
            listVetAdapter.filter.filter(query)
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        listVetAdapter.filter.filter(newText)
        return false
    }


}
