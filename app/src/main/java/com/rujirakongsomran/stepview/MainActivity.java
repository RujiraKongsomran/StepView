package com.rujirakongsomran.stepview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    VerticalStepView verticalStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalStepView = (VerticalStepView) findViewById(R.id.vertical_step_view);

        // Add Source
        List<String> sources = new ArrayList<>();
        sources.add("Start");
        sources.add("Analysis");
        sources.add("Design Database");
        sources.add("Design UI");
        sources.add("Coding");
        sources.add("Testing");
        sources.add("Review");
        sources.add("Delivery");
        sources.add("Maintenance");

        verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 2)
                .reverseDraw(false)
                .setStepViewTexts(sources)
                .setLinePaddingProportion(0.85f)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFFFF")) // Yellow when complete
                .setStepViewComplectedTextColor(Color.parseColor("#FFFFFF")) // Yellow when complete
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))
                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF")) // White
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon));
    }
}