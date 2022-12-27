package com.neuronium.coreDomain.useCases

import com.neuronium.coreDomain.repositories.cardCategory.CardCategoryRepository
import com.neuronium.coreDomain.repositories.cardCategory.responses.GetCardCategoriesResponse
import com.neuronium.coreDomain.useCases.utils.PageRequest
import kotlinx.coroutines.flow.Flow

class GetCardCategoriesUseCase constructor(private val cardCategoryRepository: CardCategoryRepository) {

	suspend fun allItems(parentCategoryId: Int?): Flow<GetCardCategoriesResponse> {
		return cardCategoryRepository.getCardCategories(parentCategoryId, null, null)
	}

	suspend fun page(parentCategoryId: Int?, pageRequest: PageRequest): Flow<GetCardCategoriesResponse> {
		return cardCategoryRepository.getCardCategories(parentCategoryId, pageRequest.count, pageRequest.lastItemId)
	}

}