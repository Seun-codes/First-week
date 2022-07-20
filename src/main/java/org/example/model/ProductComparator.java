package org.example.model;

import java.util.Comparator;

public class ProductComparator implements Comparator<DTO> {
    @Override
    public int compare(DTO o1, DTO o2) {
        return o1.getQuantity() < o2.getQuantity() ? 1 : -1;
    }
}
