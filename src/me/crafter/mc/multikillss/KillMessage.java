package me.crafter.mc.multikillss;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.bukkit.ChatColor;

public class KillMessage {
	
	private static String defaultmessage = "%p died";
	
	private static Random random = new Random();
	// Map<reason, list message>
	private static Map<String, List<String>> messages = new HashMap<String, List<String>>();

	public KillMessage(File folder) {
		File fi = new File(folder, "messages.txt");
		List<String> item = new ArrayList<String>();
		item = scan(fi);
		String[] split; 
		for (String x : item){
			if (!x.contains(":")) continue;
			split = x.split(":",2);
			
			if (!messages.containsKey(split[0])){
				messages.put(split[0], new ArrayList<String>());
			}
			String toput = ChatColor.translateAlternateColorCodes('&', split[1]);
			messages.get(split[0]).add(toput);
			
		}
	}

	public static String getKillMessage(String reason){
		if (messages.containsKey(reason)){
			List<String> message = messages.get(reason);
			return message.get(random.nextInt(message.size()));
		}
		return defaultmessage;
	}
	
	
	public List<String> scan(File file){
		List<String> ret = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(new FileReader(file));
			while (scanner.hasNextLine()) {
				ret.add(scanner.nextLine());
			}
			scanner.close();
		} catch (Exception e){
			}
		return ret;
	}
}
