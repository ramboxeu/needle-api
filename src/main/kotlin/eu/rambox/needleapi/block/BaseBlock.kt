package eu.rambox.needleapi.block

import net.minecraft.item.Item
import net.minecraft.block.Block
import net.minecraft.item.ItemGroup
import net.minecraft.item.block.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

abstract class BaseBlock  :  Block {
    var blockItemGroup : ItemGroup? = null
    var stackSize : Int? = null

    // TODO: Make proper fields for this properties
    private var blockSettings: Settings? = null
    private var id: String? = null
    private var name: String? = null


    constructor(blockSettings: Settings, id: String, name: String) : super(blockSettings) {
        this.blockSettings = blockSettings
        this.id = id
        this.name = name
    }

    open fun onRegistered() {}

    init {
        Registry.BLOCK.register(Identifier(id, name), this)
        Registry.ITEM.register(Identifier(id, name), BlockItem(this, Item.Settings().stackSize(stackSize ?: 64).itemGroup(blockItemGroup ?: ItemGroup.MISC)))
        onRegistered()
    }
}