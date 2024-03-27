import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class User {
    private int idCustomer;
    private String name;
    private String address;
    private String phone;
    private String email;
    private List<String> cart;

    // Constructor
    public User(int idCustomer, String name, String address, String phone, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cart = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProductToCart(String product) {
        cart.add(product);
        System.out.println(product + " ditambahkan ke keranjang.");
    }

    // Method to view the items in the cart
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Keranjang mu kosong:.");
        } else {
            System.out.println("Isi keranjang mu:");
            for (String item : cart) {
                System.out.println("- " + item);
            }
        }
    }
    
    // Method to get product yang ada di cart
    public List<String> getCart() {
        return cart;
    }
    
    // Method u/ menghitung jumlah harga dikeranjang
    public double getTotalCartPrice(Map<Integer, Product> products) {
        double totalPrice = 0;
        for (String productName : cart) {
            for (Product product : products.values()) {
                if (productName.equals(product.getProductName())) {
                    totalPrice += product.getProductCost();
                    break;
                }
            }
        }
        return totalPrice;
    }

    // Getters and Setters
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

