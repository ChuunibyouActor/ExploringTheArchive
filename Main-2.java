/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.Math;
import java.util.*;
import java.util.Scanner;
public class Main extends PlayerInfo 
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    PlayerInfo p= new PlayerInfo();
    p.setMental(5);
    p.addEvidence(0);
    List<SelectableItem> hold = new LinkedList<SelectableItem>();
    Mission1 m1= new Mission1();
    Mission2 m2= new Mission2();
    Mission3 m3= new Mission3();
    Mission4 m4= new Mission4();
    Mission5 m5= new Mission5();
    item1 i1= new item1();
    item2 i2= new item2();
    item3 i3= new item3();
    hold.add(m1);
    hold.add(m2);
    hold.add(m3);
    hold.add(m4);
    hold.add(m5);
    hold.add(i1);
    hold.add(i2);
    hold.add(i3);
    List<SelectableItem> SelectableItems = new LinkedList<SelectableItem>();
    for(int i=0;i<5;i++){
    int random=(int)(Math.random() * 8);    
    SelectableItems.add(hold.get(random));
    }
    do{
    for(int i=0;i<5;i++){
        System.out.println(i+1+"-"+SelectableItems.get(i));
    }
    System.out.println("Please select the number of the Mission you wish to attempt");
    int user = input.nextInt();
    SelectableItems.get(user-1).onSelect(p);
    int newrand=(int)(Math.random() * 8);
    SelectableItems.add(user-1,hold.get(newrand));
    System.out.println("Mental- "+p.getMental());
    System.out.println("Evidence- "+p.getEvidence());
    }while(p.getMental()>0 && p.getEvidence()<25);
    if(p.getMental()<=0){
        System.out.println("You lose your mind after the investigations fail.");
    }
    else{
        System.out.println("You've become a expert sleuth and solved the mystery!");
    }
}
}

