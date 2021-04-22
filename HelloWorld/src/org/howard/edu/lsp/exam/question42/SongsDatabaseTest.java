package org.howard.edu.lsp.exam.question42;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * JUnit test cases for SongsDatabase
 * @author chidindu
 *
 */
class SongsDatabaseTest {
	
	SongsDatabase db = new SongsDatabase();

	@Test
	@DisplayName("Test cases for addSong")
	void testAddSong() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");

		Assert.assertNotNull("Error in addSongs(), map should not be empty", db);
	}
	
	@Test
	@DisplayName("Test cases for getSongs")
	void testGetSongs() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rap", "Stan");
		db.addSong("Jazz", "So What");
		db.addSong("Jazz", "All Blues");
		
		Set<String> songs = db.getSongs("Rap");
		Set<String> songChecker = new HashSet<String>();
		songChecker.add("Savage");
		songChecker.add("Gin and Juice");
		songChecker.add("Stan");
		Assert.assertEquals("error in getSongs(), should return [Savage, Gin and Juice, Stan]", songChecker, songs);
		
		Set<String> songs2 = db.getSongs("Jazz");
		Set<String> songChecker2 = new HashSet<String>();
		songChecker2.add("Always There");
		songChecker2.add("So What");
		songChecker2.add("All Blues");
		Assert.assertEquals("error in getSongs(), should return [Always There, So What, All Blues]", songChecker2, songs2);
	}
	
	@Test
	@DisplayName("Test cases for getGenreOfSong")
	void testGetGenreOfSong() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rap", "Stan");
		db.addSong("Jazz", "So What");
		db.addSong("Jazz", "All Blues");
		
		String checker = "Rap";
		String checker2 = "Jazz";
		
		
		Assert.assertEquals("error in getGenreOfSong(), ecpected Rap", checker, db.getGenreOfSong("Savage"));
		Assert.assertEquals("error in getGenreOfSong(), ecpected Rap", checker, db.getGenreOfSong("Gin and Juice"));
		Assert.assertEquals("error in getGenreOfSong(), ecpected Rap", checker, db.getGenreOfSong("Stan"));
		Assert.assertEquals("error in getGenreOfSong(), ecpected Jazz", checker2, db.getGenreOfSong("Always There"));
		Assert.assertEquals("error in getGenreOfSong(), ecpected Jazz", checker2, db.getGenreOfSong("So What"));
		Assert.assertEquals("error in getGenreOfSong(), ecpected Jazz", checker2, db.getGenreOfSong("All Blues"));
	}

}
