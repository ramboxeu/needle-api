package eu.rambox.needleapi.modlogger

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager

open class ModLogger (private val id: String) {
    private val logger  = LogManager.getFormatterLogger(id)

    fun info (message: Any) = logger.info("[$id] $message")
    fun error (message: Any) = logger.error("[$id] $message")
    fun debug (message: Any) = logger.debug("[$id] $message")
    fun warning (message: Any) = logger.warn("[$id] $message")

    fun log (message: Any, level: Level) = logger.log(level, "[$id] $message")
}