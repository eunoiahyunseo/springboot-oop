package com.eunoiahyunseo.javaoop.logic;

import java.util.List;

/**
 * @author ihyeonseo
 */

public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}