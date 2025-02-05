package kapralov.filters;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity extends AppCompatActivity {

    TextView tvDate;
    TextView tvView;
    String date;
    SimpleDateFormat sdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        tvView = findViewById(R.id.tvView);

        sdf = new SimpleDateFormat("dd/MM/yyyy");
        date = sdf.format(new Date(System.currentTimeMillis()));
        tvDate = findViewById(R.id.tvDate);
        tvDate.setText(date);
    }

}