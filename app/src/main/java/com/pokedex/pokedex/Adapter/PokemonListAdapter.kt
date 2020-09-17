package com.pokedex.pokedex.Adapter
import android.support.v7.widget.RecyclerView
import android.content.Context
import android.widget.ImageView
import android.widget.TextView

class PokemonListAdapter(internal var context: Context, internal var pokemonList:List<Pokemon>) : RecycleView.Adapter<PokemonListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.pokemon_list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(pokemonList[position].img).into(holder.img_pokemon)
        holder.txt_pokemon.text = pokemonList[position].name
    }
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(ItemView) {
        internal var img_pokemon:ImageView
        internal var txt_pokemon:TextView
        init{
            img_pokemon = itemView.findViewById(R.id.pokemon_image) as ImageView
            txt_pokemon = itemView.findViewById(R.id.pokemon_name) as TextView
        }
    }
}