package sololearn;

import java.util.Scanner;
//convert time from 12 hour clock to 24 hour clock
//1:15 pm --->13:15

public class MilitaryTime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give the time as xx:xx AM/PM");
        String time = scanner.nextLine();
        String[] elements=time.split(":");
        int hour=Integer.parseInt(elements[0]);
        String[] elements2=elements[1].split(" ");
        if (elements2[1].equalsIgnoreCase("PM")){
            hour=hour+12;
        }
        System.out.println(hour+":"+elements2[0]);

    }
}
