package com.curso_simulaciones.creacionlayouts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EscrituraEnLayouts extends Activity {

    //Creación del layout secundario:
    private LinearLayout linear_secundario;
    //Creación de la cadena:
    private TextView texto;


    @Override
    /*
    OnCreate es parte esencial del ciclo de vida de una actividad
    y se utiliza siempre que el sistema crea la actividad por primera vez.
     */
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
    /*
    Método para crear elementos en la
    Intefaz gráfica de usuario.
     */
    private void crearElementosGui() {
        linear_secundario = new LinearLayout(this);
        linear_secundario.setBackgroundColor(Color.WHITE);
        //Creación de la cadena de texto en la GUI:
        texto = new TextView(this);
        //texto.setTextSize(TypedValue.COMPLEX_UNIT_FRACTION_PARENT,30);
        texto.setTextSize(50);
        texto.setTextColor(Color.rgb(1000,534,765));
        texto.setText("Hola, mi nombre es: \n Daniel Felipe Vargas Arias");
    }


    private LinearLayout crearGui() {
        //Layout principal:
        LinearLayout linear_principal = new LinearLayout(this);
        linear_principal.setOrientation(LinearLayout.VERTICAL);
        linear_principal.setGravity(Gravity.CENTER_HORIZONTAL);
        linear_principal.setGravity(Gravity.FILL);
        linear_principal.setBackgroundColor(Color.BLACK);
        linear_principal.setWeightSum(2f);
        //Layouts secundarios:
        //Parametros de pegada1:
        LinearLayout.LayoutParams parametrosPegada1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
        parametrosPegada1.setMargins(100, 40, 100, 40);
        parametrosPegada1.weight = 1f;

        //Pegada de layouts secundarios:
        linear_principal.addView(linear_secundario, parametrosPegada1);
        //Pegada del texto en el Layout secundario:
        linear_secundario.addView(texto);


        return linear_principal;
    }
}
