package de.ugur.baum;

import de.ugur.baum.commands.BaumCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Baum extends JavaPlugin {

    //Prefix
    public static final String prefix = ChatColor.BOLD  + "[" + ChatColor.GREEN + ChatColor.BOLD + "Baum" + ChatColor.BOLD + ChatColor.WHITE  + "): ";

    //Keine Rechte
    public static final String NoPerm = prefix + ChatColor.RED +  "Dazu hast du keine Rechte!";

    //Kein Spieler
    public static final String NoPlayer = prefix + ChatColor.RED + "Du musst ein Spieler sein, um diesen Befehl zu nutzen!";

    @Override
    public void onEnable() {

        //Registriert die Commands (Alphabetisch geordnet)
        getCommand("baum").setExecutor(new BaumCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
