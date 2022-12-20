import java.util.Scanner;

class iceCream{
    String number,name,OrderName;
    String[] product=new String[] {"Espresso","Cappuccino","Latte"};
    String[] addon=new String[] {"milk","cream","syrup","nothing"};
    int[] milk={60,80,100};
    int[] cream={75,90,125};
    int[] syrup={100,125,150};

}
public class Main {

    public static void main(String[] args) {
        int n=0,p=0,a=0,amount=0;
        iceCream obj1 = new iceCream();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tWelcome to the ice-cream parlour\n\t Please enter your name");
        obj1.name=input.nextLine();
        System.out.println("\n\t Please enter your number");
        obj1.number=input.nextLine();
        System.out.println("\n\t Here is our menu, enter the number before your desired product \n");
        for (int i =0;i<3;i++) {
            System.out.println("\t ["+(i+1)+"]"+obj1.product[i]);
        }
        do{p=input.nextInt();}while(p<0 && p>3);

        System.out.println("\t What would you like as an addon?");
        for(int i =0;i<4;i++){
        System.out.println("\t ["+(i+1)+"]"+obj1.addon[i]);
        }
        a=input.nextInt();
        System.out.println("We have received your order, Please wait till we make your bill");
        switch(p){
            case 1: obj1.OrderName="Espresso"+obj1.addon[a-1];
                    switch(a){
                        case 1: amount = obj1.milk[a-1];
                        break;
                        case 2: amount = obj1.cream[a-1];
                        break;
                        case 3: amount = obj1.syrup[a-1];
                        break;
                        default:
                        break;
                    }
            break;
            case 2 :  obj1.OrderName="Cappuccino"+obj1.addon[a-1];
                switch(a){
                    case 1: amount = obj1.milk[a-1];
                        break;
                    case 2: amount = obj1.cream[a-1];
                        break;
                    case 3: amount = obj1.syrup[a-1];
                        break;
                    default:
                        break;
                }
            break;
            case 3: obj1.OrderName="Syrup"+obj1.addon[a-1];
                switch(a){
                    case 1: amount = obj1.milk[a-1];
                        break;
                    case 2: amount = obj1.cream[a-1];
                        break;
                    case 3: amount = obj1.syrup[a-1];
                        break;
                    default:
                        break;
                }

            break;

            default: System.out.println("please enter proper value");
            break;

        }


    }





}