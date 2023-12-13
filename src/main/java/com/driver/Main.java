package com.driver;

public class Main {
    static class Product{

        public int product(int x, int y) {
            return x;
        }
        public int product(int x, int y, int z) {
            return x;
        }
        public double product(double x, double y) {
            return x;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1.1,2.2);
    }
}