package com.pokedex.pokedex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pokedex.pokedex.Retrofit.IPokemonList
import com.pokedex.pokedex.Retrofit.RetrofitClient
import io.reactivex.disposables.CompositeDisposable

class PokemonList : Fragment() {

    internal var compositeDisposable = CompositeDisposable()
    internal var iPokemonList:IPokemonList

    init {
        var retrofit = RetrofitClient.instance
        iPokemonList = retrofit.Create()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }


    }
