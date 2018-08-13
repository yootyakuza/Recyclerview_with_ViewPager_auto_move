package com.example.qq.recyclerview_design.Adapter;

import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.qq.recyclerview_design.GetSet.Products;
import com.example.qq.recyclerview_design.R;

import java.util.List;

/**
 * Created by Sarayut on 12/8/2561.
 */
public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {

    private List<Products> productsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView _imgProduct;
        private Button _price;

        public MyViewHolder(View itemView) {
            super(itemView);
            _imgProduct = itemView.findViewById(R.id.imgProduct);
            _price = itemView.findViewById(R.id.tvPrice);
        }
    }

    public ProductsAdapter(List<Products> productsList) {
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_detail, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Products products = productsList.get(position);
        holder._imgProduct.setImageResource(products.get_imgProduct());
        holder._price.setText(products.get_price());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }
}
