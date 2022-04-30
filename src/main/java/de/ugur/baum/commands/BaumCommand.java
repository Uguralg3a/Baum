package de.ugur.baum.commands;

import de.ugur.baum.Baum;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BaumCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;

            if (p.hasPermission("baum.command.baumcommand")) {

                p.sendMessage(Baum.prefix + "§9Baum Plugin");
                p.sendMessage(Baum.prefix + "§9Version 1.0.0");
                p.sendMessage(Baum.prefix + "§9Developed by Ugur");

            } else {
                p.sendMessage(Baum.NoPerm);
            }

        } else {
            sender.sendMessage(Baum.NoPlayer);
        }

        return false;
    }
}
