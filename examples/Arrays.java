package day1.examples;

public class Arrays {

	public static void main(String[] args) {
		int[]a={10,20,30,40};
		System.out.println(a[2]+ " " + a[3]);
//enhanced for statement...it prints all the numbers in the array
		for(int temp:a){
			System.out.println(temp);
		}
		int [] x= new  int[5];
		x[3]=25;
		x[0]=10;
		for(int temp1:x){
			//prints out 10,0,0,24,0 because only two arrays were assigned values 
			System.out.println(temp1);
		}
		String [] st={"one","two"};
		for(String temp2: st){
			System.out.println(temp2);
		}
		
		
	}

}
