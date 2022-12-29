package Quiz4.Q3UML;

public class Album {
    private String name;
    private Artist[] artists;
    private int releaseYear;

    public Album(String name, Artist[] artists,int releaseYear){
        this.name = name;
        this.artists=artists;
        this. releaseYear=releaseYear;
        for(Artist a:artists){
            a.increaseNumAlbum();
        }
    }
    public String getName(){
        return name;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public String getArtistNames(){
        String st="";
        for(Artist a:artists){
            st += a.getDisplayName()+", ";
        }
        return st.substring(0,st.length()-2);
    }
    public void setName(String name){
        this.name = name;
    }
}
