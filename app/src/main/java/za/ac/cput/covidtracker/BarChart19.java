// Davin Carstens
// 220021333
package za.ac.cput.covidtracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BarChart19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart19 barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> visitors = new ArrayList<>()
        visitors.add(new BarEntry(2019, 660));
        visitors.add(new BarEntry(2020, 550));
        visitors.add(new BarEntry(2021, 630));
        visitors.add(new BarEntry(2022, 470));

        BarDataSet barDataSet = new BarDataSet(visitors, "Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("COVID-19 Statistics Over The Years")
    }
}
