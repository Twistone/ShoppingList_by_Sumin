package com.sumin.shoppinglist.data

import com.sumin.shoppinglist.domain.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel(shopItem: ShopItem): ShopItemDbModel = ShopItemDbModel(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled
    )

    fun mapDbModelToEntity(ShopItemDbModel: ShopItemDbModel): ShopItem = ShopItem(
        id = ShopItemDbModel.id,
        name = ShopItemDbModel.name,
        count = ShopItemDbModel.count,
        enabled = ShopItemDbModel.enabled
    )

    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}