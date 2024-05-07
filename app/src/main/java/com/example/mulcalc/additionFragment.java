package com.example.mulcalc;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                if (areFieldsValid(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                        editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                        editText_51, editText_52, editText_53, editText_61, editText_62, editText_63)) {
                    int[] result = calculateMatrixMultiplication(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                            editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                            editText_51, editText_52, editText_53, editText_61, editText_62, editText_63);

                    Intent intent = new Intent(getActivity(), MainActivity2.class);
                    intent.putExtra("Result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Please fill all fields with numeric values", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (areFieldsValid(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                        editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                        editText_51, editText_52, editText_53, editText_61, editText_62, editText_63)) {
                    int[] result = calculateMatrixSubtraction(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                            editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                            editText_51, editText_52, editText_53, editText_61, editText_62, editText_63);

                    Intent intent = new Intent(getActivity(), MainActivity2.class);
                    intent.putExtra("Result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Please fill all fields with numeric values", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (areFieldsValid(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                        editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                        editText_51, editText_52, editText_53, editText_61, editText_62, editText_63)) {
                    int[] result = calculateMatrixAddition(editText_11, editText_12, editText_13, editText_21, editText_22, editText_23,
                            editText_31, editText_32, editText_33, editText_41, editText_42, editText_43,
                            editText_51, editText_52, editText_53, editText_61, editText_62, editText_63);

                    Intent intent = new Intent(getActivity(), MainActivity2.class);
                    intent.putExtra("Result", result);
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Please fill all fields with numeric values", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    private boolean areFieldsValid(EditText... editTexts) {
        for (EditText editText : editTexts) {
            String text = editText.getText().toString().trim();
            if (TextUtils.isEmpty(text) || !TextUtils.isDigitsOnly(text)) {
                return false;
            }
        }
        return true;
    }

    private int[] calculateMatrixAddition(EditText... editTexts) {
        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = Integer.parseInt(editTexts[i].getText().toString());
        }
        return result;
    }

    private int[] calculateMatrixSubtraction(EditText... editTexts) {
        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = Integer.parseInt(editTexts[i].getText().toString());
        }
        return result;
    }

    private int[] calculateMatrixMultiplication(EditText... editTexts) {
        int[] result = new int[9];
        // Matrix multiplication logic here
        return result;
    }
}
