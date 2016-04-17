package com.bretthanson.addressbook;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayAddress extends Activity {
    int from_Where_I_Am_Coming = 0;
    private DBHelper mydb;

    TextView first;
    TextView last;
    TextView street;
    TextView city;
    TextView state;
    TextView zip;
    int id_To_Update = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_address);
        first = (TextView) findViewById(R.id.editTextFirst);
        last = (TextView) findViewById(R.id.editTextLast);
        street = (TextView) findViewById(R.id.editTextStreet);
        city = (TextView) findViewById(R.id.editTextCity);
        state = (TextView) findViewById(R.id.editTextState);
        zip = (TextView) findViewById(R.id.editTextZip);

        mydb = new DBHelper(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value = extras.getInt("id");

            if (value > 0) {
                Cursor rs = mydb.getData(value);
                id_To_Update = value;
                rs.moveToFirst();

                String stringFirst = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_FIRST));
                String stringLast = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_LAST));
                String stringStreet = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_STREET));
                String stringCity = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_CITY));
                String stringState = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_STATE));
                String stringZip = rs.getString(rs.getColumnIndex(DBHelper.ADDRESS_COLUMN_ZIP));

                if (!rs.isClosed()) {
                    rs.close();
                }
                Button b = (Button) findViewById(R.id.saveButton);
                b.setVisibility(View.INVISIBLE);

                first.setText((CharSequence) stringFirst);
                first.setFocusable(false);
                first.setClickable(false);

                last.setText((CharSequence) stringLast);
                last.setFocusable(false);
                last.setClickable(false);

                street.setText((CharSequence) stringStreet);
                street.setFocusable(false);
                street.setClickable(false);

                city.setText((CharSequence) stringCity);
                city.setFocusable(false);
                city.setClickable(false);

                state.setText((CharSequence) stringState);
                state.setFocusable(false);
                state.setClickable(false);

                zip.setText((CharSequence) stringZip);
                zip.setFocusable(false);
                zip.setClickable(false);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            int value = extras.getInt("id");
            if (value > 0) {
                getMenuInflater().inflate(R.menu.display_address, menu);
            } else {
                getMenuInflater().inflate(R.menu.menu_main, menu);
            }
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case R.id.addNew_menu:
                Button b = (Button) findViewById(R.id.addNew_menu);
                b.setVisibility(View.VISIBLE);

                first.setEnabled(true);
                first.setFocusableInTouchMode(true);
                first.setClickable(true);

                last.setEnabled(true);
                last.setFocusableInTouchMode(true);
                last.setClickable(true);

                street.setEnabled(true);
                street.setFocusableInTouchMode(true);
                street.setClickable(true);

                city.setEnabled(true);
                city.setFocusableInTouchMode(true);
                city.setClickable(true);

                state.setEnabled(true);
                state.setFocusableInTouchMode(true);
                state.setClickable(true);

                zip.setEnabled(true);
                zip.setFocusableInTouchMode(true);
                zip.setClickable(true);

                return true;
            case R.id.delete:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you want to delete it?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                mydb.deleteAddress(id_To_Update);
                                Toast.makeText(getApplicationContext(), "Deleted Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                AlertDialog d = builder.create();
                d.setTitle("Are you sure");
                d.show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void run(View view) {
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            int value = extras.getInt("id");
            if(value>0)
            {
                if(mydb.updateAddress(id_To_Update,first.getText().toString(), last.getText().toString(),street.getText().toString(),city.getText().toString(),state.getText().toString(),zip.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Updated", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "not Updated", Toast.LENGTH_SHORT).show();
                }
            } else {
                if (mydb.addAddress(first.getText().toString(),last.getText().toString(),street.getText().toString(),city.getText().toString(),state.getText().toString(),zip.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "not done", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }

    }

}
