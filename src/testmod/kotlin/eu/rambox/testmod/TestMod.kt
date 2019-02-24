package eu.rambox.testmod

import eu.rambox.needleapi.modlogger.ModLogger
import eu.rambox.testmod.block.TestBlock
import net.fabricmc.api.ModInitializer

object TestMod : ModInitializer {
    val logger = ModLogger("TestMod")

    override fun onInitialize() {
        logger.info("Hello!")
        val testblock = TestBlock()
    }
}