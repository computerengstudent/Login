package com.example.loginpage

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.databinding.ItemNoteBinding

class NoteAdapter(private val mContext: Context, private val NoteListesi: List <NoteModel>) :
    RecyclerView.Adapter <NoteAdapter.CardTasarimNesneleriniTutucu >() {

    inner class CardTasarimNesneleriniTutucu (val binding : ItemNoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardTasarimNesneleriniTutucu(binding)
    }

    override fun getItemCount(): Int {
        return NoteListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val note = NoteListesi[position]

        val binding=holder.binding
        // binding.textView1.text = note.title
        // binding.textView2.text = note.type


    }
}