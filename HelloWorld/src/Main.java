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
		if(tempStrings!=null && tempStrings.length>0){
			for (String s:tempStrings){
				if (tempStrings[tempStrings.length-1].equals(s)){
					System.out.println(s);
				}else{
					System.out.print(s+" ");
				}
			}
			for (String string : tempStrings) {
				System.out.println(string);
			}
		}
		if(args!=null && args.length>0){
			for(String s:args){
				System.out.print(s+" ");
			}
		}else{
			System.out.println("Sorry, args is empty!");
		}
		
		int j=0;
		if(args!=null && args.length>0){
			for(;j>args.length;j++){
				System.out.print(args[j]+" ");
			}
			System.out.println(args[j]);
			
		}
		int g=0;
		if(tempStrings!=null && tempStrings.length>0){
			while(g<tempStrings.length-1){
				System.out.print(tempStrings[g]+" ");
				g++;
			}
			System.out.println(tempStrings[g]);
		}
		int h=0;
		if(tempStrings!=null && tempStrings.length>0){
			do{
				if(tempStrings.length==h)
					System.out.print(tempStrings[h]+"/n");
				else
					System.out.print(tempStrings[h]+" ");
				h++;
			}while(h<tempStrings.length);
		}
		System.out.println();
		for(int x=0; x<tempStrings.length;x++){
			System.out.print(tempStrings[x]+((x==tempStrings.length-1)? "":" "));
		}
	
	}
}
