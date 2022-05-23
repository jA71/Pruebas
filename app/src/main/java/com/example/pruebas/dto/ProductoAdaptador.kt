package com.example.pruebas.dto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebas.R
import com.example.pruebas.databinding.SingleProductBinding
import java.net.URI

class ProductoAdaptador(private var listadoProductos: List<ProductoSimulado2>) :
    RecyclerView.Adapter<ProductoAdaptador.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.single_product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val productoActual = listadoProductos[position]
        holder.viewsViewHolder.nameProduct.setText(productoActual.nombre)
        holder.viewsViewHolder.descriptionProduct.setText(productoActual.descripcion)
    }

    override fun getItemCount(): Int {
        return listadoProductos.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var viewsViewHolder: SingleProductBinding

        init {
            viewsViewHolder = SingleProductBinding.bind(itemView)
        }
    }


}