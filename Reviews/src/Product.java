public class Product {
    private int id;
    private String title;
    private float price;
    private double discount;
    private Review[] arr;
    private int Count;

    public Product(int id, String title, float price, double discount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.discount = discount;
        this.arr = new Review[10];
        this.Count = 0;
    }

    public class Review {
        private float rating;
        private String reviewBody;
        private String reviewTitle;

        public Review(float rating, String reviewBody, String reviewTitle) {
            this.rating = rating;
            this.reviewBody = reviewBody;
            this.reviewTitle = reviewTitle;
        }

        public void displayReview() {
            System.out.println("Rating: " + rating);
            System.out.println("Title: " + reviewTitle);
            System.out.println("Review: " + reviewBody);
        }
    }

    public void addReview(float rating, String reviewBody, String reviewTitle) {
        if (Count < 10) {
            arr[Count++] = new Review(rating, reviewBody, reviewTitle);
        } else {
            System.out.println("Cannot add more than 10 reviews.");
        }
    }

    public void deleteReview(int index) {
        if (index >= 0 && index < Count) {
            for (int i = index; i < Count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[--Count] = null;
        }
    }

    public void printReviews() {
        for (int i = 0; i < Count; i++) {
            arr[i].displayReview();
            System.out.println();
        }
    }
}