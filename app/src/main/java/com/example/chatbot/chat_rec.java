package com.example.chatbot;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;


public class chat_rec extends RecyclerView.ViewHolder  {



    TextView leftText,rightText;
    CircleImageView botImage;

    public chat_rec(View itemView){
        super(itemView);


        leftText = (TextView)itemView.findViewById(R.id.leftText);
        botImage = (CircleImageView) itemView.findViewById(R.id.bot_image);
        rightText = (TextView)itemView.findViewById(R.id.rightText);


    }
}