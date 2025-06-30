package TasksOOPS.InheritOOPS;

import java.util.Scanner;

public class RecipeSelector {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pasta p=new Pasta();
		Cake c=new Cake();
		Salad s=new Salad();
		while(true) {
			System.out.print("Enter the dish ");
			String in=sc.next().toLowerCase();
			switch(in) {
			case "pasta"->{
				p.getIngredients();
				p.getInstruction();}
			case "cake"->{
				c.getIngredients();
				c.getInstruction();
			}
			case "salad"->{
				s.getIngredients();
				s.getInstruction();
			}
			default ->System.out.println("No recipe found for "+in);
			}}

	}

}
