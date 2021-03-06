package com.fugenx.ted.mainactivity.adapters;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fugenx.ted.mainactivity.model.Product;
import com.fugenx.ted.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context mCtx;
    private List<Product> productList;
    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_recycler, parent, false);
        mCtx = parent.getContext();
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder( final ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.textView.setText(product.getTextView());
        holder.textView2.setText(product.getTextView2());
        holder.textView3.setText(product.getTextView3());
        holder.image.setImageResource((product.getImage()));
        holder.textViewOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popup = new PopupMenu(mCtx, holder.textViewOptions);
                popup.inflate(R.menu.options_menu);
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                break;
                            case R.id.menu2:
                                break;
                            case R.id.menu3:
                                break;
                        }
                        return false;
                    }
                });
                popup.show();

            }
        });

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView textView,textView2,textView3,textViewOptions;
        ImageView image;

        public ProductViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textViewOptions = itemView.findViewById(R.id.textViewOptions);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}