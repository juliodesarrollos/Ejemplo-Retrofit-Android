package com.juliovazquez.ejemploretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter <CustomAdapter.CustomViewHolder> {
    private List<RetrofitProducto> dataList;
    private Context context;

    public CustomAdapter(Context context,List<RetrofitProducto> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtNombreP;
        TextView txtPrecioP;
        TextView txtExistenciaP;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtNombreP = mView.findViewById(R.id.nombreP);
            txtPrecioP = mView.findViewById(R.id.precioP);
            txtExistenciaP = mView.findViewById(R.id.existenciaP);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.producto_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txtNombreP.setText(dataList.get(position).getNombreProducto());
        holder.txtPrecioP.setText(dataList.get(position).getPrecioVenta().toString());
        holder.txtExistenciaP.setText(dataList.get(position).getExistencia().toString());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
