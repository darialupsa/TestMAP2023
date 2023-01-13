package com;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public static List<Lander> filterNameUndFlache(List<Lander> initialList){

        return initialList.stream().filter(x -> x.getName().startsWith("M") && x.getFlache() > 1000).collect(Collectors.toList());
    }
}
