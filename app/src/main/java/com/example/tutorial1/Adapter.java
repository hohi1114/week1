package com.example.tutorial1;

import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.BaseAdapter;

import android.widget.TextView;



import java.util.ArrayList;



public class Adapter extends BaseAdapter {

    private Context mContext;

    private ArrayList<String> phone_list;



    private ViewHolder mViewHolder;



    public Adapter(Context mContext, ArrayList<String> phone_list) {

        this.mContext = mContext;

        this.phone_list = phone_list;

    }



    @Override

    public int getCount() {

        return phone_list.size();

    }



    @Override

    public Object getItem(int position) {

        return phone_list.get(position);

    }



    @Override

    public long getItemId(int position) {

        return position;

    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // ViewHoldr 패턴

        if (convertView == null) {

            convertView = LayoutInflater.from(mContext).inflate(R.layout.page2, parent, false);

            mViewHolder = new ViewHolder(convertView);

            convertView.setTag(mViewHolder);

        } else {

            mViewHolder = (ViewHolder) convertView.getTag();

        }



        // View에 Data 세팅

        mViewHolder.txt_name.setText(phone_list.get(position));



        return convertView;

    }



    public class ViewHolder {

        private TextView txt_name;



        public ViewHolder(View convertView) {

            txt_name = (TextView) convertView.findViewById(R.id.txt_name);

        }

    }

}