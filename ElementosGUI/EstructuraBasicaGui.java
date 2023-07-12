package com.curso_simulaciones.dibujos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class EstructuraBasicaGui extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            /*para informar cómo se debe adaptar la GUI a la pantalla del
    dispositivo*/
        crearElementosGui();

        ViewGroup.LayoutParams parametro_layout_principal = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

   /*pegar al contenedor la GUI: en el argumento se está llamando al método
     crearGui()*/
        this.setContentView(crearGui(), parametro_layout_principal);

    }
    private void crearElementosGui(){

    }
    private LinearLayout crearGui(){
        //Layout principal:
        LinearLayout linear_principal = new LinearLayout(this);
        linear_principal.setOrientation(LinearLayout.VERTICAL);
        linear_principal.setGravity(Gravity.CENTER_HORIZONTAL);
        linear_principal.setGravity(Gravity.FILL);
        linear_principal.setBackgroundColor(Color.rgb(345,754,1300));

        return linear_principal;
    }
}
