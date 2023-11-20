package com.example.apprecyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecyclerview.R
import com.example.apprecyclerview.SuperHero

class SuperHeroAdapter(private val superHeroList: List<SuperHero>) : RecyclerView.Adapter<SuperHeroHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superHeroList.size
}