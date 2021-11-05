import java.util.Scanner;

public class InputNumber {
    public static  int choice;


    public static int getNuber() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean notAnInteger = true;
        while(notAnInteger){
            input = sc.next();
            try{
                choice = Integer.parseInt(input);
                if(arrayContains(choice)){
                    if (choice >= 10) {
                        choice = choice / 10;
                    }
                    notAnInteger = false;

                }else{

                    System.out.println("Your choice is illegal");
                }

            }catch(Exception e){
                System.out.println("Not an integer");
            }
        }
        return choice;
    }

    public static boolean arrayContains(int toFind) {

        int[] myArray = {1, 2, 3, 4,10, 20, 30, 40};
        int length = myArray.length;

        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (myArray[i] == toFind) {
                found = true;
                return found;
            }
        }
        return found;
    }
}