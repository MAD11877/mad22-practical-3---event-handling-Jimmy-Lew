package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView icon = (ImageView) findViewById(R.id.icon);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder imageAlertBuilder = new AlertDialog.Builder(ListActivity.this);
                imageAlertBuilder.setTitle("Profile");
                imageAlertBuilder.setMessage("MADness");

                imageAlertBuilder.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent MainActivity = new Intent(ListActivity.this, MainActivity.class);
                        int ranInt = new Random().nextInt(10000000);

                        MainActivity.putExtra("ranInt", ranInt);
                        startActivity(MainActivity);
                    }
                });
                imageAlertBuilder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });

                AlertDialog imageAlert = imageAlertBuilder.create();
                imageAlert.show();
            }
        });
    }
}