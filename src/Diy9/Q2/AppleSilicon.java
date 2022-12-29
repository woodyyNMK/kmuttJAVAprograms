package Diy9.Q2;

public abstract class AppleSilicon {
    private int maximumMemorySupportedInGB;
    private int neuralEngineCore;
    private int GPUCore;
    private int CPUCore;

    public AppleSilicon(int CPUCore, int GPUCore,int neuralEngineCore, int maximumMemorySupportedinGB){
        this.CPUCore =CPUCore;
        this.GPUCore =GPUCore;
        this.neuralEngineCore = neuralEngineCore;
        this.maximumMemorySupportedInGB = maximumMemorySupportedinGB;
    }
    public int getCPUCore(){
        return CPUCore;
    }
    public int getGPUCore(){
        return GPUCore;
    }
    public int getNeuralEngineCore(){
        return neuralEngineCore;
    }
    public int getMaximumMemorySupportedInGB(){
        return maximumMemorySupportedInGB;
    }
}
