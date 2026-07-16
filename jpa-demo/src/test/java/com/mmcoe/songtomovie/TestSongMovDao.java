package com.mmcoe.songtomovie;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mmcoe.songtomovie.*;

public class TestSongMovDao 
{
	public static SongMovDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new SongMovDao();
	}
	
	@Test
	public void testSaveSong()
	{
		Song s = new Song(102, "Kesariya", "Arijit Singh");
		assertNotNull(dao.save(s));
	}
	
	@Test
	public void testAddSongToMovie()
	{
		assertNotNull(dao.addSongToMovie(102,321));
	}
	
	@Test
	public void testFindSongsByMovie()
	{
		List<Song> songs=dao.findSongsByMovie("Titanic");
		
		assertNotNull(songs);
		songs.forEach(System.out::println);
		
	}
	
	@Test
	public void testFindMovieBySong()
	{
		List<Movie> movies=dao.findMovieBySong("Kesariya");	
		
		assertNotNull(movies);
		movies.forEach(System.out::println);
	}
}
