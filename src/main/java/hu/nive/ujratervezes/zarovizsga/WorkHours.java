package hu.nive.ujratervezes.zarovizsga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    public String minWork(String filepath) {

        String path = "C:/zaroviszga/" + filepath;

        List<String> r = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            int min = 24;
            String cl;
            while ((cl = br.readLine()) != null) {
                String[] arrOfStr = cl.split(",", 0);

                if (Integer.parseInt(arrOfStr[1])<min) {
                    min = Integer.parseInt(arrOfStr[1]);
                    String cli = arrOfStr[0] + ": " + arrOfStr[2] ;
                    r.add(cli);
                }

            }


        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file", e);
        }

        return r.get(r.size()-1);
    }

    public static void main(String[] args) {
        WorkHours w = new WorkHours();
        System.out.println(w.minWork("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt"));
    }
}
