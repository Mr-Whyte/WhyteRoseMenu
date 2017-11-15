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


public class Lunch extends Fragment {


    RecyclerView recyclerview;
    RecyclerView.Adapter adapter;
    List<ListItem> listItems;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lunch, container, false);

        recyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));

        listItems = new ArrayList<>();

        ListItem burger = new ListItem("Burger and Chips", R.drawable.burger,"Beef/Chicken burger, slice of cheese, tomato, onion rings, served with a side of chips.","$7.00");
        listItems.add(burger);

        ListItem wrap = new ListItem("Wrap", R.drawable.wrap,"Beef/Chicken strips, stir-fry (green pepper, red pepper, yellow pepper, mushrooms, broccoli, coliflower, spinach).","$3.00");
        listItems.add(wrap);

        ListItem salad = new ListItem("Green Salad", R.drawable.salad,"Lettuce, Cocktail Tomatos, Cucumber, green pepper, red pepper, yellow pepper, Fetta Cheese, olives, red onion with smoked chicken(optional).","$4.50");
        listItems.add(salad);

        ListItem chickenstrips = new ListItem("Chicken Strips and Chips", R.drawable.chicken_chips,"Crispy chicken strips served with a side of chips.","$6.00");
        listItems.add(chickenstrips);

        ListItem pizza = new ListItem("Pizza", R.drawable.pizza,"Any pizza of your choice(list of pizza).","$10.00");
        listItems.add(pizza);

        ListItem stirfry = new ListItem("Stir-Fry", R.drawable.stir_fry,"green pepper, red pepper, yellow pepper, mushrooms, broccoli, coliflower, spinach.","$8.50");
        listItems.add(stirfry);

        ListItem tuna = new ListItem("Tuna Salad", R.drawable.tuna,"Lettuce, Cocktail Tomatos, Cucumber, green pepper, red pepper, yellow pepper, Fetta Cheese, olives, red onion with Tuna and greek salad.","$5.50");
        listItems.add(tuna);

        ListItem chickenmayo = new ListItem("Toasted Chicken Mayo", R.drawable.chicken_mayo,"Chicken mayo sandwich serves wih hot or cold veg.","$2.00");
        listItems.add(chickenmayo);

        ListItem Vegetables = new ListItem("Spicy Vegetables and Sardines", R.drawable.sardines_on_toast,"Hot, Spicy or mild Vegetables served with 75g of sardines and two slices of toast.","$7.50");
        listItems.add(Vegetables);

        ListItem sushi = new ListItem("Sushi", R.drawable.sushi,"A wide varity of sushi( Check out the sushibar).","$15.00");
        listItems.add(sushi);



        adapter = new MyAdapter(listItems,getActivity());

        recyclerview.setAdapter(adapter);

        return rootView;
    }
}
