package www;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DListTest

{

  public static void main(String as[]) throws Exception

        {

         String con="";
         int x,op,p,v;


               DoubleLinkedList l1=new DoubleLinkedList();

               InputStreamReader isr=new InputStreamReader(System.in);

                BufferedReader br=new BufferedReader(isr);


System.out.println("Enter elements to create");

do

{

x=Integer.parseInt(br.readLine());

l1.add(x);

System.out.print("Add more?(y,n):");

con=br.readLine();

}while(con.equals("y"));


l1.show();

do

{


System.out.println("\n 1.Insert \n 2.Display \n 3.Exit");


System.out.println("\nSelect an option:");

op=Integer.parseInt(br.readLine());

if(op==1)

{

System.out.println("Enter Position to insert:");

p= Integer.parseInt(br.readLine());


System.out.println("Enter Value to insert:");

v= Integer.parseInt(br.readLine());

l1.insert(p,v);

}


if(op==2){

l1.show();
}

}while(op<3);

}

}