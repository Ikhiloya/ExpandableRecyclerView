package com.ikhiloyaimokhai.expandablerecyclerview.expand;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        String artiste = artistes.get(getAdapterPosition()).getName();
        Toast.makeText(view.getContext(), artiste, Toast.LENGTH_LONG).show();
    }

    public void setArtistes(List<Artist> artistes) {
        this.artistes = artistes;

    }
}
