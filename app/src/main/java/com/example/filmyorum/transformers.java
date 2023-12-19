package com.example.filmyorum;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class transformers extends AppCompatActivity {

    private EditText yorumEditText;
    private TextView yorumlarTextView;
    private Button yorumGonderButton;
    private YorumDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefsaneyim);

        dbHelper = new YorumDatabaseHelper(this);

        yorumEditText = findViewById(R.id.editTextDistance);
        yorumlarTextView = findViewById(R.id.textyorum);
        yorumGonderButton = findViewById(R.id.buttonyorum);

        yorumGonderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yorum = yorumEditText.getText().toString();
                dbHelper.addYorum(yorum);
                updateYorumlar();
                yorumEditText.setText(""); // Yorum gönderildikten sonra temizle
            }
        });

        updateYorumlar();
    }

    private void updateYorumlar() {
        Cursor cursor = dbHelper.getAllYorumlar();
        StringBuilder yorumlar = new StringBuilder("Yorumlar:\n");

        while (cursor.moveToNext()) {
            String yorum = cursor.getString(cursor.getColumnIndex(YorumDatabaseHelper.COLUMN_YORUM));
            yorumlar.append("- ").append(yorum).append("\n");
        }

        yorumlarTextView.setText(yorumlar.toString());
    }
}
