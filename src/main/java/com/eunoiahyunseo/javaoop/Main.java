package com.eunoiahyunseo.javaoop;

import com.eunoiahyunseo.javaoop.logic.JavaSort;
import com.eunoiahyunseo.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * @author ihyeonseo
 */
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}