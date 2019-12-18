package de.darmstadt.tu.crossing.rules;

import java.io.File;
import java.net.MalformedURLException;

import de.darmstadt.tu.crossing.reader.CrySLModelReader;

public class CrySLRuleReader {
	private static CrySLModelReader csmr;
	
	public static CrySLRule readFromSourceFile(File file) {
		if(csmr == null)
			try {
				csmr = new CrySLModelReader();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return csmr.readRule(file);
	}
	
}
