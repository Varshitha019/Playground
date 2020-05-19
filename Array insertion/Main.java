import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
   int n=in.nextInt();
   int a[]=new int[n+1];
    System.out.println("Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element");
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
   int pos=in.nextInt();
  
   if(pos>a.length)
   {
     System.out.println("Invalid Input");
   }else
   {
       System.out.println("Enter the value to insert\nArray after insertion is");
   int ele=in.nextInt();
   for(int i=n;i>pos-1;i--)
      a[i]=a[i-1];
   a[pos-1]=ele;
   for(int i=0;i<=n;i++)
     System.out.println(a[i]);
   }
    //type your code
  }
}