package com.nevie.coderswag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevie.coderswag.databinding.ItemCategoryBinding
import com.nevie.coderswag.models.CategoryModel

class CategoryAdapter(
        private val categories: List<CategoryModel>,
        private val onClick: (CategoryModel) ->  Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCategoryBinding.inflate(layoutInflater, parent, false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.apply {
            holder.bind(categories[position])
            holder.itemView.setOnClickListener {
                onClick(category)
            }
        }
    }

    class CategoryViewHolder(
            private val  binding : ItemCategoryBinding
    ) :RecyclerView.ViewHolder(binding.root) {
        fun bind(category: CategoryModel) {
            binding.apply {
                categoryTitle.text = category.title
                backgroundImage.setImageResource(category.image)
            }
        }


    }

}