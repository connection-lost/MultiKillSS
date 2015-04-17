package me.crafter.mc.multikills;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event){
		DeathInfo info = new DeathInfo(event);
		event.setDeathMessage(null);
		
		if (info.getReason().equals("other")){
			event.getEntity().sendMessage(ChatColor.RED+"�������������뽫�˴�ʵ������ԭ�����������˽�ĸ����Ա��ų�bug��лл��");
			event.getEntity().sendMessage("Reason "+info.getReason());
			event.getEntity().sendMessage("Death "+info.getDier());
			event.getEntity().sendMessage("Killer "+info.getKiller());
			event.getEntity().sendMessage("Cause "+info.getCause());
			event.getEntity().sendMessage("Damager "+info.getDamager());
		}
		
		List<String> multimessage = MkdMessage.getMessage(info);
		if (event.getEntity().getWorld().getName().startsWith("game")){
			for (Player rec : event.getEntity().getWorld().getPlayers()){
				rec.sendMessage(KillMessage.getKillMessage(info));
				for (String x : multimessage){
					rec.sendMessage(x);
				}
			}
		} else {
			Bukkit.broadcastMessage(KillMessage.getKillMessage(info));
			for (String x : multimessage){
				Bukkit.broadcastMessage(x);
			}
		}
	}
	
//	@EventHandler
//	public void onPlayerJoinExtra(final PlayerJoinEvent event){
//		
//		Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("MultiKillS"), new Runnable(){
//
//			@Override
//			public void run() {
//				String name = event.getPlayer().getName();
//				if (name.equals("Meiqiu")) name = ChatColor.RED + "ú��ɣ";
//				if (event.getPlayer().getItemInHand().getType() == Material.AIR){
//					//Do Nothing
//					//Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] " + name + ChatColor.LIGHT_PURPLE + " ���ֿտ������ǳ���");
//				} else {
//					Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] " + name + ChatColor.LIGHT_PURPLE + " ���� " + ChatColor.AQUA + KillWeapon.gethisweapon(event.getPlayer()) + ChatColor.LIGHT_PURPLE + " �����ǳ���");
//				}
//				
//			}
//			
//			
//					
//		}, 5L);
//		
//
//	}
	

}


