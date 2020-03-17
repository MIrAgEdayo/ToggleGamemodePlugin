package si.f5.mirageserver;

import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] string) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(Main.prefix + "§cCannot use this command from console.");
            return false;
        }
        Player sender = (Player) commandSender;
        int n = sender.getGameMode().ordinal() + 1;
        sender.setGameMode(n < 4 ? GameMode.values()[n] : GameMode.CREATIVE);
        sender.sendMessage(Main.prefix + "§aYour gamemode has changed to §d" + sender.getGameMode().toString());
        return true;
    }
}
