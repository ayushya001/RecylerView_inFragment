package com.example.recylerview_infragment;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class datafragment extends Fragment {
    RecyclerView recyclerView;
    myadapter myadapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_datafragment, container, false);
        recyclerView=view.findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myadapter = new myadapter(dataqueqe(),getActivity());
     //  adapter = new myadapter(dataque(),getContext());
        recyclerView.setAdapter(myadapter);
        return view;
    }
    public ArrayList<datamodel> dataqueqe() {
        ArrayList<datamodel>dataholder=new ArrayList<>();

        datamodel ob1=new datamodel(R.drawable.angular,"Angular","Web Application");
        dataholder.add(ob1);

        datamodel ob2=new datamodel(R.drawable.cp,"C Programming","Embed Programming");
        dataholder.add(ob2);

        datamodel ob3=new datamodel(R.drawable.cpp,"C++ Programming","Embed Programming");
        dataholder.add(ob3);

        datamodel ob4=new datamodel(R.drawable.dotnet,".NET Programming","Desktop and Web Programming");
        dataholder.add(ob4);

        datamodel ob5=new datamodel(R.drawable.java,"Java Programming","Desktop and Web Programming");
        dataholder.add(ob5);

        datamodel ob6=new datamodel(R.drawable.magento,"Magento","Web Application Framework");
        dataholder.add(ob6);

        datamodel ob7=new datamodel(R.drawable.nodejs,"NodeJS","Web Application Framework");
        dataholder.add(ob7);

        datamodel ob8=new datamodel(R.drawable.python,"Python","Desktop and Web Programming");
        dataholder.add(ob8);

        datamodel ob9=new datamodel(R.drawable.shopify,"Shopify","E-Commerce Framework");
        dataholder.add(ob9);

        datamodel ob10=new datamodel(R.drawable.wordpress,"Wordpress","WebApplication Framewrok");
        dataholder.add(ob10);
        return dataholder;
    }
}