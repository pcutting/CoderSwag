package com.nevie.coderswag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nevie.coderswag.databinding.ItemProductBinding
import com.nevie.coderswag.models.CategoryModel
import com.nevie.coderswag.models.ProductModel

class ProductAcapter(
        private val products : List<ProductModel>
) : RecyclerView.Adapter<ProductAcapter.ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(layoutInflater, parent,false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount() = products.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }


    class ProductViewHolder(
            private val binding : ItemProductBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: ProductModel) {
            binding.apply {
                productImage.setImageResource(product.image)
                productName.text = product.name
                productSubtext.text = product.subtitle
                productPrice.text = "$${product.price}"
            }
        }
    }

}