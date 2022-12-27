package com.neuronium.coreDomain.repositories.cardCategory

import com.neuronium.coreDomain.entities.CardCategory
import com.neuronium.coreDomain.repositories.cardCategory.responses.CreateCardCategoryResponse
import com.neuronium.coreDomain.repositories.cardCategory.responses.DeleteCardCategoryResponse
import com.neuronium.coreDomain.repositories.cardCategory.responses.GetCardCategoriesResponse
import kotlinx.coroutines.flow.Flow

interface CardCategoryRepository {

	suspend fun getCardCategories(parentCategoryId: Int?, count: Int?, lastCategoryId: Int?): Flow<GetCardCategoriesResponse>

	suspend fun createCardCategory(cardCategory: CardCategory): Flow<CreateCardCategoryResponse>

	suspend fun deleteCardCategory(cardCategoryId: Int): Flow<DeleteCardCategoryResponse>

}