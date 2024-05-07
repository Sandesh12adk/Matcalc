package com.example.mulcalc;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class MyClass {
    private AppCompatActivity mActivity;

    public MyClass(AppCompatActivity activity) {
        mActivity = activity;
    }

    public  void performMatrixAddition() {
        int[] firstMatrix = new int[9];
        int[] secondMatrix = new int[9];
        int[] result = new int[9];

        EditText editText_11 = mActivity.findViewById(R.id.editText_11);
        String val1 = editText_11.getText().toString();
        firstMatrix[0] = Integer.parseInt(val1);

        EditText editText_12 = mActivity.findViewById(R.id.editText_12);
        String val2 = editText_12.getText().toString();
        firstMatrix[1] = Integer.parseInt(val2);

        EditText editText_13 = mActivity.findViewById(R.id.editText_13);
        String val3 = editText_13.getText().toString();
        firstMatrix[2] = Integer.parseInt(val3);

        EditText editText_21 = mActivity.findViewById(R.id.editText_21);
        String val4 = editText_21.getText().toString();
        firstMatrix[3] = Integer.parseInt(val4);

        EditText editText_22 = mActivity.findViewById(R.id.editText_22);
        String val5 = editText_22.getText().toString();
        firstMatrix[4] = Integer.parseInt(val5);

        EditText editText_23 = mActivity.findViewById(R.id.editText_23);
        String val6 = editText_23.getText().toString();
        firstMatrix[5] = Integer.parseInt(val6);

        EditText editText_31 = mActivity.findViewById(R.id.editText_31);
        String val7 = editText_31.getText().toString();
        firstMatrix[6] = Integer.parseInt(val7);

        EditText editText_32 = mActivity.findViewById(R.id.editText_32);
        String val8 = editText_32.getText().toString();
        firstMatrix[7] = Integer.parseInt(val8);

        EditText editText_33 = mActivity.findViewById(R.id.editText_33);
        String val9 = editText_33.getText().toString();
        firstMatrix[8] = Integer.parseInt(val9);

        EditText editText_41 = mActivity.findViewById(R.id.editText_41);
        String val10 = editText_41.getText().toString();
        secondMatrix[0] = Integer.parseInt(val10);

        EditText editText_42 = mActivity.findViewById(R.id.editText_42);
        String val11 = editText_42.getText().toString();
        secondMatrix[1] = Integer.parseInt(val11);

        EditText editText_43 = mActivity.findViewById(R.id.editText_43);
        String val12 = editText_43.getText().toString();
        secondMatrix[2] = Integer.parseInt(val12);

        EditText editText_51 = mActivity.findViewById(R.id.editText_51);
        String val13 = editText_51.getText().toString();
        secondMatrix[3] = Integer.parseInt(val13);

        EditText editText_52 = mActivity.findViewById(R.id.editText_52);
        String val14 = editText_52.getText().toString();
        secondMatrix[4] = Integer.parseInt(val14);

        EditText editText_53 = mActivity.findViewById(R.id.editText_53);
        String val15 = editText_53.getText().toString();
        secondMatrix[5] = Integer.parseInt(val15);

        EditText editText_61 = mActivity.findViewById(R.id.editText_61);
        String val16 = editText_61.getText().toString();
        secondMatrix[6] = Integer.parseInt(val16);

        EditText editText_62 = mActivity.findViewById(R.id.editText_62);
        String val17 = editText_62.getText().toString();
        secondMatrix[7] = Integer.parseInt(val17);

        EditText editText_63 = mActivity.findViewById(R.id.editText_63);
        String val18 = editText_63.getText().toString();
        secondMatrix[8] = Integer.parseInt(val18);

        // Perform matrix addition
        for (int i = 0; i < 9; i++) {
            result[i] = firstMatrix[i] + secondMatrix[i];
        }

        // Display the result
        TextView textViewRow1Col1 = mActivity.findViewById(R.id.textViewRow1Col1);
        TextView textViewRow1Col2 = mActivity.findViewById(R.id.textViewRow1Col2);
        TextView textViewRow1Col3 = mActivity.findViewById(R.id.textViewRow1Col3);
        TextView textViewRow2Col1 = mActivity.findViewById(R.id.textViewRow2Col1);
        TextView textViewRow2Col2 = mActivity.findViewById(R.id.textViewRow2Col2);
        TextView textViewRow2Col3 = mActivity.findViewById(R.id.textViewRow2Col3);
        TextView textViewRow3Col1 = mActivity.findViewById(R.id.textViewRow3Col1);
        TextView textViewRow3Col2 = mActivity.findViewById(R.id.textViewRow3Col2);
        TextView textViewRow3Col3 = mActivity.findViewById(R.id.textViewRow3Col3);

        textViewRow1Col1.setText(String.valueOf(result[0]));
        textViewRow1Col2.setText(String.valueOf(result[1]));
        textViewRow1Col3.setText(String.valueOf(result[2]));
        textViewRow2Col1.setText(String.valueOf(result[3]));
        textViewRow2Col2.setText(String.valueOf(result[4]));
        textViewRow2Col3.setText(String.valueOf(result[5]));
        textViewRow3Col1.setText(String.valueOf(result[6]));
        textViewRow3Col2.setText(String.valueOf(result[7]));
        textViewRow3Col3.setText(String.valueOf(result[8]));
    }
}
