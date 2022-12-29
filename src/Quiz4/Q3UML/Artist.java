package Quiz4.Q3UML;

public class Artist {
    private String name;
    private boolean verified;
    private int numAlbum = 0;

    public Artist(String name, boolean verified){
        this.name = name;
        this.verified = verified;
    }
    public String getName(){
        return name;
    }
    public String getDisplayName(){
        if(verified){
            return name + " (/)";
        }else{
            return name;
        }
    }
    public boolean getVerified(){
        return verified;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setVerified(boolean verified){
        this.verified = verified;
    }
    public void increaseNumAlbum(){
        numAlbum++;
    }
    public int getNumAlbum(){
        return numAlbum;
    }
}
