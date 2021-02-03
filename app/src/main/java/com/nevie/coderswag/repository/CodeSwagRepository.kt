package com.nevie.coderswag.repository

import com.nevie.coderswag.R
import com.nevie.coderswag.models.CategoryModel
import com.nevie.coderswag.models.ProductModel

object CodeSwagRepository {
    private val categories = listOf(
            CategoryModel("Shirts", R.drawable.shirts),
            CategoryModel("Hats", R.drawable.hats),
            CategoryModel("Hoodies", R.drawable.hoodies),
            CategoryModel("Digital", R.drawable.digital)
        )

    private val shirts = listOf(
            ProductModel("Devslopes Logo","Red Shirt with white logo", "20.00", R.drawable.shirt01),
            ProductModel("Devslops Badge Shirt", "Gray shirt with Badge", "19.00", R.drawable.shirt02),
            ProductModel("Tag Line", "Hustle.delegate=self", "20.00", R.drawable.shirt03),
            ProductModel("KF Logo", "KF Studios", "19.00", R.drawable.shirt04)
    )

    private val hoodies = listOf(
            ProductModel("Devslopes Logo", "Black hoodie", "34.00", R.drawable.hoodie01),
            ProductModel("Devslopes Logo", "Red hoodie", "34.00", R.drawable.hoodie02),
            ProductModel("Devslopes", "Ash Colored: 'Devslopes'", "34.00", R.drawable.hoodie03),
            ProductModel("Devslopes Logo", "Black 'Devslopes'", "34.00", R.drawable.hoodie04)
    )

    private val hats = listOf(
            ProductModel("Devslopes Beanie","Black w/ Logo", "19.00", R.drawable.hat01),
            ProductModel("Baseball cap","Black with red logo", "19.00", R.drawable.hat02),
            ProductModel("Baseball cap","White with red logo", "19.00", R.drawable.hat03),
            ProductModel("Snapback hat","Black with red logo and gray flat bill", "19.00", R.drawable.hat04)
    )

    private  val digital = emptyList<ProductModel>()

    fun getCategories()= categories

    fun getShirts() = shirts

    fun getHats() = hats

    fun getHoodies() = hoodies

    fun getDigital() = digital

}