import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello world! V2");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		String sampleString = br.readLine();
		
		String[] tempStrings=sampleString.split("[ ]");
		
		for (String s:tempStrings){
			if (s.equals(tempStrings[tempStrings.length-1])){
				System.out.println(s);
			}else{
				System.out.print(s+" ");
			}
		}
		for (String string : tempStrings) {
			System.out.println(string);
		}
		if(args!=null && args.length>0){
			for(String s:args){
				System.out.print(s+" ");
			}
		}else{
			System.out.println("Sorry, args is empty!");
		}
	
	}
}
