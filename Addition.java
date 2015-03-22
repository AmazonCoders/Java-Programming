import java.io.*;
import java.util.*;
class add
{

class node
{
        public int data;
	public node next;
}
       


        private node top=null;
        private  int c=0;
        private float sum=0,count=0;
        public add()throws IOException
        {
                  Scanner s=new Scanner(System.in);
                  String s1;
                System.out.println("Enter your sequence. press enter to stop ");
                  s1=s.next();
                  int k=0;
                   for(int i=0;i<s1.length();i++)
                    {
                            if(s1.charAt(i)==' ')
                              {
                                    sum=sum+Integer.parseInt(s1.substring(k,i));
                                      push(Integer.parseInt(s1.substring(k,i)));
                                      count++;
                                      k=i+1;
                               }
                            else if(i==(s1.length()-1))
                            {
                                    sum=sum+Integer.parseInt(s1.substring(k,i+1));
                                      push(Integer.parseInt(s1.substring(k,i+1)));
                                      count++;
                            }
                    }
        }
	public void push(int n)
	{
		node temp=new node();
		temp.data=n;
		temp.next=null;
		if(top==null)
		{top=temp;c++;}
		else
		{temp.next=top;top=temp;c++;}
	}
       
      public void display()
      {
          System.out.println("Sum is "+sum+"The average is "+sum/count);
                  
      }
}
class cmd
{
    public static void main(String args[])throws IOException
    {
     add a=new add();
     a.display();
        
    }
}
