package pcodeclan.com.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText numberDecimalEditText = (EditText) findViewById(R.id.numberDecimalEditText) ;

        String amountPoundsString = numberDecimalEditText.getText().toString();

        double amountPoundsDouble = Double.parseDouble(amountPoundsString);
        
        double amountDollarsDouble = amountPoundsDouble * 1.3;

        String amountDollarsString = Double.toString(amountDollarsDouble);

        Log.i("Amount in dollars", amountDollarsString);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}