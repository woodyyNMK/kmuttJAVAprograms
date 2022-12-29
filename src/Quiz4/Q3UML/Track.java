package Quiz4.Q3UML;

public class Track {
    private int trackId;
    private String trackName;
    private Album album;
    private boolean explicit;
    private int duration;
    private static int count = 0;

    public Track(String name,Album album,boolean explicit,int duration){
        this.trackName = name;
        this.explicit =explicit;
        this.album = album;
        this.duration = duration;
        this.trackId=count;
        count++;
    }
    public int getId(){
        return trackId;
    }
    public String getName(){
        return trackName;
    }
    public void setName(String name){
        this.trackName=name;
    }
    public void printPreview(){
        if(explicit){
            System.out.print("(E) ");
        }
        System.out.println(this.getName());
        
        int min = duration/60;
        int sec = duration%60;
        if(sec<10)
            System.out.println(min+":0"+sec);
        else
            System.out.println(min+":"+sec);
        System.out.println(this.album.getName());
        System.out.println(this.album.getArtistNames());
    }
}
