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

public class Breakfast extends Fragment {


    RecyclerView recyclerview;
    RecyclerView.Adapter adapter;
    List<ListItem> listItems;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                    Bundle savedInstanceState) {View rootView = inflater.inflate
                    (R.layout.breakfast, container, false);

        recyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));


        listItems = new ArrayList<>();


        ListItem northern_irish = new ListItem("Northern Irish Breakfast", R.drawable.northern_irish,"Eggs (scrambled or fried)soda, potato and fried bread, fried tomato, pork sausages, bacon, black pudding.","$10.00");
        listItems.add(northern_irish);

        ListItem hawaiian = new ListItem("Hawaiian Breakfast", R.drawable.hawaiian,"Eggs, chopped hamburger or Hawaiian sausage over rice and gravy (as a option) tropical fruit and fresh papayas.","$8.00");
        listItems.add(hawaiian);

        ListItem norwegian = new ListItem("Norwegian Breakfast", R.drawable.norwegian,"Chicken curry & Jarslberg. Mayonnaise & Jarlsberg. Salami & mayonnaise. Served on warm bread.","$7.60");
        listItems.add(norwegian);

        ListItem italian = new ListItem("Italian Breakfast", R.drawable.italian,"Espresso or Cappuccino with cookies or sweet pastry – usually cornetto filled with cream, chocolate, jam.","$9.00");
        listItems.add(italian);

        ListItem louisianan = new ListItem("Louisianan Breakfast", R.drawable.louisianan,"Grits and eggs with bacon and toast (jalapeno cheese grits as a option).","$11.00");
        listItems.add(louisianan);

        ListItem spanish = new ListItem("Spanish Breakfast", R.drawable.spanish,"Deep-fried donut with sprinkle of sugar & a cup of thick hot chocolate.","$15.00");
        listItems.add(spanish);

        ListItem international = new ListItem("English Breakfast", R.drawable.international,"Egg (scrambled/fried/poached),sausages, bacon, beans, hash browns and mushrooms with a side of toast.","$8.40");
        listItems.add(international);

        ListItem south_california = new ListItem("South California Breakfast", R.drawable.south_california,"Tacos - organic eggs, pepper, avocado and salsa.","$6.20");
        listItems.add(south_california);

        ListItem san_diego = new ListItem("San Diego Breakfast", R.drawable.san_diego,"Eggs (scrambled/omelette/eggs benedict) with smoked salmon and wilted spinach served with a side of roasted potatoes.","$16.00");
        listItems.add(san_diego);

        ListItem vietnamese = new ListItem("Vietnamese Breakfast", R.drawable.vietnamese,"Broth, rice noodles, a few herbs a meat of your choice(beef or chicken).","$4.00");
        listItems.add(vietnamese);

            adapter = new MyAdapter(listItems, getActivity());

            recyclerview.setAdapter(adapter);

            return rootView;

        }
}

