package com.neuronium.coreDomain.repositories.cardCategory.responses

sealed class DeleteCardCategoryResponse {
	object Success: DeleteCardCategoryResponse()
	data class Error(val errorMessage: String): DeleteCardCategoryResponse()
}