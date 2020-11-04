package it.unical.ingsw2020.esercizioMyListUtil;

import java.util.LinkedList;
import java.util.List;

public class MyListUtil {
	
	boolean ordina=false;
	String s;
	
	public List<Integer> ordina(int n)
	{
		List<Integer> list=new LinkedList<Integer>();
		
		if(ordinaCrescente())
		{
			for(int i=0; i<=list.size(); i++)
			{
				if(n<=i)
					list.add(i);
				
				else
					list.add(i+1);
			}
		}
		
		else
		{
			for(int i=list.size(); i>=0; i--)
			{
				if(n>=i)
					list.add(i);
				
				else
					list.add(i-1);
			}
		}
		
		return list;
	}
	
	public boolean ordinaCrescente()
	{
		//if(s.equals("si"))
			ordina=true;
		
		return ordina;
	}
	
	public boolean ordinaDecrescente()
	{
		//if(s.equals("no"))
			ordina=false;
		
		return ordina;
	}
}
