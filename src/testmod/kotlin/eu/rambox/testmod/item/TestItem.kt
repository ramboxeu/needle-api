package eu.rambox.testmod.item

import eu.rambox.needleapi.item.BaseItem
import net.minecraft.util.Identifier
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

class TestItem : BaseItem (Identifier("testmod", "testitem"), Item.Settings().itemGroup(ItemGroup.REDSTONE))