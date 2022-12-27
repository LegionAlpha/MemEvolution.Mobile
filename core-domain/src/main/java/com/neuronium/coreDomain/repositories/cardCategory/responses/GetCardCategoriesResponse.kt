package com.neuronium.coreDomain.repositories.cardCategory.responses

import com.neuronium.coreDomain.entities.CardCategory

sealed class GetCardCategoriesResponse {
	data class Success(val categories: List<CardCategory>): GetCardCategoriesResponse()
	data class Error(val errorMessage: String): GetCardCategoriesResponse()
}