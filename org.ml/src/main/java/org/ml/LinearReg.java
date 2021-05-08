package org.ml;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LinearReg {
		public static void main(String[] args) throws Exception {
			DataSource source =new DataSource("C:\\\\Users\\\\patte\\\\Desktop\\\\Final eclipse2\\\\org.ml\\\\src\\\\main\\\\java\\\\org\\\\ml\\\\data_banknote_authentication (1).csv");
			Instances dataset=source.getDataSet();
			dataset.setClassIndex(dataset.numAttributes()-1);
			//linear Regression
			LinearRegression lr=new LinearRegression();
			lr.buildClassifier(dataset);
			
			Evaluation lreval =new Evaluation(dataset);
		    lreval.evaluateModel(lr,dataset);
			System.out.println(lreval.toSummaryString());
			
	
		}

	}
