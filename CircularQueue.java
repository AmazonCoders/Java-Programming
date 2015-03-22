import java.io.*;
import java.util.*;
class cir
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner s=new Scanner(System.in);
        circular c=new circular();
        do{
             System.out.println("1.Enque\n2.deque\n3.dispacelay");
               System.out.println("Enter your choice");
            i=s.nextInt();
            switch(i)
            {
                case 1:
                {
                    System.out.println("Enter element to be inserted");
                    j=s.nextInt();
                    c.enque(j);
                    System.out.println("The element "+j+" is inserted");
                    break;
                }
                case 2:
                    System.out.println("The dequed element is "+c.deque());
                    break;
                case 3:
                    c.dispacelay();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(i<=3);
    }
  }
     class circular 
    {
        public int size,rear=0,front=0,space;
        public int[] a;
       Scanner s=new Scanner(System.in);
        public circular()
        {  System.out.println("Enter the size of queue");
            size=s.nextInt();
            a=new int[size];
            space=size;
        }
        public void enque(int i)
        {
                if(space>0)
                { a[rear++%size]=i;space--;}
                else 
                    System.out.println("The que is full...");
        }       
        public int  deque()
        {
            if(space==size)
            {System.out.println("The que is empty..");return 0;}
            else
            {  
                space++;
                return a[front++];
            }
        }
        public void dispacelay()
        {
            int i;
            if(space==size)
                System.out.println("The que is empty..");
            else 
            { i=front;
                while(i!=rear)
                    System.out.println(a[i++%size]+" ");
            } 
      }
    }
