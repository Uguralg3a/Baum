package de.ugur.baum.events;

import de.ugur.baum.Baum;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    private Baum plugin;

    public JoinEvent(Baum plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer(); //Panton ich sehe, dass du wieder gejoint bist xd
        for(Player player:plugin.invisible_list) {
            p.hidePlayer(plugin, player);
        }
    }
}

