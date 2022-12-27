package com.neuronium.coreDomain.entities

data class Card(
	val id: Int,
	val title: String,
	val categoryId: Int,
	val content: String
)