package Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Mapping {
    public static void main(String[] args) {

        Location location=new Location(0,"primary Location");
        /*Location location1=new Location(1,"location1 is in front of you ");
        Location location2=new Location(0,"primary Location");
        Location location3=new Location(0,"primary Location");*/
        location.addExist(0,"Start room");
        location.addExist(1,"go lovation1");
        location.addExist(2,"go lovation2");
        location.addExist(3,"go lovation3");
        location.addExist(4,"go lovation4");
        while (true){
            Scanner kirit=new Scanner(System.in);
            int duration=kirit.nextInt();
            for (var locationId:location.getExits().keySet()) {
                if (locationId==duration){
                    System.out.println(location.getDescrition()+" : "+locationId+" "+location.getExits());

                }
            }

        }
    }
}
