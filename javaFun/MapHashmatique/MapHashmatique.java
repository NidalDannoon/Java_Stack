import java.util.*;
public class MapHashmatique {
	public static void main(String[] args) {
HashMap<String, String> trackList = new HashMap<String, String>();
trackList.put("Song1", "Song");
trackList.put("Song2", "Song");
trackList.put("Song3", "Song");
trackList.put("Song4", "Song");
Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
	}
}
