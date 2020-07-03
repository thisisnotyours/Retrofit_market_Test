package com.suek.retrofit_market_practice0630;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<BoardItems> boardItems;

    public BoardAdapter(Context context, ArrayList<BoardItems> boardItems) {
        this.context = context;
        this.boardItems = boardItems;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.recycler_board_item, parent, false);
        VH holder= new VH(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;
        BoardItems items= boardItems.get(position);
        String imgUrl= "http://suhyun2963.dothome.co.kr/Retrofit_Board_Market_Practice/" + items.file;
        Glide.with(context).load(imgUrl).into(vh.iv);
        vh.tvTitle.setText(items.title);   //title --from BoardItems.java
        vh.tvMsg.setText(items.msg);
        vh.tvPrice.setText(items.price+"원");
        vh.tbBtn.setChecked(items.fav==1? true : false);
    }



    @Override
    public int getItemCount() {
        return boardItems.size();
    }



    class VH extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tvTitle;
        TextView tvMsg;
        TextView tvPrice;
        ToggleButton tbBtn;

        public VH(@NonNull View itemView) {
            super(itemView);

            iv= itemView.findViewById(R.id.iv);
            tvTitle= itemView.findViewById(R.id.tv_title);
            tvMsg= itemView.findViewById(R.id.tv_msg);
            tvPrice= itemView.findViewById(R.id.tv_price);
            tbBtn= itemView.findViewById(R.id.tb_fav);
        }
    }




}
