package JavaExampleProgram;

public class StringsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"sonika","sri","phani","radha"};
		
		//printing the string values
		for(int i =0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		//for loop can be writen in different 
		for(String string :str) {
			System.out.println(string);
		}
		String str1 = "Iam working on java";
		//forward of the string
		for(int j=0;j<str1.length();j++) {
			System.out.println(str1.charAt(j));
			
		}
		//print reverse of the string
		for(int j=str1.length()-1;j>=0;j--) {
			System.out.println(str1.charAt(j));//charAt()--> to get specific char of the string
		}

	}

}
