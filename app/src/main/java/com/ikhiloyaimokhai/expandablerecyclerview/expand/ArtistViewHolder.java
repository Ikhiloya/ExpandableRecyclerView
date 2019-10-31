package com.ikhiloyaimokhai.expandablerecyclerview.expand;

import android.view.View;
import android.widget.TextView;

import com.ikhiloyaimokhai.expandablerecyclerview.R;
import com.ikhiloyaimokhai.expandablerecyclerview.model.Artist;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import java.util.List;

/**
 * Created by Ikhiloya Imokhai on 2019-10-31.
 */
public class ArtistViewHolder extends ChildViewHolder implements View.OnClickListener {
    private TextView childTextView;

    private List<Artist> artistes;
    private Artist artist;
    private int childIndex;

    public ArtistViewHolder(View itemView) {
        super(itemView);
        childTextView = (TextView) itemView.findViewById(R.id.list_item_artist_name);
        itemView.setOnClickListener(this);

    }

    public void setArtistName(String name) {
        childTextView.setText(name);
    }

    @Override
    public void onClick(View view) {
        GenreAdapter.onItemClick(artist.getName(), childIndex);
    }

    protected void setArtistes(List<Artist> artistes, int childIndex) {
        this.artist = artistes.get(childIndex);
        this.childIndex = childIndex;

    }
}
