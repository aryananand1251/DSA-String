package Start_java;

import java.util.Scanner;

public class Shortest_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Direction");
        String Path=sc.nextLine();
        System.out.println(getShortestpath(Path));
    }
    public static float getShortestpath(String Path){
        int x=0,y=0;
        for(int i=0; i<Path.length(); i++){
            char dir=Path.charAt(i);

            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            if(dir=='W'){
                x--;
            }
            else {
                x++;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);

    }
}
