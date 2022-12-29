package Diy9.Q2;

public class MacBookPro {
    private Memory memory;
    private AppleSilicon silicon;

    public MacBookPro(AppleSilicon silicon){
        this.silicon =silicon;
        this.memory = new Memory(16);
    }
    public AppleSilicon getSilicon(){
        return silicon;
    }
    public void modifyMemory(int modifyMemory){
        if(modifyMemory>silicon.getMaximumMemorySupportedInGB()){
            System.out.println("Error");
        }else{
            this.memory = new Memory(modifyMemory);
        }
    }
    public Memory getMemory(){
        return memory;
    }
}
