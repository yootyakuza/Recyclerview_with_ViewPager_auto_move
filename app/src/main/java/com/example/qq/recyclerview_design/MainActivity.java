package com.example.qq.recyclerview_design;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.qq.recyclerview_design.Adapter.ProductsAdapter;
import com.example.qq.recyclerview_design.Adapter.ViewPagerAdapter;
import com.example.qq.recyclerview_design.GetSet.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private List<Products> productsList;
    private RecyclerView recyclerView, recyclerView2;
    private ProductsAdapter adapter;
    private Context context;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        context = this;
        productsList = prepareProducts();
        recyclerView = findViewById(R.id.recycler_id);
        recyclerView2 = findViewById(R.id.recycler_id2);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(context);

        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);

        adapter = new ProductsAdapter(productsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter(adapter);

        Toast.makeText(context, "adapter no.: " + String.valueOf(adapter.getItemCount()), Toast.LENGTH_SHORT).show();

    }

    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }

    private List<Products> prepareProducts() {

        List<Products> list = new ArrayList<Products>();
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));
        list.add(new Products(R.drawable.slot1, "15" + " ฿"));
        list.add(new Products(R.drawable.slot2, "20" + " ฿"));
        list.add(new Products(R.drawable.slot3, "15" + " ฿"));
        list.add(new Products(R.drawable.slot4, "15" + " ฿"));
        list.add(new Products(R.drawable.slot5, "20" + " ฿"));

        return list;
    }
}
