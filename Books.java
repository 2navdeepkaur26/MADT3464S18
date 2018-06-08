package ARList;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Books {
    int bookID;
    String bookTitle;
    int bookRating;
    
   Books(){
       this.bookID = 0;
       this.bookTitle = "Unknown";
       this.bookRating = 0;
   }
   
   Books(int bookID,String bookTitle,int bookRating){
       this.bookID = bookID;
       this.bookTitle = bookTitle;
       this.bookRating = bookRating;
   }
   void setID(int ID){
    }
   
    void setTitle( String title){
        this.bookTitle = title;
    }
    String getTitle(){
          return this.bookTitle;
    }
    void setRating(int rate){
        this.bookRating = rate;
    }
    int getRating(){
        return this.bookRating;
    }
    void displayInfo(){
        System.out.println("BookID :"+ this.bookID +
                "\n Book Titlew :" + this.bookTitle +
                "\n Book Rating:" + this.bookRating);
    }
}
class bookTitleComparator implements Comparator <Books>{
    

   
    @Override
    public int compare(Books b1, Books b2) {
       if (b1.bookRating ==b2.bookRating)
       return 0;
       else if (b1.bookRating<b2.bookRating)
       return 1;
       else 
       return -1;}
}

class bookRatingComparator implements Comparator <Books>{
    

   
    @Override
    public int compare(Books b1, Books b2) {
       if (b1.bookRating ==b2.bookRating)
       return 0;
       else if (b1.bookRating<b2.bookRating)
       return 1;
       else 
       return -1;}
}

    
   

    

    
 

