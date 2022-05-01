package de.ugur.baum;

import de.ugur.baum.commands.BaumCommand;
import de.ugur.baum.commands.TestCommand;
import de.ugur.baum.commands.VanishCommand;
import de.ugur.baum.events.JoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Baum extends JavaPlugin {

    //Prefix
    public static final String prefix = ChatColor.BOLD  + "[" + ChatColor.GREEN + ChatColor.BOLD + "Baum" + ChatColor.BOLD + ChatColor.WHITE  + "): ";

    //Keine Rechte
    public static final String NoPerm = prefix + ChatColor.RED +  "Dazu hast du keine Rechte!";

    //Kein Spieler
    public static final String NoPlayer = prefix + ChatColor.RED + "Du musst ein Spieler sein, um diesen Befehl zu nutzen!";

    //Invisible List
    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onLoad() {

        //Dieses Plugin wurde Geladen Nachricht
        System.out.println("================================");
        System.out.println("Das Baum Plugin wurde:");
        System.out.println("Geladen");
        System.out.println("================================");
        System.out.println("Dieses Plugin wurde von Ugur entwickelt!");
        System.out.println("================================");

    }

    @Override
    public void onEnable() {

        //Dieses Plugin wurde Aktiviert Nachricht
        System.out.println("================================");
        System.out.println("Das Baum Plugin wurde:");
        System.out.println("Aktiviert");
        System.out.println("================================");
        System.out.println("Dieses Plugin wurde von Ugur entwickelt!");
        System.out.println("================================");

        //Registriert die Commands (Alphabetisch geordnet)
        getCommand("baum").setExecutor(new BaumCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("vanish").setExecutor(new VanishCommand(this));

        //Registriert die Events (Alphabetisch geordnet)
        getServer().getPluginManager().registerEvents(new JoinEvent(this), this);
    }

    @Override
    public void onDisable() {

        //Dieses Plugin wurde Deaktiviert Nachricht
        System.out.println("================================");
        System.out.println("Das Baum Plugin wurde:");
        System.out.println("Deaktiviert");
        System.out.println("================================");
        System.out.println("Dieses Plugin wurde von Ugur entwickelt!");
        System.out.println("================================");

    }
}
