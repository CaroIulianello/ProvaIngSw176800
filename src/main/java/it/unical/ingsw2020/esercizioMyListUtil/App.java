package it.unical.ingsw2020.esercizioMyListUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	MyListUtil list=new MyListUtil();
		//List<Integer> list1=new LinkedList<Integer>();
		
//		for(int i=0; i<4; i++)
//		{
//			list1.add(i);
//		}
		
		System.out.println("Vuoi la lista in ordine crescente?\n");
		try (Scanner in = new Scanner(System.in)) {
			String s=in.next();
			
			if(s.equals("si"))
				list.ordinaCrescente();
			
			else if(s.equals("no"))
				list.ordinaDecrescente();
		}
		
		System.out.println(((MyListUtil) list).ordina(5));
    }

}
