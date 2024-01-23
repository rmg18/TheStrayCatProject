package com.example.straycat1;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.straycat1.databinding.ActivityDondeVamosBinding;

public class DondeVamos extends AppCompatActivity implements ItemFragment.OnItemSelectedListener {

    private ActivityDondeVamosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDondeVamosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        // Reemplaza el fragmento inicial en fragmentContainerView3
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView3, new DefaultContentFragment()) // Utiliza el fragmento predeterminado inicial
                .commit();

        // Configura el fragmento de la lista de elementos
        ItemFragment itemFragment = new ItemFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, itemFragment)
                .commit();
    }

    // Método de la interfaz OnItemSelectedListener que se llama cuando se selecciona un elemento en ItemFragment
    @Override
    public void onItemSelected(String selectedItem) {
        // Cargar el contenido correspondiente en fragmentContainerView3
        loadContentInFragmentContainerView3(selectedItem);
    }

    private void loadContentInFragmentContainerView3(String selectedItem) {
        // Aquí debes manejar la carga del contenido en fragmentContainerView3
        // Puedes utilizar FragmentTransaction para reemplazar el fragment actual
        // con el nuevo contenido basado en el elemento seleccionado.

        // Ejemplo de cómo puedes reemplazar el contenido en fragmentContainerView3:
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView3, ContentFragment.newInstance(selectedItem));
        transaction.addToBackStack(null); // Esto agrega la transacción a la pila de retroceso
        transaction.commit();
    }
}