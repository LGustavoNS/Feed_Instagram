package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postings;

import java.util.List;

public class PostingAdpater extends RecyclerView.Adapter<PostingAdpater.MyViewHolder> {

    private List<Postings> postings;

    public PostingAdpater(List<Postings> listPostings) {
        this.postings = listPostings;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.posting_details, parent, false);

        return new MyViewHolder(itemList);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postings posting = postings.get( position );
        holder.txtInsta.setText( posting.getName() );
        holder.txtLegend.setText( posting.getPostings() );
        holder.imgPosting.setImageResource( posting.getImage() );

    }

    @Override
    public int getItemCount() {
        return postings.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtInsta;
        private TextView txtLegend;
        private ImageView imgPosting;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtInsta = itemView.findViewById(R.id.txtInsta);
            txtLegend = itemView.findViewById(R.id.txtLegend);
            imgPosting = itemView.findViewById(R.id.imgPosting);

        }
    }

}
