package com.example.qq.recyclerview_design.GetSet;

/**
 * Created by Sarayut on 12/8/2561.
 */
public class Products {

    private int _imgProduct;
    private String _price;
    private int _id;

    public Products() {
    }

    public Products(int _imgProduct, String _price) {
        this._imgProduct = _imgProduct;
        this._price = _price;
    }

    public int get_imgProduct() {
        return _imgProduct;
    }

    public void set_imgProduct(int _imgProduct) {
        this._imgProduct = _imgProduct;
    }

    public String get_price() {
        return _price;
    }

    public void set_price(String _price) {
        this._price = _price;
    }
}
