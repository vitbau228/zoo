/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Main {
   
    public static void main(String[] args) {
        ManagerZoo managerZoo = new ManagerZoo();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            
            managerZoo.showMenu();
            choose = Integer.parseInt(sc.nextLine());
        
        
        switch (choose) {
            case 1:
                managerZoo.inputRoom();
                break;
            case 2:
                managerZoo.deleteRoom();
                break;
            case 3:
                managerZoo.addAnimal();
                break;
            case 4:
               managerZoo.deleteAnimal();
                break;
            case 5:
                managerZoo.showFUllInfo();
                break;
            case 6:
                
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }
        
    } while(choose != 6 );
         
}

    
}
