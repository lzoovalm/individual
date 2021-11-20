package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String operador;
    Double resultado;

    Double numero1;

    public void onClickButtonOne(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    Double numero2;

    public void onClickButtonTwo(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    Double numero3;

    public void onClickButtonThree(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    Double numero4;

    public void onClickButtonFour(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    Double numero5;

    public void onClickButtonFive(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    Double numero6;

    public void onClickButtonSix(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    Double numero7;

    public void onClickButtonSeven(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    Double numero8;

    public void onClickButtonEight(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    Double numero9;

    public void onClickButtonNine(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    Double numero0;

    public void onClickButtonCero(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickButtonPunto(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + ".");
    }

    public void onClickButtonCapturaNumero1(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView) {
        operador = "+";
        onClickButtonCapturaNumero1(miView);
    }

    public void onClickDivison(View miView) {
        operador = "/";
        onClickButtonCapturaNumero1(miView);
    }

    public void onClickMultiplicacion(View miView) {
        operador = "*";
        onClickButtonCapturaNumero1(miView);
    }

    public void onClickResta(View miView) {
        operador = "-";
        onClickButtonCapturaNumero1(miView);
    }
    public void onClickPorcentaje(View miView) {
        operador = "%";
        onClickButtonCapturaNumero1(miView);
    }
    public void onClickIgual(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());

        try {
            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            }
            if (operador.equals("-")) {
                resultado = numero1 - numero2;
            }
            if (operador.equals("%")) {
                resultado = ((numero1 / 100) * numero2);
            }
            if (operador.equals("*")) {
                resultado = numero1 * numero2;
            }
            if (operador.equals("/")) {
                resultado = numero1 / numero2;
            }
            tv.setText(resultado.toString());
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickExponente(View miView){
        operador = "x²";
        TextView tv = (TextView) findViewById(R.id.textView);
        try {
            numero1 = Double.parseDouble(tv.getText().toString());
            resultado = Math.pow(numero1,2);
            tv.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void onClickRaiz(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        try {
            numero1 = Double.parseDouble(tv.getText().toString());
            resultado = Math.sqrt(numero1);
            tv.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){}
    }
    public void onClickC(View miView) {
        TextView tv = findViewById(R.id.textView);
        tv.setText("");
    }
    public void onClickAC(View miView) {
        operador = "A. Cuadrado";
        onClickButtonCapturaNumero1(miView);
        TextView tv = (TextView) findViewById(R.id.textView);
        try {
            if (operador.equals("A. Cuadrado")) {
                resultado = numero1 * numero1;
            }
            tv.setText(resultado.toString());
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}
