package com.example.shoppinglist_new_course.domain

class GetShopItemForIdUseCase (private val shopListRepository: ShopListRepository) {
    fun getShopItemForId(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemForId(shopItemId)
    }
}