package com.example.superheroes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.superheroes.R
import com.example.superheroes.data.Superhero
import com.example.superheroes.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroAdapter(var items: List<Superhero>, val onClick: (Int) -> Unit) : Adapter<SuperheroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val binding = ItemSuperheroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperheroViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val superhero = items[position]
        holder.render(superhero)
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }
}

class SuperheroViewHolder(val binding: ItemSuperheroBinding) : ViewHolder(binding.root) {

    fun render(superhero: Superhero) {
        binding.nameTextView.text = superhero.name
        Picasso.get().load(superhero.image.url).into(binding.pictureImageView);
    }
}