package com.example.jayasowmya.navigationdrawertoolbar;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jayasowmya on 30/7/16.
 */
public class DrawerItemCustomAdaptor extends ArrayAdapter<DataModel> {

        Context mContext;
        int layoutResourceId;
        DataModel data[] = null;
        public DrawerItemCustomAdaptor(Context mContext, int layoutResourceId, DataModel[] data) {

            super(mContext, layoutResourceId, data);
            this.layoutResourceId = layoutResourceId;
            this.mContext = mContext;
            this.data = data;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View listItem = convertView;

            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            listItem = inflater.inflate(layoutResourceId, parent, false);

            ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
            TextView textViewName = (TextView)
                    listItem.findViewById(R.id.textViewName);

            DataModel folder = data[position];


            imageViewIcon.setImageResource(folder.icon);
            textViewName.setText(folder.name);

            return listItem;
        }
        }
