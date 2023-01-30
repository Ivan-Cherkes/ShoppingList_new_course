package com.example.shoppinglist_new_course.domain

class AddShopItemUseCase (private val shopListRepository: ShopListRepository){
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}