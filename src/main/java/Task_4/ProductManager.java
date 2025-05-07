package Task_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> productList = new ArrayList<Product>(3);

    public ProductManager(Product[] products) {
        productList = Arrays.stream(products).toList();
    }

    public void showAllProducts() {
        productList.forEach(product -> System.out.println(product.getName()));
    }

    public void showShortNamedProducts() {
        productList.stream().filter(product -> product.getName().length() < 5)
                .forEach(System.out::println);
    }

    public void showProductsByInitialLetter(char letter) {
        productList.stream().filter(product -> product.getName().charAt(0) == letter)
                .forEach(System.out::println);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getAllProductsByCategory(ProductCategory category) {
        return productList.stream().filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void showProductsByMaxPrice(double maxPrice) {
        productList.stream().filter(product -> product.getPrice() <= maxPrice)
                .forEach(System.out::println);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public List<Product> getProductWithinBudget(double budget) {
        List<Product> affordableProducts = new ArrayList<>();
        double total = 0;

        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        for(Product product : sortedProducts) {
            if(total + product.getPrice() <= budget) {
                affordableProducts.add(product);
                total += product.getPrice();
            }
        }

        return affordableProducts;
    }

    public void showExpiringProducts() {
        LocalDate targetDate = LocalDate.now().plusDays(2);

        productList.stream().filter(product -> product.getExpiryDate().isEqual(targetDate))
                .forEach(System.out::println);
    }
}
