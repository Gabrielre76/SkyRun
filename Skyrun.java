import fr.gabriel.skyrun.listeners.ListenersManager;
import fr.gabriel.skyrun.utils.CageUtils;
import fr.gabriel.skyrun.utils.WorldManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyRun extends JavaPlugin {

    public static SkyRun INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

        new ListenersManager(this).registerListeners();
        GameStatus.setStatus(GameStatus.LOBBY);
        new CageUtils();

    }

    @Override
    public void onDisable() {
        WorldManager.replaceWorld(true);
    }

    public String getPrefix() {
        return "§e§lSkyRun §f§l┃ §7";
    }
}
