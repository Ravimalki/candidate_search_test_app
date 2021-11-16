package com.example.candidate_search_test_app.candidates.SelectedList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.candidate_search_test_app.databinding.CandidateContentListViewBinding;

/**
 * Created by Koshini Bulathsinhala
 */

public class SelectedListViewHolder extends RecyclerView.ViewHolder {

    CandidateContentListViewBinding binding;

    public SelectedListViewHolder(@NonNull CandidateContentListViewBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }
}
