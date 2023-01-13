package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepoLander {
    /**
     *
     * @param filename
     * @param separator
     * @return
     * @throws IOException
     */
    public static List<Lander> readFile(String filename, String separator) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();
        String[] attributes;
        Lander land;
        List<Lander> landList = new ArrayList<>();
        while(line != null)
        {
            attributes = line.split(separator);
            land = new Lander(attributes[0], attributes[1],Long.parseLong(attributes[2]),Long.parseLong(attributes[3]),attributes[4]);
            landList.add(land);
            line = bufferedReader.readLine();

        }
        return landList;
    }

    /**
     * Method that writes to the file
     * @param filename String
     * @param separator Srting
     * @param list List<Ausflug>
     * @throws IOException if an error occurs during writing
     */

    public static void writeFile(String filename,String separator, List<Lander> list) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        for (Lander ausflug: list)
        {
            String line = ausflug.getName() + separator+
                    ausflug.getKontinent()+separator+
                    ausflug.getFlache() + separator+
                    ausflug.getBevolkerung() + separator+
                    ausflug.getHauptstadt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }



}
