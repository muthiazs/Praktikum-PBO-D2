class Seller {
    private int sellerID;
    private String address;
    private String phone;
    private String email;
    private double sellerRating;

    // Constructor
    public Seller(int sellerID, String address, String phone, String email, double sellerRating) {
        this.sellerID = sellerID;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.sellerRating = sellerRating;
    }

    // Method to sell a product
    public void sellProduct() {
        // Implementation of sellProduct method
        System.out.println("Produk berhasil dijual.");
    }

    // Method to get seller details
    public void getSellerDetails() {
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Alamat: " + address);
        System.out.println("No HP: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Seller Rating: " + sellerRating);
    }

    // Getters and Setters
    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSellerRating() {
        return sellerRating;
    }

    public void setSellerRating(double sellerRating) {
        this.sellerRating = sellerRating;
    }
}
