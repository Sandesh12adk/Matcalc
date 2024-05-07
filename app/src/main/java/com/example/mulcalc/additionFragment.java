package com.example.mulcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class additionFragment extends Fragment {

    public static additionFragment newInstance() {
        return new additionFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_addition, container, false);
        Button btn1, btn2, btn3;
        btn1 = view.findViewById(R.id.button1);
        btn2 = view.findViewById(R.id.button2);
        btn3 = view.findViewById(R.id.button3);

        EditText editText_11 = view.findViewById(R.id.editText_11);
        EditText editText_12 = view.findViewById(R.id.editText_12);
        EditText editText_13 = view.findViewById(R.id.editText_13);
        EditText editText_21 = view.findViewById(R.id.editText_21);
        EditText editText_22 = view.findViewById(R.id.editText_22);
        EditText editText_23 = view.findViewById(R.id.editText_23);
        EditText editText_31 = view.findViewById(R.id.editText_31);
        EditText editText_32 = view.findViewById(R.id.editText_32);
        EditText editText_33 = view.findViewById(R.id.editText_33);
        EditText editText_41 = view.findViewById(R.id.editText_41);
        EditText editText_42 = view.findViewById(R.id.editText_42);
        EditText editText_43 = view.findViewById(R.id.editText_43);
        EditText editText_51 = view.findViewById(R.id.editText_51);
        EditText editText_52 = view.findViewById(R.id.editText_52);
        EditText editText_53 = view.findViewById(R.id.editText_53);
        EditText editText_61 = view.findViewById(R.id.editText_61);
        EditText editText_62 = view.findViewById(R.id.editText_62);
        EditText editText_63 = view.findViewById(R.id.editText_63);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] result = new int[9];
                int[] matrix1 = new int[]{
                        Integer.parseInt(editText_11.getText().toString()),
                        Integer.parseInt(editText_12.getText().toString()),
                        Integer.parseInt(editText_13.getText().toString()),
                        Integer.parseInt(editText_21.getText().toString()),
                        Integer.parseInt(editText_22.getText().toString()),
                        Integer.parseInt(editText_23.getText().toString()),
                        Integer.parseInt(editText_31.getText().toString()),
                        Integer.parseInt(editText_32.getText().toString()),
                        Integer.parseInt(editText_33.getText().toString())
                };

                int[] matrix2 = new int[]{
                        Integer.parseInt(editText_41.getText().toString()),
                        Integer.parseInt(editText_42.getText().toString()),
                        Integer.parseInt(editText_43.getText().toString()),
                        Integer.parseInt(editText_51.getText().toString()),
                        Integer.parseInt(editText_52.getText().toString()),
                        Integer.parseInt(editText_53.getText().toString()),
                        Integer.parseInt(editText_61.getText().toString()),
                        Integer.parseInt(editText_62.getText().toString()),
                        Integer.parseInt(editText_63.getText().toString())
                };


                result[0] = matrix1[0]*matrix2[0] + matrix1[1]*matrix2[3] + matrix1[2]*matrix2[6];
                result[1] = matrix1[0]*matrix2[1] + matrix1[1]*matrix2[4] + matrix1[2]*matrix2[7];
                result[2] = matrix1[0]*matrix2[2] + matrix1[1]*matrix2[5] + matrix1[2]*matrix2[8];

                result[3] = matrix1[3]*matrix2[0] + matrix1[4]*matrix2[3] + matrix1[5]*matrix2[6];
                result[4] = matrix1[3]*matrix2[1] + matrix1[4]*matrix2[4] + matrix1[5]*matrix2[7];
                result[5] = matrix1[3]*matrix2[2] + matrix1[4]*matrix2[5] + matrix1[5]*matrix2[8];

                result[6] = matrix1[6]*matrix2[0] + matrix1[7]*matrix2[3] + matrix1[8]*matrix2[6];
                result[7] = matrix1[6]*matrix2[1] + matrix1[7]*matrix2[4] + matrix1[8]*matrix2[7];
                result[8] = matrix1[6]*matrix2[2] + matrix1[7]*matrix2[5] + matrix1[8]*matrix2[8];

                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("Result", result);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] firstMatrix = new int[]{
                        Integer.parseInt(editText_11.getText().toString()),
                        Integer.parseInt(editText_12.getText().toString()),
                        Integer.parseInt(editText_13.getText().toString()),
                        Integer.parseInt(editText_21.getText().toString()),
                        Integer.parseInt(editText_22.getText().toString()),
                        Integer.parseInt(editText_23.getText().toString()),
                        Integer.parseInt(editText_31.getText().toString()),
                        Integer.parseInt(editText_32.getText().toString()),
                        Integer.parseInt(editText_33.getText().toString())
                };

                int[] secondMatrix = new int[]{
                        Integer.parseInt(editText_41.getText().toString()),
                        Integer.parseInt(editText_42.getText().toString()),
                        Integer.parseInt(editText_43.getText().toString()),
                        Integer.parseInt(editText_51.getText().toString()),
                        Integer.parseInt(editText_52.getText().toString()),
                        Integer.parseInt(editText_53.getText().toString()),
                        Integer.parseInt(editText_61.getText().toString()),
                        Integer.parseInt(editText_62.getText().toString()),
                        Integer.parseInt(editText_63.getText().toString())
                };

                int[] result = new int[9];

                // Perform matrix addition
                for (int i = 0; i < 9; i++) {
                    result[i] = firstMatrix[i] - secondMatrix[i];
                }

                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("Result", result);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] firstMatrix = new int[]{
                        Integer.parseInt(editText_11.getText().toString()),
                        Integer.parseInt(editText_12.getText().toString()),
                        Integer.parseInt(editText_13.getText().toString()),
                        Integer.parseInt(editText_21.getText().toString()),
                        Integer.parseInt(editText_22.getText().toString()),
                        Integer.parseInt(editText_23.getText().toString()),
                        Integer.parseInt(editText_31.getText().toString()),
                        Integer.parseInt(editText_32.getText().toString()),
                        Integer.parseInt(editText_33.getText().toString())
                };

                int[] secondMatrix = new int[]{
                        Integer.parseInt(editText_41.getText().toString()),
                        Integer.parseInt(editText_42.getText().toString()),
                        Integer.parseInt(editText_43.getText().toString()),
                        Integer.parseInt(editText_51.getText().toString()),
                        Integer.parseInt(editText_52.getText().toString()),
                        Integer.parseInt(editText_53.getText().toString()),
                        Integer.parseInt(editText_61.getText().toString()),
                        Integer.parseInt(editText_62.getText().toString()),
                        Integer.parseInt(editText_63.getText().toString())
                };

                int[] result = new int[9];

                // Perform matrix addition
                for (int i = 0; i < 9; i++) {
                    result[i] = firstMatrix[i] + secondMatrix[i];
                }

                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("Result", result);
                startActivity(intent);
            }
        });

        return view;
    }
}
