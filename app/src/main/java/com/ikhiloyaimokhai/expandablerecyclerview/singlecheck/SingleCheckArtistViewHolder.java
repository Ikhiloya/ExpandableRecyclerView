//package com.ikhiloyaimokhai.expandablerecyclerview.singlecheck;
//
///**
// * Created by Ikhiloya Imokhai on 2019-10-31.
// */
//public class SingleCheckArtistViewHolder extends CheckableChildViewHolder {
//
//    private CheckedTextView childCheckedTextView;
//
//    public SingleCheckArtistViewHolder(View itemView) {
//        super(itemView);
//        childCheckedTextView =
//                (CheckedTextView) itemView.findViewById(R.id.list_item_singlecheck_artist_name);
//    }
//
//    @Override
//    public Checkable getCheckable() {
//        return childCheckedTextView;
//    }
//
//    public void setArtistName(String artistName) {
//        childCheckedTextView.setText(artistName);
//    }
//}