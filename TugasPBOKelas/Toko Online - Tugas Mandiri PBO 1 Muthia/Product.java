import java.time.LocalDate;

class Product {
    private int idProduct;
    private String productName;
    private double productCost;
    private int sellerID;
    private LocalDate postedDate;

    // Constructor
    public Product(int idProduct, String productName, double productCost, int sellerID) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productCost = productCost;
        this.sellerID = sellerID;
        this.postedDate = LocalDate.now();
    }

    // Method to add the product to the cart
    public void addToCart() {
        // Implementation of addToCart method
        System.out.println(productName + " ditambahkan ke keranjang.");
    }

    // Method to get product details
    public void getProductDetails() {
        System.out.println("Produk ID: " + idProduct);
        System.out.println("Nama Produk: " + productName);
        System.out.println("Harga: Rp" + productCost);
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Tanggal di post: " + postedDate);
    }

    // Method to buy the product
    public void buyProduct() {
        // Implementation of buyProduct method
        System.out.println("Kamu membeli" + productName + " seharga" + productCost);
    }

    // Getters and Setters
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }
}
