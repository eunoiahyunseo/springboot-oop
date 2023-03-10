package com.eunoiahyunseo.javaoop.service;

import com.eunoiahyunseo.javaoop.logic.Sort;

import java.util.List;

/**
 * @author ihyeonseo
 */
public class SortService {

    private final Sort<String> sort;


    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}