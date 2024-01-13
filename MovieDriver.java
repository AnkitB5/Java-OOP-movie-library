import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int modeSelector;
        boolean userModeFallback = false; 
        Movies.moviesList.add(new Movies("INTERSTELLAR", "SCIFI", "MATHEW MCCONAUGHEY", "2014"));
        Movies.moviesList.add(new Movies("THE GODFATHER", "CRIME", "MARLON BRANDO","1972"));
        Movies.moviesList.add(new Movies("OPPENHEIMER", "HISTORICAL DRAMA", "CILLIAN MURPHY", "2023"));
        Movies.moviesList.add(new Movies("INCEPTION", "SCIFI", "LEONARDO DICAPRIO", "2010"));
        Movies.moviesList.add(new Movies("THE MATRIX","SCIFI","KEANU REEVES", "1999"));
        Movies.moviesList.add(new Movies("JOHN WICK","ACTION","KEANU REEVES", "2014"));
        Movies.moviesList.add(new Movies("SPIDERMAN NO WAY HOME","ACTION","TOM HOLLAND", "2021"));
        Movies.moviesList.add(new Movies("TOP GUN MAVERICK","ACTION","TOM CRUISE", "2022"));
        Movies.moviesList.add(new Movies("LEGALLY BLONDE","DRAMA","REESE WITHERSPOON", "2001"));
        while (true) {
            //adding movies (objects) to start with 
            while (true){
                //input validation
                while (true) {
                    System.out.println("Choose manager mode or User mode\nenter 1 for manager mode\nenter 2 for User mode");
                    try {
                        modeSelector = input.nextInt();
                        input.nextLine(); 
                        break;
                    } catch (InputMismatchException e) {
                        input.nextLine(); 
                        System.out.println("Invalid Input\nPlease enter a valid option!");
                    }
                }
               
                //Manager mode
                if (modeSelector == 1) {
                    int option = 0; 
                    int loginAttempts = 3; 
                    String username = null;
                    String password = null;  
                    String setUsername = "ankit"; 
                    String setPassword = "bhattarai";              
                    while (loginAttempts > 0){
                        System.out.println("\nManager Mode - \nEnter Username:");
                        username = input.nextLine();
                        System.out.println("Enter Password:");
                        password = input.nextLine();
                       if ((setUsername.equals(username))&&(setPassword.equals(password))) {
                           break; 
                        }
                        else {
                            System.out.println("Invalid Manager Username/Password; You will be switched to User Mode!");
                            loginAttempts--;
                            System.out.println("Attempts Remaining: "+ loginAttempts); 
                            }  
                        }
                    if (loginAttempts <=0){
                        System.out.println("\nToo many login attempts.\nSwitching to User Mode.");
                        userModeFallback = true; 
                               }
                    if ((setUsername.equals(username))&&(setPassword.equals(password))) {
                        System.out.println("Manager Mode Verified!");
                        while (true) {
                        do {
                            while (true) {
                                System.out.println("Options:\n1 View All Movies\n2 Search\n3 Sort\n4 Add Movie\n5 Remove Movie");
                                try { 
                                    option = input.nextInt(); 
                                    break;
                                }
                                catch (InputMismatchException e) {
                                    input.nextLine(); 
                                    System.out.println("Invalid Input\nPlease enter a valid option!");
                                    }
                            }
                            Movies movies = new Movies("Sample Title", "Sample Genre", "Sample Actor", "Sample Year");
                            //diffrent options in manager mode
                            switch (option) {
                                case 1:
                                    movies.displayAllTitles();
                                    input.nextLine();
                                    break; 
                                 
                                case 2:
                                    int c2; 
                                    System.out.println("Select what you want to search\n1 Search Titles\n2 Search Actors\n3 Search Genres\n4 All Search Release Dates");
                                    c2 = input.nextInt(); 
                                    if (c2 == 1) {
                                        System.out.println("Enter the title to search:");
                                        input.nextLine();
                                        String titleToSearch = input.nextLine();
                                        movies.searchByTitle(titleToSearch);
                                    }
                                    else if (c2 == 2){
                                      System.out.println("Enter the Actor to search:");
                                        input.nextLine();
                                        String actorToSearch = input.nextLine();
                                        movies.searchByActor(actorToSearch);  
                                    }
                                    else if (c2 == 3){
                                        System.out.println("Enter the genre to search:");
                                        input.nextLine();
                                        String genreToSearch = input.nextLine();
                                        movies.searchByGenre(genreToSearch);
                                    }
                                    else if (c2 == 4){
                                        System.out.println("Enter the Release Year to search:");
                                        input.nextLine();
                                        String yearToSearch = input.nextLine();
                                        movies.searchByYear(yearToSearch);
                                    } 
                                    else{
                                       System.out.println("Invalid Input, Please try again");  
                                    }
                                    break; 
                                    
                                case 3:
                                    while (true) {
                                        int c3; 
                                        System.out.println("Select how you would like to sort\n1 By Titles\n2 By Actor\n3 By Genres\n4 By Release Dates");
                                        c3 = input.nextInt(); 
                                       if (c3 == 1){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByTitle();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByTitleReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break;
                                        }
                                        else if (c3 == 2){
                                           System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByActor();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByActorReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            } 
                                            break; 
                                        }
                                        else if (c3 == 3){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByGenre();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByGenreReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break; 
                                        }
                                        else if (c3 == 4){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. Asscending Order\n2. Descending Order");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByYear();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByYearReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break; 
                                        } 
                                        else{
                                           System.out.println("Invalid Input, Please try again");  
                                        }
                                    }
                                    break; 
                                    
                                case 4: 
                                    String title;
                                    String genre;
                                    String leadActor;
                                    String year;
                                    System.out.println("Add a movie(if you do not have the information, you can just hit enter):");
                                    input.nextLine();
                                    System.out.println("What is the title of the movie?");
                                    title = input.nextLine(); 
                                    System.out.println("What genre is this movie classified as?");
                                    genre = input.nextLine();
                                    System.out.println("Who is the lead actor/actress in this movie?");
                                    leadActor= input.nextLine();
                                    System.out.println("When was this movie released?");
                                    year= input.nextLine();
                                    Movies.moviesList.add(new Movies(title.toUpperCase(), genre.toUpperCase(), leadActor.toUpperCase(), year));
                                    
                                    System.out.println("Would you like to display all of the movies? (Y/N)");
                                    String displayPrompt = input.nextLine().toLowerCase(); 
                                    switch (displayPrompt){
                                        case ("y"):
                                            movies.displayAllTitles();
                                            break; 
                                        case ("n"):
                                            break; 
                                        
                                        default:
                                            System.out.println("Invalid input");  
                                    }
                                    break; 
                                    
                                case 5:
                                    int c5; 
                                    System.out.println("Removing a Movie:\n1 Would you like to remove a movie?\n2 Would you like to remove details from a movie?");
                                    c5 = input.nextInt(); 
                                    while (true){
                                    if (c5 == 1){
                                        System.out.println("Enter the title of the movie to remove:");
                                        input.nextLine();
                                        String titleToSearch = input.nextLine();
                                        movies.removeMovie(titleToSearch);
                                        break;
                                    }
                                    else if (c5 == 2){
                                        /*System.out.println("Enter the title of the movie to access:");
                                        input.nextLine();
                                        String titleToSearch = input.nextLine();
                                        movies.searchByTitle(titleToSearch);*/
                                        System.out.println("Choose which aspect to remove");
                                        System.out.println("1 Title\n 2 Actor\n3 Genre \n4 Release date");
                                        int removeOption = input.nextInt(); 
                                        switch (removeOption){
                                            case 1:
                                                System.out.println("Enter the title of the movie to access:");
                                                input.nextLine();
                                                String titleToRemove = input.nextLine();
                                                movies.removeTitleFromMovie(titleToRemove);
                                                break; 
                                            case 2:
                                                System.out.println("Enter the Actor of the movie to access:");
                                                input.nextLine();
                                                String actorToRemove = input.nextLine();
                                                movies.removeActorFromMovie(actorToRemove);
                                                break; 
                                            case 3:
                                                System.out.println("Enter the genre of the movie to access:");
                                                input.nextLine();
                                                String genreToRemove = input.nextLine();
                                                movies.removeGenreFromMovie(genreToRemove);
                                                break; 
                                            case 4:
                                                System.out.println("Enter the release year of the movie to access:");
                                                input.nextLine();
                                                String yearToRemove = input.nextLine();
                                                movies.removeYearFromMovie(yearToRemove);
                                                break; 
                                            default:
                                                System.out.println("Invalid input");
                                        }
                                        break;  
                                    }
                                    else{
                                       System.out.println("Invalid Input, Please try again");  
                                    }
                                }
                                break; 
                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    
                            }
                            }while (option < 1 || option >5);
                            
                            String managerExit; 
                            System.out.println("Would you like to exit manager mode?(Y/N)");
                            managerExit = input.nextLine();
                            if (managerExit.equalsIgnoreCase("y")){
                                System.out.println("You have logged out of manager mode");
                             break;   
                            }
                        }
                        break; 
                        } 
                }
                //User Mode
                if ((modeSelector == 2)||(userModeFallback == true)){
                    int option; 
                    System.out.println("\nUser Mode Activated!");
                    while (true){
                    do {
                        
                            while (true) {
                                System.out.println("Options:\n1 View All Movies\n2 Search\n3 Sort");
                                try {
                                    option = input.nextInt(); 
                                    break;
                                }
                                catch (InputMismatchException e) {
                                    input.nextLine(); 
                                    System.out.println("Invalid Input\nPlease enter a valid option!");
                                    }
                            }
                            //Diffrent options in User Mode 
                            Movies movies = new Movies("Sample Title", "Sample Genre", "Sample Actor", "Sample Year");
                            
                            switch (option) {
                                case 1:
                                    movies.displayAllTitles();
                                    input.nextLine();
                                    break; 
                                 
                                case 2:
                                    int c2; 
                                    System.out.println("Select what you want to search\n1 Search Titles\n2 Search Actors\n3 Search Genres\n4 All Search Release Dates");
                                    c2 = input.nextInt(); 
                                    if (c2 == 1) {
                                        System.out.println("Enter the title to search:");
                                        input.nextLine();
                                        String titleToSearch = input.nextLine();
                                        movies.searchByTitle(titleToSearch);
                                    }
                                    else if (c2 == 2){
                                      System.out.println("Enter the Actor to search:");
                                        input.nextLine();
                                        String actorToSearch = input.nextLine();
                                        movies.searchByActor(actorToSearch);  
                                    }
                                    else if (c2 == 3){
                                        System.out.println("Enter the genre to search:");
                                        input.nextLine();
                                        String genreToSearch = input.nextLine();
                                        movies.searchByGenre(genreToSearch);
                                    }
                                    else if (c2 == 4){
                                        System.out.println("Enter the Release Year to search:");
                                        input.nextLine();
                                        String yearToSearch = input.nextLine();
                                        movies.searchByYear(yearToSearch);
                                    } 
                                    else{
                                       System.out.println("Invalid Input, Please try again");  
                                    }
                                    break; 
                                    
                                case 3:
                                    while (true) {
                                        int c3; 
                                        System.out.println("Select how you would like to sort\n1 By Titles\n2 By Actor\n3 By Genres\n4 By Release Dates");
                                        c3 = input.nextInt(); 
                                       if (c3 == 1){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByTitle();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByTitleReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break;
                                        }
                                        else if (c3 == 2){
                                           System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByActor();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByActorReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            } 
                                            break; 
                                        }
                                        else if (c3 == 3){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. A - Z\n2. Z - A");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByGenre();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByGenreReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break; 
                                        }
                                        else if (c3 == 4){
                                            System.out.println("Please choose your sorting style"); 
                                            System.out.println("1. Asscending Order\n2. Descending Order");
                                            int sortStyle = input.nextInt(); 
                                            switch (sortStyle){
                                                case 1:
                                                    movies.sortByYear();
                                                    input.nextLine();
                                                    break; 
                                                case 2:
                                                    movies.sortByYearReverse();
                                                    input.nextLine();
                                                    break; 
                                                default:
                                                    System.out.println("Invalid option please try again"); 
                                            }
                                            break; 
                                        } 
                                        else{
                                           System.out.println("Invalid Input, Please try again");  
                                        }
                                    }
                                    break; 
                                                                        
                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    
                            }
                            }while (option < 1 || option >3);
                            String userExit; 
                            System.out.println("Would you like to exit user mode?(Y/N)");
                            userExit = input.nextLine();
                            if (userExit.equalsIgnoreCase("y")){
                                System.out.println("You have logged out of manager mode");
                             break;   
                            }
                        }
                        
                    break;
                } 
                else {
                    System.out.println("Invalid Input\nPlease enter a valid option!");
                }
                
            }
            System.out.println("\nWould you like to exit this program? (Y/N)");
            String response = input.nextLine();
            if (!response.equalsIgnoreCase("n")) {
                break; // Exit the loop if the user doesn't want to create another array
            }
        }

        System.out.println("Thank you for using this program. See you next time!");
        input.close();


    }
    
}
