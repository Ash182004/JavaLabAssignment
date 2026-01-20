package com.training.day4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q4_ProductPriorityDemo {
	 
    Comparator<Q4_Product> priceComparator =
            (p1, p2) -> Double.compare(p1.productPrice, p2.productPrice);

    PriorityQueue<Q4_Product> pq = new PriorityQueue<>(priceComparator);

    // Adding products
    pq.add(new Product(1, "Pen", 10.0));
    pq.add(new Product(2, "Notebook", 25.0));
    pq.add(new Product(3, "Bag", 400.0));
    pq.add(new Product(4, "Laptop", 60000.0));
    pq.add(new Product(5, "Mouse", 800.0));

    // Polling products based on priority
    while (!pq.isEmpty()) {
        System.out.println("Processing product: " + pq.poll());
    }
}}
