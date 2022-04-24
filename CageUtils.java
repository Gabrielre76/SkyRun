import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CageUtils {

    public static List<Location> cagesLocation = new ArrayList<Location>();

    public CageUtils() {
        cagesLocation.add(new Location(Bukkit.getWorld("world"), -43, 100, -9));
        cagesLocation.add(new Location(Bukkit.getWorld("world"), -32.556, 99, -39.442));
        cagesLocation.add(new Location(Bukkit.getWorld("world"), -25, 101, -43));
        cagesLocation.add(new Location(Bukkit.getWorld("world"), -34, 100, -14));
        cagesLocation.add(new Location(Bukkit.getWorld("world"), 28, 100, 17));
    }

    public static void teleportPlayerToCages(Player player){
        for (int x = 0; x < Bukkit.getOnlinePlayers().size(); x++){
            Location cage = cagesLocation.get(x);
            player.teleport(cage);
        }
    }

    public static void destroyCages(){
        for(Location cagesLoc : cagesLocation){
            Location glass = cagesLoc.add(0, -1,0);
            glass.getBlock().setType(Material.AIR);
        }
    }
}
