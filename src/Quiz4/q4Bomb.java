package Quiz4;
import java.util.Scanner;
public class q4Bomb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int[][][] cube = new int[5][5][5];

        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                for(int k = 0;k<5;k++){
                    cube[i][j][k] = 0;
                }
            }
        }
        for(int loop =0; loop<row;loop++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int i =0 ; i<5 ; i++ ){
                for(int j=0; j<5 ; j++){
                    for(int k=0 ; k<5 ; k++){
                        if(j==y && k==z){
                            for(int a = 0;a<5;a++){
                                cube[a][j][k]=1;
                            }
                        }
                        if(i==x && k==z){
                            for(int a = 0;a<5;a++){
                                cube[i][a][k]=1;
                            }
                        }
                        if(i==x && j==y){
                            for(int a = 0;a<5;a++){
                                cube[i][j][a]=1;
                            }
                        }
                    }
                }
            }
        }
        int result = 0;
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                for(int k = 0;k<5;k++){
                    result += cube[i][j][k];
                }
            }
        }
        System.out.println(result);
    }
}
