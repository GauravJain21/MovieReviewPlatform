import Movie.Movie;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/gaurav/IdeaProjects/MovieReviewPlatform/src/input.txt"));
        PrintStream out = new PrintStream(new FileOutputStream("/home/gaurav/IdeaProjects/MovieReviewPlatform/src/output.txt"));
        System.setOut(out);
        MovieReviewPlatform movieReviewPlatform = new MovieReviewPlatform();
        String[] input = reader.readLine().trim().split("\\s+");
        while ("exit".equals(input[0]) == false) {
            switch (input[0]){
                case "addMovie":
                    movieReviewPlatform.addMovie(input);
                    break;
                case "addUser":
                    movieReviewPlatform.addUser(input[1]);
                    break;
                case "addReview":
                    movieReviewPlatform.addReview(input[1], input[2], Integer.parseInt(input[3]));
                    break;
                case "updateReview":
                    break;
                case "deleteReview":
                    break;
                case "listReview":
                    movieReviewPlatform.listReview(input[1]);
                    break;
                case "topReview":
                    if(input.length < 3) {
                        System.out.println("Invalid input");
                    }
                    else {
                        switch (input[1]) {
                            case "genre":
                                movieReviewPlatform.listReviewByGenre(input[3], Integer.parseInt(input[1]));
                                break;
                            case "year":
                                movieReviewPlatform.listReviewByYear(Integer.parseInt(input[3]), Integer.parseInt(input[1]));
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Enter valid command");
                    break;
            }
        }
        input = reader.readLine().trim().split("\\s+");
    }
}
