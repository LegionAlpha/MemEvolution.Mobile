package com.neuronium.coreDomain.repositories.cardCategory.responses

sealed class CreateCardCategoryResponse {
	data class Success(val id: Int): CreateCardCategoryResponse()
	data class Error(val errorMessage: String): CreateCardCategoryResponse()
}