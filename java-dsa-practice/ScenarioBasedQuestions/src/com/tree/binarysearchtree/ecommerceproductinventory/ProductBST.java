package com.tree.binarysearchtree.ecommerceproductinventory;

public class ProductBST {

	private ProductNode root;

    // 🔹 Insert product
    public void insert(Product product) {
        root = insertRec(root, product);
    }

    private ProductNode insertRec(ProductNode root, Product product) {
        if (root == null) {
            return new ProductNode(product);
        }

        if (product.sku < root.product.sku) {
            root.left = insertRec(root.left, product);
        } else if (product.sku > root.product.sku) {
            root.right = insertRec(root.right, product);
        }

        return root;
    }

    // 🔹 Lookup product by SKU
    public Product search(int sku) {
        ProductNode node = searchRec(root, sku);
        return node != null ? node.product : null;
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null || root.product.sku == sku) {
            return root;
        }

        if (sku < root.product.sku) {
            return searchRec(root.left, sku);
        }

        return searchRec(root.right, sku);
    }

    // 🔹 Update price using SKU
    public boolean updatePrice(int sku, double newPrice) {
        Product product = search(sku);
        if (product != null) {
            product.price = newPrice;
            return true;
        }
        return false;
    }

    // 🔹 Display products in sorted SKU order
    public void displayInOrder() {
        inorderRec(root);
    }

    private void inorderRec(ProductNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(
                "SKU: " + root.product.sku +
                ", Name: " + root.product.name +
                ", Price: ₹" + root.product.price
            );
            inorderRec(root.right);
        }
    }
}