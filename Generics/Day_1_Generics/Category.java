package Day_1_Generics;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() { return "Books"; }
}

class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}

class GadgetCategory implements Category {
    public String getCategoryName() { return "Gadgets"; }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println(category.getCategoryName() + ": " + name + " - $" + price);
    }
}

class DiscountManager {
    public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}

