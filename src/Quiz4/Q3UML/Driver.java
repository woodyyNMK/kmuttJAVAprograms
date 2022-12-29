package Quiz4.Q3UML;

public class Driver {
	public static void main(String[] args) {
		Artist artist1 = new Artist("Artist 1", false);
		Artist artist2 = new Artist("Artist 2", false);
		Artist artist3 = new Artist("Artist 3", true);

		System.out.printf("%s %s %s\n", artist1.getName(), artist1.getDisplayName(), artist1.getNumAlbum());
		System.out.printf("%s %s %s\n", artist3.getName(), artist3.getDisplayName(), artist3.getNumAlbum());

		artist1.setName("Artist 1 Edited");
		artist2.setVerified(true);

		System.out.printf("%s %s %s\n", artist1.getName(), artist1.getDisplayName(), artist1.getNumAlbum());
		System.out.printf("%s %s %s\n", artist2.getName(), artist2.getDisplayName(), artist2.getNumAlbum());

		Album album1 = new Album("Album 1", new Artist[] { artist1, artist2 }, 2017);
		Album album2 = new Album("Album 2", new Artist[] { artist1, artist3 }, 2018);

		System.out.printf("%s %s %s\n", album1.getName(), album1.getReleaseYear(), album1.getArtistNames());
		System.out.printf("%d %d %d\n", artist1.getNumAlbum(), artist2.getNumAlbum(), artist3.getNumAlbum());

		Track track1 = new Track("Track 1", album1, true, 200);
		Track track2 = new Track("Track 2", album2, false, 210);

		System.out.printf("%s %s\n", track1.getId(), track1.getName());
		System.out.println(track1.getId());
		track1.printPreview();
		System.out.println(track2.getId());
		track2.printPreview();

		artist1.setVerified(true);
		artist3.setName("Artist 3 Edited");
		album1.setName("Album 1 Edited");
		track2.setName("Track 2 Edited");

		System.out.printf("%s %s %s\n", album1.getName(), album1.getReleaseYear(), album1.getArtistNames());
		track2.printPreview();
	}
}