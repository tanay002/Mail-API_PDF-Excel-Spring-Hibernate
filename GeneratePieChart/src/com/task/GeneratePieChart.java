package com.task;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.DefaultFontMapper;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;

public class GeneratePieChart 
{
	public static JFreeChart generatePieChart() {
		DefaultPieDataset dataSet = new DefaultPieDataset();
		dataSet.setValue("MCA", 19.64);
		dataSet.setValue("BE", 55.3);
		dataSet.setValue("MBA", 32.0);
		dataSet.setValue("Medical", 11.9);
		JFreeChart chart = ChartFactory.createPieChart(
				"Indias Education Degree Rate", dataSet, true, true, false);

		return chart;
	}
	public static void main(String[] args) throws Exception
	{
		//writeChartToPDF(generateBarChart(), 500, 400, "C://barchart.pdf");
		JFreeChart j=generatePieChart();
		ChartUtilities.
		saveChartAsJPEG(new File("chart2.jpg"),j,400,300);
	  
//	writeChartToPDF(generatePieChart(), 500, 400, "piechart.pdf");
	}
}
