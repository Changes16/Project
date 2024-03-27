package com.example.projectit

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    // on below line we are
    // creating variables for listview
    lateinit var programmingLanguagesLV: ListView

    // creating array adapter for listview
    lateinit var listAdapter: ArrayAdapter<String>

    // creating array list for listview
    lateinit var programmingLanguagesList: ArrayList<String>

    // creating variable for searchview
    lateinit var searchView: SearchView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        // initializing variables of list view with their ids.
        programmingLanguagesLV = findViewById(R.id.idLVProgrammingLanguages)
        searchView = findViewById(R.id.idSV)

        // initializing list and adding data to list
        programmingLanguagesList = ArrayList()
        programmingLanguagesList.add("Cow")
        programmingLanguagesList.add("Pike")
        programmingLanguagesList.add("Salmon")
        programmingLanguagesList.add("Yogurt")
        programmingLanguagesList.add("Egg")
        programmingLanguagesList.add("Milk")
        programmingLanguagesList.add("Cottage cheese")
        programmingLanguagesList.add("Carp")
        programmingLanguagesList.add("Herring fish")
        programmingLanguagesList.add("Blueberry Jam")
        programmingLanguagesList.add("Raspberry Jam")
        programmingLanguagesList.add("Strawberry Jam")
        programmingLanguagesList.add("Cream")
        programmingLanguagesList.add("Morse")
        programmingLanguagesList.add("Compote")
        programmingLanguagesList.add("Apple juice")
        programmingLanguagesList.add("Caviar")
        programmingLanguagesList.add("Orange juice")
        programmingLanguagesList.add("Byrpah")


        // initializing list adapter and setting layout
        // for each list view item and adding array list to it.
        listAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            programmingLanguagesList
        )

        // on below line setting list
        // adapter to our list view.
        programmingLanguagesLV.adapter = listAdapter

        // on below line we are adding on query
        // listener for our search view.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // on below line we are checking
                // if query exist or not.
                if (programmingLanguagesList.contains(query)) {
                    // if query exist within list we
                    // are filtering our list adapter.
                    listAdapter.filter.filter(query)
                } else {
                    // if query is not present we are displaying
                    // a toast message as no data found..
                    Toast.makeText(this@SearchActivity, "No Language found..", Toast.LENGTH_LONG)
                        .show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // if query text is change in that case we
                // are filtering our adapter with
                // new text on below line.
                listAdapter.filter.filter(newText)
                return false
            }
        })
    }
}