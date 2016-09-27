package quiz2;
import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is your initial tuition?");
		double i_tuition= input.nextDouble();
		System.out.println("what is the percentage that increase first year, use decimal?");
		double p_increase = input.nextDouble();
		System.out.println("what is the percentage that increase second year, use decimal?");
		double p2_increase=input.nextDouble();
		System.out.println("what is the percentage that increse third year, use decimal?");
		double p3_increase = input.nextDouble();
		
		double first_year = i_tuition;
		double second_year = (i_tuition*p_increase);
		double third_year = (i_tuition*p2_increase);
		double last_year = (i_tuition*p3_increase);
		
		double total = (first_year + second_year +third_year + last_year );
		
		System.out.println("The total cost is:"+total);
		
		
		

	}

}
