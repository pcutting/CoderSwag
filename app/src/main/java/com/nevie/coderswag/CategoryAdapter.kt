package com.nevie.coderswag

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevie.coderswag.databinding.ItemCategoryBinding
import com.nevie.coderswag.models.CategoryModel
import com.nevie.coderswag.repository.CodeSwagRepository
import com.nevie.coderswag.repository.CodeSwagRepository.getCategories

class CategoryAdapter(private val items: List<CategoryModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = getCategories().size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class CategoryViewHolder(
            private val binding : ItemCategoryBinding
    ) :RecyclerView.ViewHolder(itemView) {

    }

}