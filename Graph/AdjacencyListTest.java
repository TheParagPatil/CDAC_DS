import java.util.ArrayList;
import java.util.LinkedList;

class Song { 
	String title;

	public Song(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + "]";
	}
	
}

public class AdjacencyListTest {
	public static void main(String[] args) {
		
		LinkedList<LinkedList<Song>> jukeBox = new LinkedList<LinkedList<Song>>();
		
		
		LinkedList loveSongList = new LinkedList(); //container
		Song s1 = new Song("Love1"); //content
		Song s2 = new Song("Love2");
		Song s3 = new Song("Love3");
		Song s4 = new Song("Love4");
		Song s5 = new Song("Love5");
		
		//Song s6 = new Song("Love6");
		
		loveSongList.add(s1);
		loveSongList.add(s2);
		loveSongList.add(s3);
		loveSongList.add(s4);
		loveSongList.add(s5);
		
		LinkedList popSongList = new LinkedList(); //container
		Song s6 = new Song("PopSong1"); //content
		Song s7 = new Song("PopSong2");
		Song s8 = new Song("PopSong3");
		
		popSongList.add(s6);
		popSongList.add(s7);
		popSongList.add(s8);
		
		
		jukeBox.add(loveSongList);
		jukeBox.add(popSongList);
		
		Song x = (Song) loveSongList.get(0);
		System.out.println("x "+x);
		
		System.out.println("--------------");
		
		Song y = jukeBox.get(0).get(0);
		System.out.println("y "+y);
		
		jukeBox.get(0).add(s6);
		
	}
}
