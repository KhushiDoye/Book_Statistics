import java.util.*;
class Book
{
   int id;
   String name;
   Scanner sc;
   Page[] pages;
class Page
{
    int[] lines;
    Page(int numlines)
    {
     	lines=new int[numlines];
    }
    public void setLines()
    {
	for(int i=0;i<lines.length;i++)
 	{
	System.out.println("Enter the number of words for line "+(i+1));
	lines[i]=sc.nextInt();
	}
   }
   public int getLines()
   {  
	return lines.length;
   }  
}
Book(int id,String name,int numpages)
{
    this.id=id;
    this.name=name;
    sc=new Scanner(System.in);
    pages=new Page[numpages];
    for(int i=0;i<pages.length;i++)
    {
  	System.out.println("Enter the number of lines for page "+(i+1));
  	int nlines=sc.nextInt();
 	pages[i]=new Page(nlines);
	pages[i].setLines();
    }
}
public int getNumOfWords()
 {
    int numwords=0;
    for(int i=0;i<pages.length;i++)
	for(int j=0;j<pages[i].getLines();j++)
        {
 		numwords+=pages[i].lines[j];
    	}
	return numwords;
 }
}
public class BookStatistics
{
   public static void main(String args[])
   {
	Book b=new Book(1,"OOPM Book",3);
        int nowords=b.getNumOfWords();
        System.out.println("TOTAL WORDS: "+nowords);
   }
}