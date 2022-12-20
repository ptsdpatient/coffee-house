import java.util.Scanner;

class iceCream{
    public void Bill(String orderName,String Name,String number,int amount){

        System.out.println("\n\tClient Name :"+Name+"\n\tClient Phn :"+number+"\n\tDrink :"+orderName+"\n\tTotal amount :"+amount);
    }
    public int addonSet(int a,int amount){
        switch (a) {
            case 1 -> amount = milk[a - 1];
            case 2 -> amount = cream[a - 1];
            case 3 -> amount = syrup[a - 1];
            default -> {
            }
        }
        return amount;
    }

    String[] product=new String[] {"Espresso","Cappuccino","Latte"};
    String[] addon=new String[] {"milk","cream","syrup","nothing"};
    int[] milk={60,80,100};
    int[] cream={75,90,125};
    int[] syrup={100,125,150};

}
public class Main {

    public static void main(String[] args) {
        String OrderName = null;
        String number,name;
        int p,a,amount=0;
        iceCream obj1 = new iceCream();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tWelcome to the ice-cream parlour\n\t Please enter your name");
        name=input.nextLine();
        System.out.println("\n\t Please enter your number");
        number=input.nextLine();
        System.out.println("\n\t Here is our menu, enter the number before your desired product \n");
        for (int i =0;i<3;i++) {
            System.out.println("\t ["+(i+1)+"]"+obj1.product[i]);
        }
        do{p=input.nextInt();}while((p<0 || p>3));

        System.out.println("\t What would you like as an addon?");
        for(int i =0;i<4;i++){
        System.out.println("\t ["+(i+1)+"]"+obj1.addon[i]);
        }
        do{a=input.nextInt();}while((a<0 || p>a));
        System.out.println("We have received your order, Please wait till we make your bill");
        switch (p) {
            case 1 -> {
                OrderName = "Espresso-" + obj1.addon[a - 1];
                amount=obj1.addonSet(a,0);
            }
            case 2 -> {
                OrderName = "Cappuccino-" + obj1.addon[a - 1];
                amount=obj1.addonSet(a,0);
            }
            case 3 -> {
                OrderName = "Latte-" + obj1.addon[a - 1];
                amount=obj1.addonSet(a,0);
            }
            default ->{}
        }
        obj1.Bill(OrderName,name,number,amount);


    }





}