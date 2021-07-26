package FirstSession;

public class StringFormat {
    public static void main(String[] args) {
        String author = "j.r.r.tolkien", title = "Lord of The Rings: The Fellowship of The Ring",
                frontWord = "title:", name = "author:", sheets = "pages:", vintage = "year:", cost = "price:", eur = "€";
        int pages = 423, year = 1954;
        float price = 9.59f;

        String formatString = String.format("%-10s%-50s\n%-10s%-50s\n%-10s%-50d\n%-10s%-50d\n%-10s%-1s%-50.2f",
                frontWord, title, name, author, sheets, pages, vintage, year, cost, eur, price);

    System.out.println(formatString);
    }
}
