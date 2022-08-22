package za.ac.cput.covidtracker.News;
/**
 * author: Chuma Nxazonke
 * Student number: 219181187
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import za.ac.cput.covidtracker.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<NewsHeadlines> headlines;



    public CustomAdapter(Context context, List<NewsHeadlines> headlines) {
        this.context = context;
        this.headlines = headlines;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
         holder.text_title.setText(headlines.get(position).getTitle()); //In this line we are getting the title of the news headline

        holder.text_source.setText(headlines.get(position).getSource().getName()); //In this line we are getting the sources of news from different sources

        //The below line will show the image of that article and if the image is empty it will not show
        if(headlines.get(position).getUrlToImage()!= null){
            Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headline);

        }

    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
