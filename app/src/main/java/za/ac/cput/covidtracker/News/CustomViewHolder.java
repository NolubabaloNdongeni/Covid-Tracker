


package za.ac.cput.covidtracker.News;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import za.ac.cput.covidtracker.R;

/**
 * @Uthor: Chuma Nxazonke
 * Student number: 219181187
 * Date: 23 May 2022
 */


public class CustomViewHolder extends RecyclerView.ViewHolder {
    //Declaring all the objects for the class
TextView text_title, text_source;
ImageView img_headline;
CardView cardView;


    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        text_title = itemView.findViewById(R.id.text_title);
        text_source = itemView.findViewById(R.id.text_source);
        img_headline = itemView.findViewById(R.id.img_headline);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
