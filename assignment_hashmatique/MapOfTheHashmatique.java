import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
    // Tasks:
        // Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
            // key : value = trackTitle : Lyrics
        
        // Add in at least 4 songs that are stored by title
        trackList.put("Judas", "What have I become? Now that I've betrayed Everyone I've ever loved, I pushed them all away...");
        trackList.put("Kingdom", "Adrenaline, in my soul Every fight out of control...");
        trackList.put("I Fell", "I don't sleep 'cause my head's on fire I hate creeps and I hate liars..."); 
        trackList.put("Battle Cry", "I hear the Battle Cry Under the Devil's Sky The One Winged Angel screams it fuels my hopes and dreams THE BEST BOUT MACHINE!..."); 

        // Pull out one of the songs by its track title
        String words = trackList.get("Battle Cry");
        //System.out.println(words);

        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> tracks = trackList.keySet();
        for(String track : tracks){
            System.out.println(track + " : " + trackList.get(track)); 
        }
    }
}
