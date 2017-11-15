package com.example.user.project;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    List<ListItem> listItems;
    Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(v);

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Head;
        ImageView image;
        TextView Desc;
        TextView price;


        public ViewHolder(View itemView) {
            super(itemView);

            Head = (TextView) itemView.findViewById(R.id.textViewHead);
            image = (ImageView) itemView.findViewById(R.id.imageview);
            Desc = (TextView)itemView.findViewById(R.id.Desc);
            price = (TextView) itemView.findViewById(R.id.price);

        }
    }




//    prep_Data_for_sending
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final ListItem listItem = listItems.get(position);
        holder.Head.setText(listItem.getHead());
        holder.image.setImageResource(listItem.getImage());
        holder.Desc.append(listItem.getDesc());
        holder.price.setText(listItem.getPrice());



//send_Data_from_Text
        holder.Head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDetails.class);
                intent.putExtra("Head", listItem.getHead());
                intent.putExtra("bmp",listItem.getImage());
                intent.putExtra("description",listItem.getDesc());
                intent.putExtra("price",listItem.getPrice());

                context.startActivity(intent);

            }
        });
//send_Data_from_Image
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDetails.class);
                intent.putExtra("Head", listItem.getHead());
                intent.putExtra("bmp",listItem.getImage());
                intent.putExtra("description",listItem.getDesc());
                intent.putExtra("price",listItem.getPrice());

                context.startActivity(intent);

            }
        });


    }

}

