package final_atm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class check {
	static String name = "",passwd = "",banknum = "",tarnam = "",tarbknam = "" ;
	int d=0;
	static int bal = 0,tagbal = 0,tradenum = 0,page=0;
	
	public check(String a, String b) throws IOException {
		FileReader f1 = new FileReader("D:/b001.txt");
		FileReader f2 = new FileReader("D:/b002.txt");
		FileReader f3 = new FileReader("D:/b003.txt");
		BufferedReader b1 = new BufferedReader(f1);
		BufferedReader b2 = new BufferedReader(f2);
		BufferedReader b3 = new BufferedReader(f3);
		String tmpread;
		while((tmpread = b1.readLine())!=null)
		{
			String[] sc1 = tmpread.split(" ");
			try
			{
				name = sc1[0];
				passwd = sc1[1];
				bal = Integer.parseInt(sc1[2]);
				if(name.equals(a)&&passwd.equals(b))
				{
					banknum = "b001.txt";
					d = 1;
					break;
				}
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
		}
		while((tmpread = b2.readLine())!=null)
		{
			String[] sc1 = tmpread.split(" ");
			try
			{
				if(d ==0)
				{
					name = sc1[0];
					passwd = sc1[1];
					bal = Integer.parseInt(sc1[2]);
					if(name.equals(a)&&passwd.equals(b))
					{
						banknum = "b002.txt";
						d = 1;
						break;
					}
				}
				else break;
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
		}
		while((tmpread = b3.readLine())!=null)
		{
			String[] sc1 = tmpread.split(" ");
			try
			{
				if(d == 0)
				{
					name = sc1[0];
					passwd = sc1[1];
					bal = Integer.parseInt(sc1[2]);
					if(name.equals(a)&&passwd.equals(b))
					{
						banknum = "b003.txt";
						d = 1;
						break;
					}
				}
				else break;
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
		}
	}
	public check() {
		
	}
	public void transfercheck(String a,String b,int c) throws IOException
	{
		tarbknam = a;
		tradenum = c;
		FileReader f1 = new FileReader("D:/"+"b" + a + ".txt");
		BufferedReader b1 = new BufferedReader(f1);
		String tmpread;
		
		while((tmpread = b1.readLine())!=null)
		{
			String[] sc1 = tmpread.split(" ");
			try
			{
				tarnam = sc1[0];
				tagbal = Integer.parseInt(sc1[2]);
				if(tarnam.equals(b))
				{
					
						d = 1;
						if(bal < c) {
							JOptionPane.showMessageDialog(null, "¾lÃB¤£¨¬", "¿ù»~", JOptionPane.ERROR_MESSAGE); 
							page = 1;
						}else {
							tagbal+=c;
							bal-=c;
						}
						break;
					
						
				}
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
		}
		
	}
	public void storeuserfile() throws IOException
	{
		String store = "";
		FileReader f1 = new FileReader("D:/"+banknum);
		BufferedReader b1 = new BufferedReader(f1);
		String tmpread;
		while((tmpread = b1.readLine())!=null)
		{
			
			String[] sc1 = tmpread.split(" ");
			try
			{
				if(sc1[0].equals(name))
				{
					store += (name + " " + passwd + " " + bal + "\n");
				}
				else
				{
					store +=(sc1[0] + " " + sc1[1] + " " + sc1[2] + "\n");
				}
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
			
		}
		FileWriter fw1 = new FileWriter("D:/"+banknum);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		bw1.write(store);
		bw1.close();
		fw1.close();
	}
	public void storetagfile(String a,String b,int c) throws IOException
	{
		String store = "";
		FileReader f1 = new FileReader("D:/b"+a+".txt");
		BufferedReader b1 = new BufferedReader(f1);
		String tmpread;
		while((tmpread = b1.readLine())!=null)
		{
			
			String[] sc1 = tmpread.split(" ");
			try
			{
				if(sc1[0].equals(b))
				{
					store += (b + " " + sc1[1] + " " + tagbal + "\n");
				}
				else
				{
					store +=(sc1[0] + " " + sc1[1] + " " + sc1[2] + "\n");
				}
			}
			catch(java.lang.NumberFormatException ed)
			{
				System.out.println("exception:"+ed.getMessage());
			}
			
		}
		FileWriter fw1 = new FileWriter("D:/b"+a+".txt");
		BufferedWriter bw1 = new BufferedWriter(fw1);
		bw1.write(store);
		bw1.close();
		fw1.close();
	}
}
