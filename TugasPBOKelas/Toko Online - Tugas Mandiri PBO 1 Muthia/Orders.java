import java.time.LocalDate;

class Orders {
    private int idOrder;
    private int sellerID;
    private int idCustomer;
    private int idProduct;
    private double totalAmount;
    private LocalDate orderDate;
    private String address;
    private LocalDate deliveredDate;
    private String deliveryStatus;

    // Constructor
    public Orders(int idOrder, int sellerID, int idCustomer, int idProduct, double totalAmount, String address) {
        this.idOrder = idOrder;
        this.sellerID = sellerID;
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
        this.totalAmount = totalAmount;
        this.orderDate = LocalDate.now();
        this.address = address;
        this.deliveryStatus = "Pending"; // By default, order status is pending
    }

  
    public void placeOrder() {
        // Implementation of placeOrder method
        System.out.println("Pemebelian berhasil.");
    }

    // Method untuk mendapatkan details produk
    public void getOrderDetails() {
        System.out.println("Order ID: " + idOrder);
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Customer ID: " + idCustomer);
        System.out.println("Product ID: " + idProduct);
        System.out.println("Total Harga: Rp" + totalAmount);
        System.out.println("Tanggal pesan: " + orderDate);
        System.out.println("Alamat: " + address);
        System.out.println("Status Pemesanan: " + deliveryStatus);
        if (deliveredDate != null) {
            System.out.println("Delivered Date: " + deliveredDate);
        }
    }

    // Getters and Setters
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(LocalDate deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
