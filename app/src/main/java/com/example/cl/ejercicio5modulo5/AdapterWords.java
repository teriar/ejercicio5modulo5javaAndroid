package com.example.cl.ejercicio5modulo5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cl.ejercicio5modulo5.databinding.ItemBinding;

import java.util.List;

public class AdapterWords extends RecyclerView.Adapter <AdapterWords.viewHolder> {

    private List<String> words;

    @NonNull
    @Override
    public AdapterWords.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.viewHolder holder, int position) {
    String item = words.get(position);
    holder.mostrarInformacion(item);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void setData(List<String> data) {
        this.words = data;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itembinding;
        public viewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itembinding = binding;
        }
        public void mostrarInformacion(String  word){
            itembinding.textView.setText(word);
        }
    }
}
