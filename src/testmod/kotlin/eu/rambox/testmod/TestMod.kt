package eu.rambox.testmod

import eu.rambox.needleapi.NeedleAPI
import eu.rambox.needleapi.modlogger.ModLogger
import net.fabricmc.api.ModInitializer

object TestMod : ModInitializer {
    val logger = ModLogger("TestMod")

    override fun onInitialize() {
        //NeedleAPI.registerForMod("TestMod")
        logger.info("Hello!")

    }
}