package DnD2021.Q9UML1stchance;

public class Journal extends Publication {
    private String editorInCheif;
    private int volumn;

    public Journal(String title, String editorInCheif, int isbn, int volumn){
        super(title,isbn);
        this.editorInCheif =editorInCheif;
        this.volumn = volumn;
    }

    public String getEditorInCheif(){
        return editorInCheif;
    }
    public void setEditorInCheif(String editorInCheif){
        this.editorInCheif=editorInCheif;
    }
    public int getVolumn(){
        return volumn;
    }
    public void setVolumn(int volumn){
        this.volumn = volumn;
    }
}
