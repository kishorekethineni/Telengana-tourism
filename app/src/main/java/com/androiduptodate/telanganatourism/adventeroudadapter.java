package com.androiduptodate.telanganatourism;




import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Belal on 10/18/2017.
 */


class adventeroudadapter extends RecyclerView.Adapter<adventeroudadapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<adventerouss> adventurelist;

    //getting the context and product list with constructor
    public adventeroudadapter(Context mCtx, List<adventerouss> adventurelist) {
        this.mCtx = mCtx;
        this.adventurelist = adventurelist;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.adventerousitem, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        adventerouss adventure = adventurelist.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(adventure.getTitle());
        holder.textViewShortDesc.setText(adventure.getShortdesc());
        holder.textViewRating.setText(String.valueOf(adventure.getRating()));
        holder.textViewPrice.setText(String.valueOf(adventure.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(adventure.getImage()));

    }


    @Override
    public int getItemCount() {
        return adventurelist.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitlead);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDescad);
            textViewRating = itemView.findViewById(R.id.textViewRatingad);
            textViewPrice = itemView.findViewById(R.id.textViewPricead);
            imageView = itemView.findViewById(R.id.imageViewad);
        }
    }
}
