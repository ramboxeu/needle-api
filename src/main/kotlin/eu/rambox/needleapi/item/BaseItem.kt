package eu.rambox.needleapi.item

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

abstract class BaseItem : Item {

    constructor(id: String, name: String) : super(null) {
        registerItem(id = id, name = name)
    }

    constructor(identifier: Identifier) : super(null) {
        registerItem(identifier = identifier)
    }

    private fun registerItem(id: String? = null, name: String? = null, identifier: Identifier? = null) {
        Registry.ITEM.register(identifier ?: Identifier(name, id), this)
    }
}