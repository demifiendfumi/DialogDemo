package sg.edu.rp.c346.dialogdemo;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1;
    Button btnDemo2;
    TextView tvDemo2;
    Button btnDemo3;
    TextView tvDemo3;
    EditText etInput;
    EditText etNum1;
    EditText etNum2;
    Button btnDemo4;
    TextView tvDemo4;
    Button btnDemo5;
    TextView tvDemo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = (Button)findViewById(R.id. buttonDemo1);
        btnDemo2 = (Button)findViewById(R.id. buttonDemo2);
        tvDemo2 = (TextView) findViewById(R.id. textViewDemo2);
        btnDemo3 = (Button)findViewById(R.id. buttonDemo3);
        tvDemo3 = (TextView) findViewById(R.id. textViewDemo3);
        etInput = (EditText) findViewById(R.id. editTextInput);
        etNum1 = (EditText) findViewById(R.id. editTextNum1);
        etNum2 = (EditText) findViewById(R.id. editTextNum2);
        btnDemo4 = (Button)findViewById(R.id. buttonDemo4);
        tvDemo4 = (TextView) findViewById(R.id. textViewDemo4);
        btnDemo5 = (Button)findViewById(R.id. buttonDemo5);
        tvDemo5 = (TextView) findViewById(R.id. textViewDemo5);

        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //Set the Dialog details
                /*
                myBuilder.setTitle("Demo 1-Simple Dialog");
                myBuilder.setMessage("I can develop Android App.");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Close", null);

                //Create and display the Dialog
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
                */
                myBuilder.setTitle("Congratulation");
                myBuilder.setMessage("You have completed a simple Dialog Box");
                myBuilder.setCancelable(true);
                myBuilder.setPositiveButton("Dismiss", null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                /*
                myBuilder.setTitle("Demo 2 Button Dialog");
                myBuilder.setMessage("Select one of the Button below.");
                myBuilder.setCancelable(false);

                //Configure 'positive' button
                myBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //IMPORTANT: update textview as form of data passing between dialog & MainActivity
                        tvDemo2.setText("You have selected Negative.");
                    }
                });

                //Configure 'positive' button
                myBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //IMPORTANT: update textview as form of data passing between dialog & MainActivity
                        tvDemo2.setText("You have selected Positive.");
                    }
                });

                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
                */

                myBuilder.setTitle("Demo 2_Button Dialog");
                myBuilder.setMessage("Select one of the Button below.");
                myBuilder.setCancelable(false);

                //Configure 'neutral' button
                myBuilder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //IMPORTANT: update textview as form of data passing between dialog & MainActivity
                        tvDemo2.setText("TextView");
                    }
                });

                //Configure 'negative' button
                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //IMPORTANT: update textview as form of data passing between dialog & MainActivity
                        tvDemo2.setText("You have selected Negative.");
                    }
                });

                //Configure 'positive' button
                myBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //IMPORTANT: update textview as form of data passing between dialog & MainActivity
                        tvDemo2.setText("You have selected Positive.");
                    }
                });

                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                //Inflate the input.xml layout file
                LayoutInflater inflater =
                        (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View viewDialog = inflater.inflate(R.layout.input, null);

                //obtain the UI component in the input.xml layout
                final EditText etInput =
                        (EditText) viewDialog.findViewById(R.id.editTextInput);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //set the view of the dialog
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3-Text Input Dialog");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Extract the Text entered by the user
                        String message = etInput.getText().toString();
                        // Update the Text to TextView
                        tvDemo3.setText(message);

                    }
                });
                */
                //Worksheet exercise
                //Inflate the input.xml layout file
                LayoutInflater inflater =
                        (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input2, null);

                etNum1 =(EditText) viewDialog.findViewById(R.id.editTextNum1);
                etNum2 =(EditText) viewDialog.findViewById(R.id.editTextNum2);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3-Text Input Dialog");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        double sum = Double.parseDouble(etNum1.getText().toString())+Double.parseDouble(etNum2.getText().toString());
                        tvDemo3.setText("The sum is " + String.valueOf(sum));
                    }
                });
                myBuilder.setNegativeButton("Cancel",null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }

        });

        btnDemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int monthOfYear = c.get(Calendar.MONTH);
                int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);

                // Creating the Listener to set the date
                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {
                        tvDemo4.setText("Date: " + dayOfMonth + "/" + (monthOfYear+1) + "/" + year);

                    }
                };

                // Create the Date Picker Dialog
                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this,
                        myDateListener, year,monthOfYear,dayOfMonth+1);

                myDateDialog.show();
            }
        });

        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating the Listener to set the time
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tvDemo5.setText("Time: " + hourOfDay + ":" + minute);
                    }
                };

                // Create the Time Picker Dialog
                // TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this,
                // myTimeListener, 20, 00, true);

                Calendar now = Calendar.getInstance();
                int hour = now.get(Calendar.HOUR_OF_DAY);
                int minute = now.get(Calendar.MINUTE);
                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this,
                        myTimeListener, hour, minute, true);
                myTimeDialog.show();
            }
        });


    }

}
