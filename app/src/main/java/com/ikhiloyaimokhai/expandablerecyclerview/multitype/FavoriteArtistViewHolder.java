package com.ikhiloyaimokhai.expandablerecyclerview.multitype;

import android.view.View;
import android.widget.TextView;

import com.ikhiloyaimokhai.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by Ikhiloya Imokhai on 2019-10-31.
 */
public class FavoriteArtistViewHolder extends ChildViewHolder {

    private TextView favoriteArtistName;

    public FavoriteArtistViewHolder(View itemView) {
        super(itemView);
        favoriteArtistName = (TextView) itemView.findViewById(R.id.list_item_favorite_artist_name);
    }

    public void setArtistName(String name) {
        favoriteArtistName.setText(name);
    }

}
