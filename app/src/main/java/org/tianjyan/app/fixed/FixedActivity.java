package org.tianjyan.app.fixed;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.tianjyan.app.R;
import org.tianjyan.app.origin.OriginBottomSheetDialogFragment;

public class FixedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixed);

        findViewById(R.id.show_fragment_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FixedBottomSheetDialogFragment()
                        .show(getSupportFragmentManager(), "FixedBottomSheetDialogFragment");
            }
        });
    }

}
