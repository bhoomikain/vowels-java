class work
{
  public static void main(String args[])
   {
     String name="techademy";
     int count=0;
     
     for(int i=0; i<name.length(); i++)
     {
         char ch = name.charAt(i);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         {
          count++;
         }
      }
      System.out.println("total vowels = " + count);
    }
}