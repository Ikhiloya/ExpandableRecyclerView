package com.ikhiloyaimokhai.expandablerecyclerview.expand;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.ikhiloyaimokhai.expandablerecyclerview.R;
import com.ikhiloyaimokhai.expandablerecyclerview.model.Artist;
import com.ikhiloyaimokhai.expandablerecyclerview.model.Genre;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;


/**
 * Created by Ikhiloya Imokhai on 2019-10-31.
 */

public class GenreAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder, ArtistViewHolder> {

//    private ListItemClickListener listItemClickListener;

    public GenreAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
//        this.listItemClickListener = listItemClickListener;
    }


    /**
     * an interface to handle click events on a card
     */
    public interface ListItemClickListener {
        void onListItemClick(int adapterPosition);
    }

//    private void onItemClick(RecyclerView.ViewHolder holder) {
//        if (listItemClickListener != null) {
////            GeneralModel model = models.get(holder.getAdapterPosition());
//            listItemClickListener.onListItemClick(holder.getAdapterPosition());
//        }
//    }



    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_genre, parent, false);
        return new GenreViewHolder(view);
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_artist, parent, false);
        return new ArtistViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition,
                                      ExpandableGroup group, int childIndex) {

        final Artist artist = ((Genre) group).getItems().get(childIndex);
        holder.setArtistName(artist.getName());
        holder.setArtistes(((Genre) group).getItems());
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition,
                                      ExpandableGroup group) {

        holder.setGenreTitle(group);
    }
}