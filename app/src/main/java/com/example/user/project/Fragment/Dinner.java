package com.example.user.project.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.project.ListItem;
import com.example.user.project.MyAdapter;
import com.example.user.project.R;

import java.util.ArrayList;
import java.util.List;


public class Dinner extends Fragment {


    RecyclerView recyclerview;
    RecyclerView.Adapter adapter;
    List<ListItem> listItems;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dinner, container, false);

        recyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));

        listItems = new ArrayList<>();

        ListItem curry_rise = new ListItem("Curry and Rise", R.drawable.curry,"Spicy, hot or mild Curry of your choice(Curry, mutton, lamb, chicken, Rise, rooti, naan, daal).","$17.00");
        listItems.add(curry_rise);

        ListItem spaghetti = new ListItem("Spaghetti Bolognese", R.drawable.spaghetti,"200g of Meaty Bolognese served with 80g of Spaghetti.","$14.00");
        listItems.add(spaghetti);

        ListItem mach = new ListItem("Machoroni and Cheese", R.drawable.maccheroni,"Machoroni served with three cheeses on top","$12.00");
        listItems.add(mach);

        ListItem herring = new ListItem("Herring", R.drawable.herring,"300g herring serve with prawns and garlics source","$14.99");
        listItems.add(herring);

        ListItem goulash = new ListItem("Goulash", R.drawable.goulash,"beef strips mixed with noodles with a topping of cheese","$8.99");
        listItems.add(goulash);

        ListItem duck = new ListItem("Peaking Duck", R.drawable.duck,"200g sliced duck served with green salad","$12.99");
        listItems.add(duck);

        ListItem chinese = new ListItem("Chinese Str-fry", R.drawable.chinese_stirfry,"green pepper, red pepper, yellow pepper, mushrooms, broccoli, coliflower, spinach served with Chicken or Beef","$16.00");
        listItems.add(chinese);

        ListItem fejikoada = new ListItem("Feji Koada", R.drawable.feji_koada,"Chicken Kidney served with lettuce and three slices of orange","$9.99");
        listItems.add(fejikoada);

        ListItem draniki = new ListItem("Draniki", R.drawable.draniki,"potato pancakes served with white source","$11.00");
        listItems.add(draniki);

        ListItem brown_stew = new ListItem("Brown Stew", R.drawable.brown_stew,"Lamb Stew served with Rise","$13.00");
        listItems.add(brown_stew);


        adapter = new MyAdapter(listItems,getActivity());

        recyclerview.setAdapter(adapter);

        return rootView;
    }
}
