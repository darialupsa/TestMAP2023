package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Lander> list = new ArrayList<>();
        list = RepoLander.readFile("C:\\Users\\Daria\\IdeaProjects\\TestMap2023\\src\\com\\laender.txt", " ");

        System.out.println(list);

        List<Lander> filterList =  new ArrayList<>();
        filterList = Service.filterNameUndFlache(list);
        System.out.println(filterList);

        RepoLander.writeFile("C:\\Users\\Daria\\IdeaProjects\\TestMap2023\\src\\com\\result.txt", ";", filterList);
    }

}
