package de.ugur.baum.commands;

import de.ugur.baum.Baum;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class VanishCommand implements CommandExecutor {

    private final Baum plugin;


    public VanishCommand(Baum plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;

            if (p.hasPermission("baum.command.vanishcommand")) {

                if (plugin.invisible_list.contains(p)) {
                    for (Player people : Bukkit.getOnlinePlayers()){
                        people.showPlayer(plugin, p);
                    }
                    plugin.invisible_list.remove(p);
                    p.sendMessage(Baum.prefix + "" + ChatColor.RED + "Du bist nun für alle Spieler sichtbar!");
                } else if (!plugin.invisible_list.contains(p)) {
                    for (Player people : Bukkit.getOnlinePlayers()){
                        people.hidePlayer(plugin, p);
                    }
                    plugin.invisible_list.add(p);
                    p.sendMessage(Baum.prefix + "" + ChatColor.GREEN + "Du bist nun für alle Spieler unsichtbar!");
                }

    } else {
        p.sendMessage(Baum.NoPerm);
    }

} else {
        sender.sendMessage(Baum.NoPlayer);
        }

        return false;
    }
}
