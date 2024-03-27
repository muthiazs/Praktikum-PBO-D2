import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang!");

        // Objek-objek
        User user = new User(1, "Muthia", "Jl Mulawarman Raya Semarang", "123-456-7890", "muthiazs@example.com");
        Orders lastOrder = null; // Asumsikan belum ada order terakhir

        // Daftar produk
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, "Baju Mickey", 50000, 1));
        products.put(2, new Product(2, "Dress Mickey", 75000, 1));
        products.put(3, new Product(3, "Celana Mickey", 60000, 1));
        products.put(4, new Product(4, "Kemeja Pink", 65000, 2));
        products.put(5, new Product(5, "Kerudung Pink", 35000, 2));

        // Interaksi dengan pengguna
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nSelamat datang di Toko Online Xalora");
            System.out.println("Apa yang ingin Anda lakukan?:");
            System.out.println("1. Berbelanja");
            System.out.println("2. Lihat Keranjang");
            System.out.println("3. Lihat Detail Pesanan Terakhir");
            System.out.println("4. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Berbelanja
                    System.out.println("List Produk di Xalora Shop:");
                    for (Map.Entry<Integer, Product> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue().getProductName());
                    }

                    // Pilih produk
                    System.out.println("Pilih produk (masukkan nomor produk):");
                    int productChoice = scanner.nextInt();
                    scanner.nextLine(); // Buang newline setelah nextInt()

                    Product selectedProduct = products.get(productChoice);
                    if (selectedProduct != null) {
                        // Tampilkan detail produk
                        System.out.println("Detail Produk:");
                        selectedProduct.getProductDetails();

                        // Pilih tindakan selanjutnya (beli atau tambahkan ke keranjang)
                        System.out.println("Pilih tindakan:");
                        System.out.println("1. Beli Produk");
                        System.out.println("2. Tambahkan ke Keranjang");

                        int actionChoice = scanner.nextInt();
                        scanner.nextLine(); // Buang newline setelah nextInt()

                        if (actionChoice == 1) {
                            // Beli produk
                            selectedProduct.buyProduct();
                            lastOrder = new Orders(1, selectedProduct.getSellerID(), user.getIdCustomer(), selectedProduct.getIdProduct(), selectedProduct.getProductCost(), user.getAddress());
                        } else if (actionChoice == 2) {
                            // Tambahkan ke keranjang
                            user.addProductToCart(selectedProduct.getProductName());
                            System.out.println(selectedProduct.getProductName() + " telah ditambahkan ke keranjang.");
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;
                case 2:
                    // Lihat keranjang dan beli sekarang
                    System.out.println("Isi Keranjang:");
                    user.viewCart();
                    double totalHarga = user.getTotalCartPrice(products);
                    System.out.println("Total Harga Keranjang: $" + totalHarga);
                    if (!user.getCart().isEmpty()) {
                        System.out.println("Apakah Anda ingin membeli sekarang? (y/n)");
                        String buyChoice = scanner.nextLine();
                        if (buyChoice.equalsIgnoreCase("y")) {
                            for (String productName : user.getCart()) {
                                for (Product product : products.values()) {
                                    if (productName.equals(product.getProductName())) {
                                        product.buyProduct();
                                        lastOrder = new Orders(1, product.getSellerID(), user.getIdCustomer(), product.getIdProduct(), product.getProductCost(), user.getAddress());
                                        System.out.println("Anda berhasil membeli " + productName + " seharga $" + product.getProductCost());
                                        break;
                                    }
                                }
                            }
                            user.getCart().clear(); // Kosongkan keranjang setelah pembelian
                        } else {
                            System.out.println("Pembelian dibatalkan.");
                        }
                    }
                    break;
                case 3:
                    if (lastOrder != null) {
                        // Lihat detail pesanan terakhir
                        System.out.println("Detail Pesanan Terakhir:");
                        lastOrder.getOrderDetails();
                    } else {
                        System.out.println("Belum ada pesanan terakhir.");
                    }
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
