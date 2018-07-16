import java.util.HashMap;

public class Library{
  public Library(){
  }

  public void getFinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1){
      System.out.println("Error no library");
    }
    else {
      for (String book : library.keySet()){
        if(library.get(book) == true){
          System.out.println(book);
        }
        else{
          System.out.println("The book " + book + " is not here.");
        }
      }
    }
  }
    public static void main(String[] args){
      HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
      myBooks.put("Road Down a Funnel", true);
      myBooks.put("Rat: A Biologoy", false);
      myBooks.put("TimeIn", true);
      myBooks.put("3D Food Printing", false);

      Library myLibrary = new Library();
      myLibrary.getFinishedBooks(myBooks);


  }
}