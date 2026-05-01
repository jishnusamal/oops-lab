interface IGenre {
    String[] Genre = {"Romance", "Comedy", "Fiction", "Dark", "Fantasy"};
}

class Book implements IGenre{
    String isbn;
    String genre;

    Book(String isbn, String genre) {
        this.isbn = isbn;
        this.genre = genre;
    }

    void displayBook() {
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Genre: "+this.genre);
    }

    void checkGenre() throws GenreUnavailableException {
        boolean inGenre = false;
        for (String g: Genre) {
            if (this.genre == g) {
                inGenre = true;
            }
        }

        if (!inGenre) {
            throw new GenreUnavailableException("This book is not issuable");
        }
    }

}

class GenreUnavailableException extends Exception {
    GenreUnavailableException(String message) {
        super(message);
    }
}

public class bookDemo {
    public static void main(String[] args) {
        Book HarryPotter = new Book("Harry Potter", "Hello");
        HarryPotter.displayBook();
        try {
            HarryPotter.checkGenre();
        } catch (GenreUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
