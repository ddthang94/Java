package ArrangingClasses;

public class Products implements Comparable<Products> {
    /* Attributes */
    private int code;
    private String nameOfProduct;
    private double price;

    public int getCode() {
        return code;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    /* toString() methods */

    @Override
    public String toString() {
        return "Products {" +
                "code: " + code +
                ", nameOfProduct: '" + nameOfProduct + '\'' +
                ", price: " + price +
                "$}";
    }

    /* Constructors */
    public Products(int code, String nameOfProduct, double price) {
        this.code = code;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    /* Methods: sorting follow the name */
    @Override
    public int compareTo(Products o) {
        return this.nameOfProduct.compareToIgnoreCase(o.nameOfProduct);
    }

//    /* Methods: sorting increment following the price */
//    @Override
//    public int compareTo(Products o) {
//        if (this.price<o.price)
//            return -1;
//        if (this.price>o.price)
//            return 1;
//        return 0;
//    }
}
