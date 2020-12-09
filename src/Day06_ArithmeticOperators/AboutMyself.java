package Day06_ArithmeticOperators;

public class AboutMyself {

    public static void main(String[] args) {
        // String firstName = "John" , lastName = "Daniel",
        String firstName = "John";
        String lastName = "Daniel";
        String fullName = firstName + " " +lastName;

        String from = "USA";
        String favoriteBook = "Data Structure in Java";
        String favoriteShow = "Game of Thorne";

        System.out.println("fullnName is: " + fullName);
        System.out.println("From: " + from);
        System.out.println("Favorite book is: \"" + favoriteBook + "\"");
        System.out.println("Favorite Show is: " + "\"" + favoriteShow + "\"");


    }



}
/*
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow

    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite book is: "YourFavoriteBook"
        Favorite Show is: "YourFavoriteShow"
        \"

 */