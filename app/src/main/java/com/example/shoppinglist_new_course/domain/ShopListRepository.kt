package com.example.shoppinglist_new_course.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemForId(shopItemId: ShopItem): ShopItem

    fun getShopList(): List<ShopItem>
}