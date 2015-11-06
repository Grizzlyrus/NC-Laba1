package View;

import Controller.Controller;
import java.util.Scanner;

/**
 * Created by ������ on 27.10.2015.
 */
public class View {
    private Controller controller;
    private Scanner scan;



    public View(Controller controller){
        this.controller = controller;
    }


    public void read(){
        scan=new Scanner(System.in);
        while (true){
            controller.analysis(scan.nextLine());
        }
    }

    public String readAtr(){
        return scan.nextLine();
    }

    public void print(String s){
        System.out.println(s);
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
}
