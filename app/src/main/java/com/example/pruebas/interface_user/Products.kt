package com.example.pruebas.interface_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.R
import com.example.pruebas.databinding.ActivityProductsBinding
import com.example.pruebas.dto.ProductoAdaptador
import com.example.pruebas.dto.ProductoSimulado
import com.example.pruebas.dto.ProductoSimulado2
import com.example.pruebas.fragments.Product

class Products : AppCompatActivity() {

    private lateinit var views:ActivityProductsBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(views.root)
        cargarProductos()
    }

    private fun cargarProductos(){
        val listaDeProductos = emularProducts()
        val adaptador = ProductoAdaptador(listaDeProductos)
        views.productsList.adapter = adaptador
    }

    private fun emularProducts(): List<ProductoSimulado2> {
       // var single_product = ProductoSimulado.Builder().nombre()

        var producto_uno = ProductoSimulado2()
        producto_uno.uri = "https://images.app.goo.gl/JZY4qY7zWCM4851E6"
        producto_uno.nombre = "Hamburguesa de Res"
        producto_uno.descripcion ="Carne, vegetales y salsas"

        var producto_dos = ProductoSimulado2()
        producto_dos.uri = "https://images.app.goo.gl/99r2zRmET9BY15UbA"
        producto_dos.nombre = "Hamburguesa de Pollo"
        producto_dos.descripcion = "Pollo, vegetales y salsas"

        val listado = arrayOf(producto_uno, producto_dos)
        return listado.toList()
    }
}