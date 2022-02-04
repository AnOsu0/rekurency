package example2;

import java.util.Scanner;

public class Cart {
    Product[] products = new Product[10];
    int i = 0;

    public void add(Product product){
        if (i<products.length){
            products[i] = product;
            i++;
        } else System.out.println("Brak miejsca w koszyku");
    }


    public double totalCost(){
      return sum(i);
    }

    private double sum(int x){
        return x > 0 ? products[x-1].getPrice() + sum(x-1) : 0;
    }

    public String info (){
        if (totalCost()>0){
            return "łączna wartosć produktów w koszyku to: " + totalCost();
        } else {
            return "Brak produktów w koszyku";
        }
    }
}
