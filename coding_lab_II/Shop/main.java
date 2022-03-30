class Product{
    String product;
    double price;
    double discount; 
    String date; 
    double total;
}

public class Main {
    public static void main(String [] args){
        Product pen = new Product(); 
        
        pen.product = "Caneta";
        pen.price = 2.00;
        pen.discount = 0.50;
        pen.date = "30/03/2022"; 
        pen.total = 1.50;

        System.out.println("Produto: " + pen.product + "\nPreco: " + pen.price + " reais\nDesconto: "
         + pen.discount + " reais\nTotal: " + pen.total + "\nData: " + pen.date);
    }


}
