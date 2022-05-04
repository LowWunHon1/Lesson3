package sg.edu.rp.c346.id21012050.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText editAmount;
    EditText editPax;
    ToggleButton noSVS;
    ToggleButton GST;
    EditText editDiscount;
    RadioGroup payment;
    ToggleButton Split;
    ToggleButton Reset;
    TextView totalBill;
    TextView eachPay;
    Button buttonDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAmount = findViewById(R.id.editTextTextPersonName);
        editPax = findViewById(R.id.editTextTextPersonName2);
        noSVS = findViewById(R.id.toggleButton);
        GST = findViewById(R.id.toggleButton2);
        editDiscount = findViewById(R.id.editTextTextPersonName3);
        payment = findViewById(R.id.radioPayment);
        Split = findViewById(R.id.toggleButton3);
        Reset = findViewById(R.id.toggleButton4);
        totalBill = findViewById(R.id.textView4);
        eachPay = findViewById(R.id.textView5);
        buttonDisplay = findViewById(R.id.button);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt = totalBill.getText().toString();
                String txt2 = eachPay.getText().toString();
                int checkedRadioId = payment.getCheckedRadioButtonId();
                String text = editAmount.getText().toString();
                int num = Integer.parseInt(text);
                String text2 = editPax.getText().toString();
                int num2 = Integer.parseInt(text2);
                String text3 = editDiscount.getText().toString();
                int num3 = Integer.parseInt(text3);
                double bill = (((100-num3)/100 + (100-num3)%100) * num);
                String val = String.format("%.2f", bill);
                double each = ((bill/num2) + (bill%num2));
                String val2 = String.format("%.2f", each);

                if (checkedRadioId == R.id.radioButton3) {
                    payment.check(R.id.radioPayment);
                    txt = "Total Bill: " + val;
                    txt2 = "Each Pays: " + val2;
                }
                else {
                    payment.check(R.id.radioPayment);
                    txt = "Total Bill: " + val;
                    txt2 = "Each Pays: " + val2 + " via PayNow to 912345678";
                }
                totalBill.setText(txt);
                eachPay.setText(txt2);
            }
        });

        noSVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (noSVS.isChecked()) {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
                else {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
            }
        });

        GST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GST.isChecked()) {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
                else {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
            }
        });

        Split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Split.isChecked()) {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
                else {
                    editAmount.setEnabled(true);
                    editPax.setEnabled(true);
                    editDiscount.setEnabled(true);
                }
            }
        });
    }
}