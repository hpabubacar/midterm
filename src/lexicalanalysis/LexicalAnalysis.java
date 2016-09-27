
package lexicalanalysis;

import java.util.*;
import java.io.*;
public class LexicalAnalysis {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tokens = new ArrayList<String>();
        StringBuilder st = new StringBuilder();
        String in = null;

        //Scanner scan = new Scanner(test);
        
        try{  
            FileReader f = new FileReader("C:/Users/hanna/Documents/NetBeansProjects/LexicalAnalysis/src/lexicalanalysis/lexicalanalysis.txt");
            int i;  
            while( (i=f.read()) != -1)  
                st.append((char)i);//System.out.print((char)i);
                in = st.toString();
                System.out.println(st.toString());
            //(char)i = sc.nextLine();
            f.close();  
        }catch(Exception e){System.out.println(e);}  
            System.out.println("\nAnalysis:\n");  
        
        for (int i=0; i<in.length(); i++) {
            tokens.add(String.valueOf(in.charAt(i)));
        }
        
        for (int i = 0; i < tokens.size(); i++){
            if (tokens.get(i).equals("+")){
            System.out.println("plus: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("-")){
            System.out.println("minus: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("*")){
            System.out.println("times: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("/")){
            System.out.println("divide: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("(")){
            System.out.println("lparen: "+tokens.get(i));
            }
            else if (tokens.get(i).equals(")")){
            System.out.println("rparen: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("=")){
            System.out.println("assign: "+tokens.get(i));
            }
            else if (tokens.get(i).equals(";")){
            System.out.println("semi: "+tokens.get(i));
            }
            else if (tokens.get(i).matches("\\d+(\\.\\d+)?")){
            System.out.println("num: "+tokens.get(i));
            }
            else{
            System.out.println("ID: "+tokens.get(i));
            }
        }
    }
    
}