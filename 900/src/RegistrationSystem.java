import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int n = read.nextInt();
        while (n -- != 0){
            String name = read.next();
            if (!map.containsKey(name)){
                map.put(name,0);
                System.out.println("OK");
            }
            else{
                int count = map.get(name) + 1;
                String newName = name + count;
                while (map.containsKey(newName)){
                    count++;
                    newName = name + count;
                }
                map.put(name,count);
                map.put(newName,0);
                System.out.println(newName);
            }
        }
        read.close();
    }
}
