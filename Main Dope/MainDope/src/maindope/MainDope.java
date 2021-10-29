package maindope;

import java.io.*;

public class MainDope {
    
    public static BufferedReader jd;
    public static OneeSama oneesama;
    
    
     public static void main(String[] args)throws IOException {
         jd = new BufferedReader (new InputStreamReader(System.in));
         LinkStart.menu();
         System.out.print("Enter a choice: ");
         short choice = Short.parseShort(jd.readLine());
         
          switch(choice){
            case 1:
                newGame();
                break;
            case 2:
                Continue_();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
     }
     public static void newGame() throws IOException{
         oneesama = new OneeSama("Little Stitch",900,200,150,500,0,300);
         Story.Intro();
         jd.readLine();        
         Story.NextKings();
         jd.readLine();
         Welcome();
}

    public static void Continue_() {
        
    }
    
    public static void Welcome() throws IOException{
        Story.Wars();
        jd.readLine();
        Story.Escape();
        jd.readLine();
        Story.Summon();
        jd.readLine();
        
    }
}