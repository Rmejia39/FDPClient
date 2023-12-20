/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.features.module

enum class ModuleCategory(val displayName: String, val configName: String, val htmlIcon: String) {
    COMBAT("%module.category.combat%", "Combat", "&#xe000;"),
    PLAYER("%module.category.player%", "Player", "&#xe7fd;"),
    MOVEMENT("%module.category.movement%", "Movement", "&#xe566;"),
    VISUAL("%module.category.visual%", "Visual", "&#xe417;"),
    CLIENT("%module.category.client%", "Client", "&#xe869;"),
    WORLD("%module.category.world%", "World", "&#xe55b;"),
    OTHER("%module.category.other%", "Other", "&#xe5d3;"),
    EXPLOIT("%module.category.exploit%", "Exploit", "&#xe868;");
}
