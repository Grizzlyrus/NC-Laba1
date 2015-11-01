package View;

import Controller.Controller;
import Model.ModelItemCollection;
import Model.Tariff;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Кирилл on 27.10.2015.
 */
public class View {
    private Scanner scan;



    public View(Scanner scan){
        this.scan = scan;
    }


    public void welcomeMenu(){
        System.out.println("[1] Select table");
        System.out.println("[2] Show all tables");
        System.out.println("[3] Exit");

        switch (scan.nextInt()){
            case 1:{
                this.tableList();
            }break;

            case 2:{

            }break;

            case 3:{

            }break;

            case 0:{
                this.welcomeMenu();
            }break;

            default:{
                System.out.println("Unknown command! Try again.");
                this.welcomeMenu();
            }break;

        }

    }

    public void selectAction(){
        System.out.println("[1] Show table");
        System.out.println("[2] Add row");
        System.out.println("[3] Redact row");
        System.out.println("[4] Delete row");
        System.out.println("[5] Find row");
        System.out.println("[6] <-- Back");

        switch (scan.nextInt()){
            case 1:{

            }break;

            case 2:{

            }break;

            case 3:{

            }break;

            case 4:{

            }break;

            case 5:{

            }break;

            case 6:{
                this.tableList();
            }break;

            case 0:{
                this.selectAction();
            }break;

            default:{
                System.out.println("Unknown command! Try again.");
                this.selectAction();
            }break;
        }
    }

    public void tableList(){
        System.out.println("[1] Order");
        System.out.println("[2] Customer");
        System.out.println("[3] Tariff");
        System.out.println("[4] <-- Back");

        switch (scan.nextInt()){
            case 1:{
                this.selectAction();
            }break;

            case 2:{
                this.selectAction();
            }break;

            case 3:{
                this.selectAction();
            }break;

            case 4:{
                this.welcomeMenu();
            }break;

            default:{
                System.out.println("Unknown command! Try again.");
                this.tableList();
            }
        }


    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        try {
            View v = new View(scan);
            v.welcomeMenu();

            ModelItemCollection<Tariff> col1= new ModelItemCollection<>();
            ArrayList<Tariff> al1 = new ArrayList<>();


            Tariff tar1 = new Tariff();
            tar1.setName("aaaaaaaa");
            tar1.setNumber(123466666);
            tar1.setCost(987.654);
            tar1.setSpeed(1928.37);

            al1.add(tar1);

            Tariff tar2 = new Tariff();
            tar2.setName("aaaaaaaabbbbb");
            tar2.setNumber(77766666);
            tar2.setCost(987.6554);
            tar2.setSpeed(1928.3711);

            al1.add(tar2);

            col1.setModIt(al1);

            Controller con = new Controller();
            con.writeobject("Tariff.xml",col1);

        }finally {
            scan.close();
        }
    }

}
