// Davin Carstens
// 220021333
package za.ac.cput.covidtracker;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PieChart19 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart19 pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> visitors = new ArrayList<PieEntry>();
        visitors.add(new PieEntry(508, "2018"));
        visitors.add(new PieEntry(508, "2019"));
        visitors.add(new PieEntry(508, "2020"));
        visitors.add(new PieEntry(508, "2021"));
        visitors.add(new PieEntry(508, "2022"));

        PieDataSet pieDataSet = new PieDataSet(visitors, "Visitors");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Visitors");

    }
}
