package com.java.basic;

import java.util.Scanner;

public class SamuAndShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        String line = System.getProperty("line.separator");
	        scan.useDelimiter(line);
	        
	        int cases = scan.nextInt();
	        
	        int []value = new int[cases];
	        
	        for(int x=0;x<cases;x++){
	            int N = scan.nextInt();
	            String []data = new String[N];
	            for(int y=0;y<N;y++){
	                data[y] = scan.next();
	            }
	            int temp=0;
	            for(int z=0;z<N;z++){
	                String []get = data[z].split(" ");
	                
	                int min = Integer.parseInt(get[0]);
	                for(int a=0;a<get.length;a++){
	                    if(Integer.parseInt(get[a])<min)
	                        min = Integer.parseInt(get[a]);
	                }
	                
	                temp = temp+min;
	            }
	            
	            value[x]= temp;
	        }
	        
	        for(int b=0;b<value.length;b++)
	        System.out.println(value[b]);
	}

}
