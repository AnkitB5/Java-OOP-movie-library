import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movies {
    public static ArrayList<Movies> moviesList = new ArrayList<>(); 

    private String title;
    private String genre;
    private String leadActor;
    private String year; 

    public Movies(String title, String genre, String leadActor, String year) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.year = year; 
    }
    // Getters
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
        }
    public String getActor() {
        return leadActor;
        }
    public String getYear() {
        return year;
        }
    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setActor(String actor) {
        this.leadActor = actor;
    }

    //View ALl
    public void displayAllTitles() {
        System.out.println("All Movie:");
        for (Movies movie : moviesList) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Lead Actor: " + movie.getActor());
            System.out.println("Year: " + movie.getYear());
            System.out.println("-----------------------");}
    }
       //Remove
    public void removeMovie(String titleToSearch) {
        ArrayList<Movies> results = new ArrayList<>();
        for (Movies movie : moviesList) {
            if (movie.getTitle().toLowerCase().contains(titleToSearch.toLowerCase())) {
                results.add(movie);
            }
        }
    
        if (results.isEmpty()) {
            System.out.println("No movies found with the given title.");
        } else {
            System.out.println("The following movie(s) is removed:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
            }
        }
        for(Movies movie: results){
            moviesList.remove(movie); 
        }
    }
     // Remove Title from a Movie
    public void removeTitleFromMovie(String titleToRemove) {
        for (Movies movie : moviesList) {
            if (movie.getTitle().equalsIgnoreCase(titleToRemove)) {
                movie.setTitle(null);
                System.out.println("Title removed successfully from movie with title '" + titleToRemove + "'.");
            }
        }
    }

    public void removeGenreFromMovie(String genreToRemove) {
        for (Movies movie : moviesList) {
            if (movie.getGenre().equalsIgnoreCase(genreToRemove)) {
                movie.setGenre(null);
                System.out.println("Genre removed successfully from movie with genre '" + genreToRemove + "'.");
            }
        }
    }

    public void removeYearFromMovie(String yearToRemove) {
        for (Movies movie : moviesList) {
            if (movie.getYear().equalsIgnoreCase(yearToRemove)) {
                movie.setYear(null);
                System.out.println("Release year removed successfully from movie with year '" + yearToRemove + "'.");
            }
        }
    }

    public void removeActorFromMovie(String actorToRemove) {
        for (Movies movie : moviesList) {
            if (movie.getActor().equalsIgnoreCase(actorToRemove)) {
                movie.setActor(null);
                System.out.println("Lead actor removed successfully from movie with actor '" + actorToRemove + "'.");
            }
        }
    }


    //Search
    public void searchByTitle(String titleToSearch) {
        ArrayList<Movies> results = new ArrayList<>();
        for (Movies movie : moviesList) {
            if (movie.getTitle().toLowerCase().contains(titleToSearch.toLowerCase())) {
                results.add(movie);
            }
        }
    
        if (results.isEmpty()) {
            System.out.println("No movies found with the given title.");
        } else {
            System.out.println("Search results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
            }
        }
    }
 
    
   
    
    public void searchByActor(String actorToSearch) {
        ArrayList<Movies> results = new ArrayList<>();
        for (Movies movie : moviesList) {
            if (movie.getActor().toLowerCase().contains(actorToSearch.toLowerCase())) {
                results.add(movie);
            }
        }
    
        if (results.isEmpty()) {
            System.out.println("No movies found with the given title.");
        } else {
            System.out.println("Search results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
            }
        }
    }
    public void searchByGenre(String genreToSearch) {
        ArrayList<Movies> results = new ArrayList<>();
        for (Movies movie : moviesList) {
            if (movie.getGenre().toLowerCase().contains(genreToSearch.toLowerCase())) {
                results.add(movie);
            }
        }
    
        if (results.isEmpty()) {
            System.out.println("No movies found with the given title.");
        } else {
            System.out.println("Search results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
            }
        }
    }
    public void searchByYear(String yearToSearch) {
        ArrayList<Movies> results = new ArrayList<>();
        for (Movies movie : moviesList) {
            if (movie.getYear().toLowerCase().contains(yearToSearch.toLowerCase())) {
                results.add(movie);
            }
        }
    
        if (results.isEmpty()) {
            System.out.println("No movies found with the given title.");
        } else {
            System.out.println("Search results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
            }
        }
    }
    //Sort
    //the java utility Collections class allows us to sort arraylist
    //the java utility comparator is an interface that allows us to sort objects which are custom from the regular java data types
        
    public void sortByTitle(){
        System.out.println("Sorted by Title (A-Z):");
        ArrayList<Movies> results = new ArrayList<>();
        for(Movies movie: moviesList){
           results.add(movie);
        }
        Collections.sort(results, Comparator.comparing(Movies::getTitle));

        System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }
    
    public void sortByTitleReverse(){
        System.out.println("Sorted by Title (Z - A):");
        ArrayList<Movies> results = new ArrayList<>();
        for(Movies movie: moviesList){
           results.add(movie);
        }
        Collections.sort(results, Comparator.comparing(Movies::getTitle).reversed());

        System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }
    public void sortByActor(){
      System.out.println("Sorted by Title (A-Z):");
       ArrayList<Movies> results = new ArrayList<>();
       for(Movies movie: moviesList){
           results.add(movie);
       }
       Collections.sort(results, Comparator.comparing(Movies::getActor));
       System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }
    
    public void sortByActorReverse(){
            System.out.println("Sorted by Title (Z - A):");
        ArrayList<Movies> results = new ArrayList<>();
        for(Movies movie: moviesList){
           results.add(movie);
        }
         Collections.sort(results, Comparator.comparing(Movies::getActor).reversed());
       
        System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    } 
    
    public void sortByGenre(){
      System.out.println("Sorted by Title (A-Z):");
       ArrayList<Movies> results = new ArrayList<>();
       for(Movies movie: moviesList){
           results.add(movie);
       } 
       Collections.sort(results, Comparator.comparing(Movies::getGenre));
       System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }
    public void sortByGenreReverse(){
             System.out.println("Sorted by Title (Z - A):");
        ArrayList<Movies> results = new ArrayList<>();
        for(Movies movie: moviesList){
           results.add(movie);
        }
        Collections.sort(results, Comparator.comparing(Movies::getGenre).reversed());
        System.out.println("Sorted results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }   
    
    public void sortByYear(){
       System.out.println("Sorted by Title (A-Z):");
       ArrayList<Movies> results = new ArrayList<>();
       for(Movies movie: moviesList){
           results.add(movie);
       } 
       Collections.sort(results, Comparator.comparingInt(movie -> Integer.parseInt(movie.getYear())));
        
       System.out.println("Ascending results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }
    public void sortByYearReverse(){
              System.out.println("Sorted by Title (Z - A):");
        ArrayList<Movies> results = new ArrayList<>();
        for(Movies movie: moviesList){
            Integer.parseInt(movie.getYear()); 
           results.add(movie);
        }
        Collections.sort(results, Comparator.comparingInt(movie -> Integer.parseInt(movie.getYear())));
        Collections.reverse(results);      
        System.out.println("Descending results:");
            for (Movies movie : results) {
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Lead Actor: " + movie.getActor());
                System.out.println("Year: " + movie.getYear());
                System.out.println("-----------------------");
        }
    }  
    
}
