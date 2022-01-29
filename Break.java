import java.util.Scanner;
class Break{
	public static void main(String[] args) {
		int[] arr = {26,56,78,98,10};
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter the element to be found");
      int target = in.nextInt();
      for(int i=0;i<5;i++){
        if(arr[i]==target);{
        System.out.println("element found");
        break;
        }		
	}
}
}