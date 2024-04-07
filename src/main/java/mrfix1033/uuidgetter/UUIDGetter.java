package mrfix1033.uuidgetter;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class UUIDGetter extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("uuid").setExecutor(this);
        getLogger().info("Плагин UUIDGetter включен");
    }

    @Override
    public void onDisable() {
        getLogger().info("Плагин UUIDGetter выключен");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!sender.isOp()) return true;
        if (args.length < 1) {
            sender.sendMessage("/uuid [ник игрока]");
            return true;
        }
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(args[0]);
        if (!offlinePlayer.hasPlayedBefore()) {
            sender.sendMessage("§cИгрок не играл на сервере");
            return true;
        }
        sender.sendMessage(offlinePlayer.getName() + " - " + offlinePlayer.getUniqueId());
        return true;
    }
}
