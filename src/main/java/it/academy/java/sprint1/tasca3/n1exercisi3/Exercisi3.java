package it.academy.java.sprint1.tasca3.n1exercisi3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Exercisi3 {

    public static void main(String[] args) {
        System.out.println("Tasca 03. Java Collections (Spring1), Nivell 1, Exercisi 3");

        Scanner sn = new Scanner(System.in);
        String fileName = "C:/Users/ljimenezubillus/Desktop/Curs IT A/Countries.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            Map<String, String> map = new HashMap<>();
            while (scanner.hasNext()) {
                String[] key = scanner.nextLine().split(" ");
                map.put(key[1], key[0]);
            }

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry);
            }

            System.out.println("Introdoueix el teu nom, si us plau");
            String usarName = sn.next();
            int userPoints = 0;
            for (int i = 0; i < 10; i++) {
                //return a random country
                Random random = new Random();
                List<String> keys = new ArrayList<>(map.keySet());
                String randomKey = keys.get(random.nextInt(keys.size()));
                String country = map.get(randomKey);

                System.out.println("Introdoueix la capital de " + country);
                String userCapital = sn.next();
                String userCountry = map.get(userCapital);
                if (userCountry != null && userCountry.equalsIgnoreCase(country)) {
                    userPoints = userPoints + 1;
                }

            }
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/ljimenezubillus/Desktop/Curs IT A/classificacio.txt"));
            out.write(usarName + "-->" + userPoints);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
