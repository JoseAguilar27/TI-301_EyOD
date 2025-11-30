package Unidad1_Fundamentos;


import java.util.*;
import java.io.*;
public class Arreglos {
    


    public static int problemaJuan(String [] args)throws java.io.IOException{
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
 
        int num = Integer.parseInt(in.readLine());
        //System.out.println(num);
        
        int juanes = 0;
        String nombre ="";
        for(int i = 0; i <= num-1; i++){
        nombre = in.readLine();
        nombre = nombre.toLowerCase();
        if("juan".equals(nombre))
            juanes++;
        }
        return juanes;
	}
     public static void main(String [] args)throws java.io.IOException{
     System.out.println(Arreglos.problemaJuan(args));
     }
}
