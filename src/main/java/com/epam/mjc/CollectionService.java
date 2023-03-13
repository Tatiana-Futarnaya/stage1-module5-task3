package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       List<Integer> listNew= list.stream()
               .filter(num->num%2==0)
               .collect(Collectors.toList());
        return listNew;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> listNew= (List<String>) list.stream()
                .map(value->value.toUpperCase())
                .collect(Collectors.toList());
        return listNew;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> optional;
        optional = list.stream().max(Integer::compare);
        return optional;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> optional;
        optional = list.stream()
                .flatMap(x->x.stream())
                .min(Integer::compare);
        return optional;
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce((x,y)->x+y).get();
    }
}
