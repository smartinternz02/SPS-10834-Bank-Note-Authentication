package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis {
	
	public static void main(String args[])
	{
		System.out.println("DataAnalysis");
		
		try {
			Table bank_data = Table.read().csv("C:\\Users\\patte\\Desktop\\Final eclipse2\\org.ml\\src\\main\\java\\org\\ml\\data_banknote_authentication (1).csv");
			System.out.println(bank_data.shape());
			
			System.out.println(bank_data.first(4));
			System.out.println(bank_data.last(4));
			
			System.out.println(bank_data.structure());
			
			System.out.println(bank_data.summary());
			
			Layout layout1 = Layout.builder().title("Distribution of VARIANCE").build();
			HistogramTrace trace1= HistogramTrace.builder(bank_data.nCol("Variance")).build();
			Plot.show(new Figure(layout1,trace1));
			
			///Layout layout3 = Layout.builder().title("").build();
			///BoxTrace trace3= BoxTrace.builder(bank_data.categoricalColumn("Skewness"),bank_data.nCol("Variance")).build();
			///Plot.show(new Figure(layout3,trace3));
			
			Layout l2 = Layout.builder().title("Class Distribution").build();
			BoxTrace t2 = BoxTrace.builder(bank_data.categoricalColumn("Class"),bank_data.nCol("Skewness")).build();
			Plot.show(new Figure(l2,t2));
			
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
	}
	
  }

