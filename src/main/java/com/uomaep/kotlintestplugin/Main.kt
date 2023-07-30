package com.uomaep.kotlintestplugin

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Test!!!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
