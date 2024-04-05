package com.github.oobila.bukkit.effects;

import com.github.oobila.bukkit.common.ABCommon;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class TestListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.getLogger().log(Level.INFO, "ablib effects (TEST) - player joined: {0}", event.getPlayer().getName());
    }

    public static void invoke(Plugin plugin) {
        ABCommon.register(new TestListener(), plugin);
    }

}
