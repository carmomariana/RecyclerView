package com.devspace.recyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

// Adaptação entre o data class e o item_list layout
class ContactListAdapter:
    ListAdapter<Contact, ContactListAdapter.ContactViewHolder>(ContactDiffUtils ()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        TODO("Not yet implemented")
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

// View holder = view que segura os dados
    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    //Compara a diferença quando a nossa lista é atualizada
    class ContactDiffUtils : DiffUtil.ItemCallback<Contact>(){
        override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            TODO("Not yet implemented")
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            TODO("Not yet implemented")
            return oldItem.name == newItem.name

        }
    }
}