package by.epam.java;

public class Dragon {
    public static void countHeadAndEyes(int count){
        int heads, eyes;
        if (count > 0 && count <= 200){
            heads = count * 3 + 3;
            eyes = heads * 2;
            System.out.println("Count head: " + heads + "\nCount eyes: " + eyes);
        }
        else if (count > 200 && count <= 300){
            heads = (200 * 3) + ((count - 200) * 2) + 3;
            eyes = heads * 2;
            System.out.println("Count head: " + heads + "\nCount eyes: " + eyes);
        }
        else if (count > 300){
            heads = (200 * 3) + (100 * 2) + (count - 300) + 3;
            eyes = heads * 2;
            System.out.println("Count head: " + heads + "\nCount eyes: " + eyes);
        }
        else {
            System.out.println("You should enter positive integer number (more than 0)!");
        }
    }
}
