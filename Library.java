package lab02;

public class Library{
    private Book[] books=new Book[3];



    public Library(Book A, Book B, Book C){
        books[0]=A;
        books[1]=B;
        books[2]=C;
    }
    public void catalog(){
        int i;
        for(i=0;i<books.length;i++){

            System.out.println(books[i].getTitle());
        }
    }
    public int totalPages(){
        return books[0].getNumPages() + books[1].getNumPages() + books[2].getNumPages();
    }

    public int maxPages(){
        int a;
        int max=books[0].getNumPages();
        for(a=0;a<books.length;a++){
            if(books[a].getNumPages() > max){
                max=books[a].getNumPages();
            }

        }
        return max;
    }


    public static void main(String[] args){

        Book A=new Book("The Old Man and the Sea",127);
        Book B=new Book("The Catcher in the Rye",277);
        Book C=new Book("The Great Gatsby",242);




        Library newLibrary = new Library(A,B,C);


        newLibrary.catalog();
        System.out.println(newLibrary.totalPages());
        System.out.println(newLibrary.maxPages());

    }

}
