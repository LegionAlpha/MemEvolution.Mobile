package com.neuronium.coreDomain.entities

data class CardCategory(
	val id: Int,
	val title: String,
	val parentCategoryId: Int?
)