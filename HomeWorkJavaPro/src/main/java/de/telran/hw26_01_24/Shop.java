package de.telran.hw26_01_24;

public class Shop {
    public static void main(String[] args) {

    }

    public void supplyItem(String item) {
    }
}

class Supplier implements Runnable{
    private final Shop shop;
    public Supplier(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
int count = 1;
while (true) {
    try{
        String item = "Товар #" + count++;
        shop.supplyItem(item);
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
    }
}

class Customer implements Runnable{

    @Override
    public void run() {
        
    }
}
