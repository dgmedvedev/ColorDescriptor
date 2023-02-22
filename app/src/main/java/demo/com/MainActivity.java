package demo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Spinner spinnerColors;
        TextView textViewDescriptionTemp;
        Button buttonFindDescription;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColor);
        textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp);
        buttonFindDescription = findViewById(R.id.buttonFindDescription);

        buttonFindDescription.setOnClickListener(view -> {
            int position = spinnerColors.getSelectedItemPosition();
            String description = getDescriptionByPosition(position);
            textViewDescriptionTemp.setText(description);
        });
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_of_temp);
        return descriptions[position];
    }
}