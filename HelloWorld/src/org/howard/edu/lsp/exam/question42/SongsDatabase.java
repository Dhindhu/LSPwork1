package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * SongsDatabase class keeps tracks of song titles 
 * by classifying them according to genre
 * @author chidindu
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		//check if genre not in map
		if (!map.containsKey(genre)) {
            //add genre and get new HashSet
            map.put(genre, new HashSet<String>());
        }
        //else, add the song to present set of genre
        map.get(genre).add(songTitle);
	}

    /* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		//check set of all genres to find the song
        for(Map.Entry<String,Set<String>> k : map.entrySet()){
            if(k.getValue().contains(songTitle)){
                return k.getKey();
            }
        }
        //if song title is not present in any genre
        return null;
	}

}
