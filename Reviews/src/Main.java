public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Smartphone", 200.00f, 10.0);

        p1.addReview(4.5f, "Great phone with excellent features!", "Loved it!");
        p1.addReview(3.0f, "Good but could be better.", "Average");
        p1.addReview(5.0f, "Exceeded expectations!", "Fantastic!");
        p1.addReview(4.0f, "Good performance.", "Worth it");
        p1.addReview(4.8f, "Amazing camera", "Nice look");
        p1.addReview(2.5f, "Battery life is not good.", "Not great");
        p1.addReview(3.7f, "Best one", "Wonderful product");
        p1.addReview(4.9f, "Perfect phone", "Highly recommend");
        p1.addReview(3.3f, "Price is okay", "Affordable");
        p1.addReview(4.2f, "Very reliable and durable.", "Amazing!");

        p1.addReview(5.0f, "Best phone", "Fantastic product");

        System.out.println("\nAll Reviews:");
        p1.printReviews();

        p1.deleteReview(1);

        System.out.println("\nReviews after removal:");
        p1.printReviews();
    }
}