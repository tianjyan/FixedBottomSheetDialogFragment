package org.tianjyan.app.origin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.tianjyan.app.R;

public class OriginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin);

        findViewById(R.id.show_fragment_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new OriginBottomSheetDialogFragment()
                        .show(getSupportFragmentManager(), "OriginBottomSheetDialogFragment");
            }
        });
    }
}
